import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONObject;
/*Read if you want to change or understand. Currency Calculator will call this first. There requestType must be defined which is either "latest"
or "historical/yyyy-mm-dd", and also a currency we are working with (IT SHOULD BE 3-4 letters string). After this is called it is added to database and then value is taken from
database using database connection. It sends one request each time, so for 1 month of data, Currency Calculator method will call this 30 times,
then take it from database*/
//TODO Fill url, username and password of database
public class GetCurrencyRate {
    String databaseUrl = "YOUR_DATABASE_URL";
    String username = "YOUR_DATABASE_USERNAME";
    String password = "YOUR_DATABASE_PASSWORD";
    public GetCurrencyRate(String requestType, String currency) {
        try {
            String jsonResponse = makeHttpRequest(requestType, currency);

            double currencyRate = parseJsonResponse(jsonResponse, currency);

            saveToDatabase(currencyRate, databaseUrl, username, password, currency);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String makeHttpRequest(String requestType, String currency) throws Exception {
        URL url = new URL("https://openexchangerates.org/api/" + requestType + ".json?app_id=81dad0d62cc44611882b6d8cf9508bc7&show_alternative=1&symbols="+currency);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");

        BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;

        while ((line = reader.readLine()) != null) {
            response.append(line);
        }

        reader.close();
        connection.disconnect();

        return response.toString();
    }

    private static double parseJsonResponse(String jsonResponse, String currency) {
        JSONObject json = new JSONObject(jsonResponse);
        return json.getJSONObject("rates").getDouble(currency);
    }

    private static void saveToDatabase(double currencyRate, String databaseUrl, String username, String password, String currency) throws Exception {
        Connection connection = DriverManager.getConnection(databaseUrl, username, password);

        // Replace "currency_table" with our actual table name or leave it
        String insertQuery = "INSERT INTO currency_table (currency_name, rate, date) VALUES (?, ?, ?)";

        try (PreparedStatement preparedStatement = connection.prepareStatement(insertQuery)) {
            // Replace "USD" with the actual currency name
            preparedStatement.setString(1, currency);
            preparedStatement.setDouble(2, currencyRate);

            // Format date as per your requirement
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String dateStr = sdf.format(new Date());

            preparedStatement.setString(3, dateStr);

            preparedStatement.executeUpdate();
        } finally {
            connection.close();
        }
    }
}

