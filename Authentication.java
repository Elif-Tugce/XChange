package XChange;
/**
 * Authentication
 */
public class Authentication {
    public String userName;
    public String currentPassword;
    public String newPassword;
    public String sequrityQuestionOne;
    public String sequrityQuestionTwo;


    public boolean userSignIn(){
        if (userName == userName/*After the equal there should be something like database.searchForUsername(userName) which w'll return true if there is such a name*/ && currentPassword == currentPassword
        /*Again there should be a search method l'ke database.searchForPassword(userName,password) wh'ch w'll return true if the userName has such a password */) {
            return true;
        }
        return false;
    }

    public void userSignUp(){//WE SHOULD add all the necessary 'nformat'ons for a user to database in this\ we should create a new user in database

    }

    public void forgotPassword(){
        if ( sequrityQuestionOne == sequrityQuestionOne && sequrityQuestionTwo == sequrityQuestionTwo
        /*database.user.sequrityQuestionOne == sequrityQuestionOne && database.user.sequrityQuestionTwo == sequrityQuestionTwo */) {
            currentPassword = newPassword;
        }
        /*OtherWise 't should g've an error message saying that your answers are incorrect */
    }


}