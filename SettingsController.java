import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SplitMenuButton;
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
    private Label firstNameLabel;

    @FXML
    private Label firstNameText;

    @FXML
    private SplitMenuButton fromDropdownBox;

    @FXML
    private Label fromText;

    @FXML
    private Label lastNameLabel;

    @FXML
    private Label lastNameText;

    @FXML
    private RadioButton lightRadioButton;

    @FXML
    private ImageView moneyImage;

    @FXML
    private PasswordField newPasswordLabel;

    @FXML
    private Label newPasswordText;

    @FXML
    private PasswordField oldPasswordLabel;

    @FXML
    private Label oldPasswordText;

    @FXML
    private Label profileText;

    @FXML
    private PasswordField repeatPasswordLabel;

    @FXML
    private Label repeatPasswordText;

    @FXML
    private AnchorPane settingsAnchorPane;

    @FXML
    private AnchorPane settingsBacground;

    @FXML
    private SplitMenuButton toDropdownBox;

    @FXML
    private Label toText;

    @FXML
    private Label usernameLabel;

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
    void initialize() {

    }

    Label getFirstNameLabel(){
        return firstNameLabel;
    }
}
