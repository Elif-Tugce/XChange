import java.net.HttpURLConnection;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Date;
import org.json.JSONObject;

public class GetRatesAPI {

    public static double requestLatest(String currency) throws Exception {
        URL url = new URL("https://openexchangerates.org/api/latest.json?app_id=81dad0d62cc44611882b6d8cf9508bc7&show_alternative=1&symbols="+currency);
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

        return parseJsonResponse(response.toString(), currency);
    }

    public static double requestHistorical(LocalDate date, String currency) throws Exception {
        URL url = new URL("https://openexchangerates.org/api/historical/" + date + ".json?app_id=81dad0d62cc44611882b6d8cf9508bc7&show_alternative=1&symbols="+currency);
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

        return parseJsonResponse(response.toString(), currency);
    }

    private static double parseJsonResponse(String jsonResponse, String currency) {
        JSONObject json = new JSONObject(jsonResponse);
        return json.getJSONObject("rates").getDouble(currency);
    }
}

