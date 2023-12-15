import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
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
    void visibilityDropDownAction(ActionEvent event) {

    }

    @FXML
    void changePasswordButtonAction(ContextMenuEvent event) {
        // if (newPasswordField.getText().toString().equals(repeatPasswordField.getText().toString())) {
        //     Navigator.getUser().setPassword(newPasswordField.getText());
        //     wrongPassword.setText("Succesfully changed");
        //     wrongPassword.textFillProperty();
        // }
        // else{
        //     wrongPassword.setText("Retry to change the password");
        // }
        //NOT WORKING GIVING ARGUMENT TYPE MISTMATCH ERROR
    }

    @FXML
    void initialize() {
        final ToggleGroup group = new ToggleGroup();
        darkRadioButton.setToggleGroup(group);
        lightRadioButton.setToggleGroup(group);

        Navigator.setUser(new User(0, "null", "null", "null", "nulll", "null", "null", null, null, true));
        firstNameTextField.setText(Navigator.getUser().getFirstName());
        lastNameTextField.setText(Navigator.getUser().getLastName());
        usernameTextField.setText(Navigator.getUser().getUserName());
        oldPasswordField.setText(Navigator.getUser().getPassword());
        if (Navigator.getUser().getDarkModeOn()) {
            darkRadioButton.setSelected(true);
        }
    }


}
