import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class CreateGraphController {

    private Stage stage;
    private Scene scene;
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private AnchorPane createAnchorPane;

    @FXML
    private URL location;

    @FXML
    void amountDropDownAction(ActionEvent event) {

    }

    @FXML
    void changeButtonAction(MouseEvent event) {

    }

    @FXML
    void convertedAmountDropDownAction(ActionEvent event) {

    }

    @FXML
    void downloadButtonAction(MouseEvent event) {

    }

    @FXML
    void generateNowButtonAction(MouseEvent event) {

    }

    @FXML
    void saveButtonAction(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SaveGraphFrame.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen(); 
        stage.show();
    }

    @FXML
    void initialize() {

    }

}
