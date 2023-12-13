import java.sql.Statement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {
    
    private static Connection connection = DatabaseConnection.connectDatabase();

    public static void main(String[] args) {
        User user = getUser("xyz");
        System.out.println(user.getUserID());
        System.out.println(user.getUserName());
        System.out.println(user.getFirstName());
        System.out.println(user.getLastName());
        System.out.println(user.getMothersName());
        System.out.println(user.getFavouriteColor());
        System.out.println(user.getDefaultFrom().getCurrencyID());
        System.out.println(user.getDefaultTo().getCurrencyID());
        System.out.println(user.getDarkModeOn());
    }

    public static int getMaxID() {
        try {
            Statement st = connection.createStatement();
            String sql = "SELECT MAX(UserID) FROM Users";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                int maxID = rs.getInt(1);
                return maxID;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static void insertNewUser(User user) {
        int darkModeOn;
        if (user.getDarkModeOn()) {
            darkModeOn = 1;
        }
        else {
            darkModeOn = 0;
        }
        try {
            Statement st = connection.createStatement();
            String sql = "INSERT INTO Users (UserID, UserName, UserPassword, FirstName, LastName, MothersName, FavouriteColor, DefaultCurrencyFrom, DefaultCurrencyTo, DarkModeOn)"
                       + "SELECT " + user.getUserID() + ", '" + user.getUserName() + "', '" + user.getPassword() + "', '" + user.getFirstName() + "', '" + user.getLastName() + "', '" + user.getMothersName() + "', '" + user.getFavouriteColor() + "', " + user.getDefaultFrom().getCurrencyID() + ", " + user.getDefaultTo().getCurrencyID() + " ," + darkModeOn;
            st.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static User getUser(String userName) {
        int userID = 0;
        String password = "";
        String firstName = "";
        String lastName = "";
        String mothersName = "";
        String favouriteColor = "";
        int defaultFromID = 0;
        int defaultToID = 0;
        int darkModeOn = 0;
        try {
            Statement st = connection.createStatement();
            String sql = "SELECT * FROM Users WHERE UserName = '" + userName + "'";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                userID = rs.getInt(1);
                userName = rs.getString(2);
                password = rs.getString(3);
                firstName = rs.getString(4);
                lastName = rs.getString(5);
                mothersName = rs.getString(6);
                favouriteColor = rs.getString(7);
                defaultFromID = rs.getInt(8);
                defaultToID = rs.getInt(9);
                darkModeOn = rs.getInt(10);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        CurrencyCalculation defaultFrom = getCurrencyByID(defaultFromID);
        CurrencyCalculation defaultTo = getCurrencyByID(defaultToID);
        boolean isDarkModeOn;
        if (darkModeOn == 0) {
            isDarkModeOn = false;
        }
        else {
            isDarkModeOn = true;
        }
        return new User(userID, userName, password, firstName, lastName, mothersName, favouriteColor, defaultFrom, defaultTo, isDarkModeOn);
    }

    public static CurrencyCalculation getCurrencyByID(int currencyID) {
        String currencyCode = "";
        String currencyName = "";
        String flagPath = "";
        try {
            Statement st = connection.createStatement();
            String sql = "SELECT * FROM CurrencyDefinition WHERE CurrencyID = " + currencyID;
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                currencyID = rs.getInt(1);
                currencyCode = rs.getString(2);
                currencyName = rs.getString(3);
                flagPath = rs.getString(4);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return new CurrencyCalculation(currencyID, currencyCode, currencyName, flagPath);
    }

    /*public static void insertNewGraph(Graph graph, int UserID) {

    }

    public static double[] getValuesByDate(int currencyID, Date dateFrom, Date dateTo) {

    }

    public static double getTodaysValue(int currencyID) {

    }*/

    /*public static void insertValueByDate(int currencyID, String currencyCode, String currencyName) {
        try {
            Statement st = connection.createStatement();
            String sql = "INSERT INTO CurrencyDefinition (CurrencyID, CurrencyCode, CurrencyName) SELECT " + currencyID + ", " + currencyCode + ", " + currencyName;
            st.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /*public static boolean checkUserName(String userName) {
        
    }

    public static boolean checkPassword(String userName, String password) {

    }*/
}
