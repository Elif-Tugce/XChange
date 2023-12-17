import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Database {
    
    private static Connection connection = DatabaseConnection.connectDatabase();

    public static void main(String[] args) {
        
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
        darkModeOn = user.getDarkModeOn();
        /*if (user.getDarkModeOn()) {
            darkModeOn = 1;
        }
        else {
            darkModeOn = 0;
        }*/
        try {
            Statement st = connection.createStatement();
            String sql = "INSERT INTO Users (UserID, UserName, UserPassword, FirstName, LastName, MothersName, FavouriteColor, DefaultCurrencyFrom, DefaultCurrencyTo, DarkModeOn)"
                       + "SELECT " + user.getUserID() + ", '" + user.getUserName() + "', '" + user.getPassword() + "', '" + user.getFirstName() + "', '" + user.getLastName() + "', '" + user.getMothersName() + "', '" + user.getFavouriteColor() + "', '" + user.getCurDefaultFrom() + "', '" + user.getCurDefaultTo() + "'," + darkModeOn;
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
        String defaultFromCode = "";
        String defaultToCode = "";
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
                defaultFromCode = rs.getString(8);
                defaultToCode = rs.getString(9);
                darkModeOn = rs.getInt(10);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        int isDarkModeOn;
        if (darkModeOn == 0) {
            isDarkModeOn = 0;
        }
        else {
            isDarkModeOn = 1;
        }
        return new User(userID, userName, password, firstName, lastName, mothersName, favouriteColor, defaultFromCode, defaultToCode, isDarkModeOn);
    }

    public static String getFlagPath(String currencyCode) {
        String flagPath = "";
        try {
            Statement st = connection.createStatement();
            String sql = "SELECT CurrencyFlagPath FROM CurrencyFlags WHERE CurrencyCode = '" + currencyCode + "'";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                flagPath = rs.getString(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flagPath;
    }

    public static void insertCurrency(String currencyCode, String flagPath) {
        try {
            Statement st = connection.createStatement();
            String sql = "INSERT INTO CurrencyFlags (CurrencyCode, CurrencyFlagPath) SELECT '" + currencyCode + "', '" + flagPath + "'";
            st.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<String> getCurrencies() {
        ArrayList<String> currencies = new ArrayList<String>();
        try {
            Statement st = connection.createStatement();
            String sql = "SELECT CurrencyCode FROM CurrencyFlags";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                currencies.add(rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return currencies;
    }
    
    public static void insertCurrencyValue(String currencyCode, java.util.Date date, double value) {
        Date sqlDate = new Date(date.getTime());
        try {
            Statement st = connection.createStatement();
            String sql = "INSERT INTO CurrencyValues (CurrencyCode, ValueDate, CurrencyValue) SELECT '" + currencyCode + "', '" + sqlDate.toString() + "', " + value;
            st.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static double getCurrencyValue(String currencyCode, java.util.Date date) {
        Date sqlDate = new Date(date.getTime());
        double value = 0;
        try {
            Statement st = connection.createStatement();
            String sql = "SELECT CurrencyValue FROM CurrencyValues WHERE CurrencyCode = '" + currencyCode + "' AND ValueDate = '" + sqlDate.toString() + "'";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                value = rs.getDouble(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return value;
    }

    public static void updateUserName(int userID, String userName) {
        try {
            Statement st = connection.createStatement();
            String sql = "UPDATE Users SET UserName = '" + userName + "' WHERE UserID = " + userID;
            st.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updatePassword(int userID, String password) {
        try {
            Statement st = connection.createStatement();
            String sql = "UPDATE Users SET UserPassword = '" + password + "' WHERE UserID = " + userID;
            st.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updatePassword(String userName, String password) {
        try {
            Statement st = connection.createStatement();
            String sql = "UPDATE Users SET UserPassword = '" + password + "' WHERE UserName = '" + userName + "'";
            st.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateFirstName(int userID, String firstName) {
        try {
            Statement st = connection.createStatement();
            String sql = "UPDATE Users SET FirstName = '" + firstName + "' WHERE UserID = " + userID;
            st.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateLastName(int userID, String lastName) {
        try {
            Statement st = connection.createStatement();
            String sql = "UPDATE Users SET LastName = '" + lastName + "' WHERE UserID = " + userID;
            st.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateDefaultTo(int userID, String defaultToCode) {
        try {
            Statement st = connection.createStatement();
            String sql = "UPDATE Users SET DefaultCurrencyTo = '" + defaultToCode + "' WHERE UserID = " + userID;
            st.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateDefaultFrom(int userID, String defaultFromCode) {
        try {
            Statement st = connection.createStatement();
            String sql = "UPDATE Users SET DefaultCurrencyFrom = '" + defaultFromCode + "' WHERE UserID = " + userID;
            st.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void updateDarkModeOn(int userID, int isDarkModeOn) {
        int darkModeOn;
        darkModeOn = isDarkModeOn;
        /*if (isDarkModeOn) {
            darkModeOn = 1;
        }
        else {
            darkModeOn = 0;
        }*/
        try {
            Statement st = connection.createStatement();
            String sql = "UPDATE Users SET DarkModeOn = " + darkModeOn + " WHERE UserID = " + userID;
            st.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //Check if username exists
    public static boolean checkUsername(String userName) {
        ArrayList<String> userNames = new ArrayList<String>();
        boolean userExists = false;
        try {
            Statement st = connection.createStatement();
            String sql = "SELECT UserName FROM Users";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                userNames.add(rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        for (String str : userNames) {
            if (str.equals(userName)) {
                userExists = true;
                break;
            }
        }
        return userExists;
    }

    //Check if password is correct
    public static boolean checkPassword(String userName, String password) {
        String userPassword = "";
        try {
            Statement st = connection.createStatement();
            String sql = "SELECT UserPassword FROM Users WHERE UserName = '" + userName + "'";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                userPassword = rs.getString(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return password.equals(userPassword);
    }

    //check if mothers name is correct
    public static boolean checkMothersName(String userName, String mothersName) {
        String userMothersName = "";
        try {
            Statement st = connection.createStatement();
            String sql = "SELECT MothersName FROM Users WHERE UserName = '" + userName + "'";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                userMothersName = rs.getString(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mothersName.equals(userMothersName);
    }

    //check if favourite color is correct
    public static boolean checkFavouriteColor(String userName, String favouriteColor) {
        String userFavouriteColor = "";
        try {
            Statement st = connection.createStatement();
            String sql = "SELECT FavouriteColor FROM Users WHERE UserName = '" + userName + "'";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                userFavouriteColor = rs.getString(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return favouriteColor.equals(userFavouriteColor);
    }

}
