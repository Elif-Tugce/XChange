/**
 * Authentication
 */
public class Authentication {

    //1: username and password are correct, proceed to the next page
    //2: empty value
    //3: username does not exist
    //4: password is wrong
    public static int userSignIn(String userName, String password) {
        if (userName == null || password == null) {
            return 2;
        }
        if (Database.checkUsername(userName)) {
            if (Database.checkPassword(userName, password)) {
                //also gets the user, where are we going to store the user? navigator?
                return 1;
            }
            else {
                return 4;
            }
        }
        else {
            return 3;
        }
    }

    //1: create user, proceed to the next page
    //2: empty value
    //3: username already exists
    //4: repeated password is wrong
    public static int userSignUp(String userName, String password, String repeatPassword, String firstName, String lastName, String mothersName, String favouriteColor) {
        if (userName == null || password == null || repeatPassword == null || firstName == null || lastName == null || mothersName == null || favouriteColor == null) {
            return 2;
        }
        if (!Database.checkUsername(userName)) {
            if (password.equals(repeatPassword)) {
                //creates user, same problem as above
                return 1;
            }
            else {
                return 4;
            }
        }
        else {
            return 3;
        }
    }

    //1: correct values, change password
    //2: empty value
    //3: username does not exist
    //4: wrong security answer
    public static int forgotPassword(String userName, String mothersName, String favouriteColor, String newPassword) {
        if (userName == null || mothersName == null || favouriteColor == null || newPassword == null) {
            return 2;
        }
        if (Database.checkUsername(userName)) {
            if (Database.checkMothersName(userName, mothersName) && Database.checkFavouriteColor(userName, favouriteColor)) {
                //changes password
                return 1;
            }
            else {
                return 4;
            }
        }
        else {
            return 3;
        }
    }


}