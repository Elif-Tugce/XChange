import java.util.ArrayList;

/**
 * User
 */
public class User {

    private int userID;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String mothersName;
    private String favouriteColor;
    private CurrencyCalculation defaultFrom;
    private CurrencyCalculation defaultTo;
    private boolean darkModeOn;
    private ArrayList<Graph> graphs;

    //constructor for first creation
    public User(String userName, String password, String firstName, String lastName, String mothersName, String favouriteColor) {
        this.userID = Database.getMaxID() + 1;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mothersName = mothersName;
        this.favouriteColor = favouriteColor;
        //this.defaultFrom =
        //this.defaultTo =
        darkModeOn = false;
        graphs = new ArrayList<Graph>();
        Database.insertNewUser(this);
    }

    //constructor for getting user from database
    public User(int userId, String userName, String password, String firstName, String lastName, String mothersName, String favouriteColor, CurrencyCalculation defaultFrom, CurrencyCalculation defaultTo, boolean darkModeOn) {
        this.userID = userId;
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mothersName = mothersName;
        this.favouriteColor = favouriteColor;
        this.defaultFrom = defaultFrom;
        this.defaultTo = defaultTo;
        this.darkModeOn = darkModeOn;
    }


    public CurrencyCalculation getDefaultFrom() {
        return defaultFrom;
    }

    public CurrencyCalculation getDefaultTo() {
        return defaultTo;
    }

    public String getFavouriteColor() {
        return favouriteColor;
    }

    public String getFirstName() {
        return firstName;
    }

    public ArrayList<Graph> getGraphs() {
        return graphs;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMothersName() {
        return mothersName;
    }

    public String getPassword() {
        return password;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public boolean getDarkModeOn() {
        return darkModeOn;
    }

    
}