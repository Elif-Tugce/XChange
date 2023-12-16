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
    
    
    @FXML
    void fromDefaultDropDownAction(ActionEvent event) {

    }


    @FXML
    void toDefaultDropDownAction(ActionEvent event) {

    }

    @FXML
    void visibilityAction(MouseEvent event) {
        if (darkRadioButton.isSelected()) {
            System.out.println("ney");
        }
        else{
            System.out.println("2");
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
        if (Navigator.getUser().getDarkModeOn()) {
            darkRadioButton.setSelected(true);
        }
    }


}
