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
    private Currency defaultFrom;
    private Currency defaultTo;
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
    public User(int userId, String userName, String password, String firstName, String lastName, String mothersName, String favouriteColor, Currency defaultFrom, Currency defaultTo, boolean darkModeOn) {
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

    public void setUserName(String userName) {
        this.userName = userName;
        Database.updateUserName(userID, userName);
    }

    public void setPassword(String password) {
        this.password = password;
        Database.updatePassword(userID, password);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        Database.updateFirstName(userID, firstName);
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        Database.updateLastName(userID, lastName);
    }

    public void setDefaultFrom(Currency defaultFrom) {
        this.defaultFrom = defaultFrom;
        Database.updateDefaultFrom(userID, defaultFrom);
    }

    public void setDefaultTo(Currency defaultTo) {
        this.defaultTo = defaultTo;
        Database.updateDefaultTo(userID, defaultTo);
    }

    public void setDarkModeOn(boolean darkModeOn) {
        this.darkModeOn = darkModeOn;
        Database.updateDarkModeOn(userID, darkModeOn);
    }

    public void addGraph(Graph graph) {
        graphs.add(graph);
    }

    public Currency getDefaultFrom() {
        return defaultFrom;
    }

    public Currency getDefaultTo() {
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