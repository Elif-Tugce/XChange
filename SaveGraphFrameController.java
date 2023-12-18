import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.ClosePath;
import javafx.stage.Stage;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class SaveGraphFrameController {

    //private Stage stage;
    //private Scene scene;

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

    
    
    @FXML
    void saveGraphButtonAction(MouseEvent event) throws IOException {
        CreateGraphController.getStage().close();
        CreateGraphController.graphObjectGetter().saveGraph(graphNameTextField.getText(), Integer.parseInt(graphImportanceTextField.getText()), graphDescriptionTextField.getText());
        
    }

    @FXML
    void initialize() {

    }


}
