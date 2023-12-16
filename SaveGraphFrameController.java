import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class SaveGraphFrameController {

    private Stage stage;
    private Scene scene;

    @FXML
    private TextField graphNameTextField;

    @FXML
    private TextField graphDescriptionTextField;

    @FXML
    private TextField graphImportanceTextField;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;


    public Graph createGraphObject(){
        return new Graph();
    }
    
    @FXML
    void saveGraphButtonAction(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SaveGraphFrame.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.showAndWait();
    }

    @FXML
    void initialize() {

    }

}
