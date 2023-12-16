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
        FXMLLoader rootLoader = new FXMLLoader(getClass().getResource("SaveGraphFrame.fxml"));
        FXMLLoader parentLoader = new FXMLLoader(getClass().getResource("CreateGraph.fxml"));

        Parent root = rootLoader.load();
        Parent parent = parentLoader.load();
        Stage mainStage = new Stage();

        Stage popupStage = new Stage();
        popupStage.initOwner(mainStage);
        popupStage.setTitle("Save Graph");

        Scene popupScene = new Scene(root);
        popupStage.setScene(popupScene);
        popupStage.showAndWait();
    }

    @FXML
    void initialize() {

    }

}
