import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ForgotPasswordController {

    private Stage stage;
    private Scene scene;
    
    @FXML
    private TextField favouriteColorTextField;

    @FXML
    private ImageView logoForFavouriteColor;

    @FXML
    private ImageView logoForMotherName;

    @FXML
    private ImageView logoForName;

    @FXML
    private ImageView logoForPassword;

    @FXML
    private ImageView logoForRepeatPassword;

    @FXML
    private ImageView mainLogo;

    @FXML
    private TextField motherNameTextField;

    @FXML
    private TextField nameTextField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private PasswordField repeatPasswordField;

    @FXML
    void changePasswordButtonListener(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SignIn.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
