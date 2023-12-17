import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;

public class SettingsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    //------------------------------------------------------------------------------------------------------------------------------------------

    
    @FXML
    private Button changePasswordButton;

    @FXML
    private Button applyChangesButton;

    @FXML
    private AnchorPane changePasswordPane;

    @FXML
    private Label changePasswordText;

    @FXML
    private ImageView coinImage;

    @FXML
    private RadioButton darkRadioButton;

    @FXML
    private Label defaultText;

    @FXML
    private TextField firstNameTextField;

    @FXML
    private Label firstNameText;

    @FXML
    private ChoiceBox fromDropdownBox;

    @FXML
    private Label fromText;

    @FXML
    private Label wrongPassword;

    @FXML
    private TextField lastNameTextField;

    @FXML
    private Label lastNameText;

    @FXML
    private Label applyChangesLabel;

    @FXML
    private RadioButton lightRadioButton;

    @FXML
    private ImageView moneyImage;

    @FXML
    private PasswordField newPasswordField;

    @FXML
    private Label newPasswordText;

    @FXML
    private PasswordField oldPasswordField;

    @FXML
    private Label oldPasswordText;

    @FXML
    private Label profileText;

    @FXML
    private PasswordField repeatPasswordField;

    @FXML
    private Label repeatPasswordText;

    @FXML
    private AnchorPane settingsAnchorPane;

    @FXML
    private AnchorPane settingsBacground;

    @FXML
    private ChoiceBox toDropdownBox;

    @FXML
    private Label toText;

    @FXML
    private TextField usernameTextField;

    @FXML
    private Label usernameText;

    @FXML
    private Label visibilityText;


    public RadioButton getLightRadioButton(){
        return lightRadioButton;
    }
    public RadioButton getDarkRadioButton(){
        return darkRadioButton;
    }

    public void darkMode(){
        changePasswordText.setStyle("-fx-text-fill: white");
        defaultText.setStyle("-fx-text-fill: white");
        firstNameText.setStyle("-fx-text-fill: white");
        fromText.setStyle("-fx-text-fill: white");
        wrongPassword.setStyle("-fx-text-fill: white");
        lastNameText.setStyle("-fx-text-fill: white");
        applyChangesLabel.setStyle("-fx-text-fill: white");
        newPasswordText.setStyle("-fx-text-fill: white");
        oldPasswordText.setStyle("-fx-text-fill: white");
        profileText.setStyle("-fx-text-fill: white");
        repeatPasswordText.setStyle("-fx-text-fill: white");
        settingsBacground.setStyle("-fx-background-color: #00072D");
        toText.setStyle("-fx-text-fill: white");
        usernameText.setStyle("-fx-text-fill: white");
        visibilityText.setStyle("-fx-text-fill: white");
    }

    public void lightMode(){
        changePasswordText.setStyle("-fx-text-fill: black");
        defaultText.setStyle("-fx-text-fill: black");
        firstNameText.setStyle("-fx-text-fill: black");
        fromText.setStyle("-fx-text-fill: black");
        wrongPassword.setStyle("-fx-text-fill: black");
        lastNameText.setStyle("-fx-text-fill: black");
        applyChangesLabel.setStyle("-fx-text-fill: black");
        newPasswordText.setStyle("-fx-text-fill: black");
        oldPasswordText.setStyle("-fx-text-fill: black");
        profileText.setStyle("-fx-text-fill: black");
        repeatPasswordText.setStyle("-fx-text-fill: black");
        settingsBacground.setStyle("-fx-background-color: #AFD3E2");
        toText.setStyle("-fx-text-fill: black");
        usernameText.setStyle("-fx-text-fill: black");
        visibilityText.setStyle("-fx-text-fill: black");
    }
    
    
    @FXML
    void fromDefaultDropDownAction(ActionEvent event) {

    }


    @FXML
    void toDefaultDropDownAction(ActionEvent event) {

    }

    @FXML
    void visibilityAction(MouseEvent event) {
        CreateGraphController createGraphController = new CreateGraphController();

        if (darkRadioButton.isSelected()) {
            Navigator.getUser().setDarkModeOn(1);
        }
        else{
            Navigator.getUser().setDarkModeOn(0);
        }

        if (Navigator.getUser().getDarkModeOn() == 1 || darkRadioButton.isSelected()){
            Database.updateDarkModeOn(Navigator.getUser().getUserID(), 1);
            darkMode();
        }
        else if((Navigator.getUser().getDarkModeOn() == 0 || lightRadioButton.isSelected())){
            Database.updateDarkModeOn(Navigator.getUser().getUserID(), 0);
            lightMode();
        }
    }

    @FXML
    void changePasswordButtonAction(ActionEvent event) {
        if (newPasswordField.getText().toString().equals(repeatPasswordField.getText().toString()) && Database.checkPassword(Navigator.getUser().getUserName(), oldPasswordField.getText())) {
            Navigator.getUser().setPassword(newPasswordField.getText());
            wrongPassword.setTextFill(Color.color(0, 1, 0));
            wrongPassword.setText("Succesfully changed");
        }
        else{
            wrongPassword.setTextFill(Color.color(1, 0, 0));
            wrongPassword.setText("Retry to change the password");
        }
        
    }

    @FXML
    void applyChangesButtonAction(MouseEvent event) {

        if (!usernameTextField.getText().equals(Navigator.getUser().getUserName()) && Database.checkUsername(usernameTextField.getText())) {
            applyChangesLabel.setTextFill(Color.color(1, 0, 0));
            applyChangesLabel.setText("Username already exist");
        }
        else {
            Navigator.getUser().setFirstName(firstNameTextField.getText());
            Navigator.getUser().setLastName(lastNameTextField.getText());
            Navigator.getUser().setUserName(usernameTextField.getText());
            wrongPassword.setTextFill(Color.color(0, 1, 0));
            applyChangesLabel.setText("Succesfully Changed");
        }
        
    }

    @FXML
    void initialize() {
        final ToggleGroup group = new ToggleGroup();
        darkRadioButton.setToggleGroup(group);
        lightRadioButton.setToggleGroup(group);

        firstNameTextField.setText(Navigator.getUser().getFirstName());
        lastNameTextField.setText(Navigator.getUser().getLastName());
        usernameTextField.setText(Navigator.getUser().getUserName());
        if (Navigator.getUser().getDarkModeOn() == 1) {
            Database.updateDarkModeOn(Navigator.getUser().getUserID(), 1);
            darkRadioButton.setSelected(true);
            darkMode();
        }
        else{
            Database.updateDarkModeOn(Navigator.getUser().getUserID(), 0);
            lightMode();
        }
    }


}
