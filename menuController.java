import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.SplitPane;
import javafx.scene.input.MouseEvent;

public class menuController {

    private Scene scene;

    @FXML
    private ResourceBundle resources;

   @FXML
    private SplitPane sp;


    @FXML
    private URL location;

    @FXML
    void aboutButtonListener(MouseEvent event) {

    }

    @FXML
    void convertCurrencyButtonListener(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("CurrencyConverter.fxml"));

        sp.getItems().add(2,root.lookup("#anchorPane"));
        
    }

    @FXML
    void createGraphButtonListener(MouseEvent event) throws IOException {
        


    }

    @FXML
    void helpButtonListener(MouseEvent event) {

    }

    @FXML
    void logOutButtonListener(MouseEvent event) {

    }

    @FXML
    void myGraphsButtonListener(MouseEvent event) {

    }

    @FXML
    void settingsButtonListener(MouseEvent event) {

    }

    @FXML
    void initialize() {

    }

}
