package XChange;

/**
 * User
 */
public class User {
    int userKey;
    String userName;
    String password;
    String name;
    String surname;
    String motherName;
    String favouriteColor;
    CurrencyCalculation defaultCurrFrom;
    CurrencyCalculation defaultCurrTo;
    boolean isDarkMode;
    Graph[] userGraphs = new Graph[50];

    public User(){

    }

    public void setVisibility(){

    }
    
}