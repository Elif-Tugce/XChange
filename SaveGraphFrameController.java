import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.CloseAction;

import com.microsoft.sqlserver.jdbc.StringUtils;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
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
    private Label errorLabel;

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

        if (Navigator.getUser().checkGraphName(graphNameTextField.getText())) {
            errorLabel.setText("This graph name is already exist, try another name");
        }
        else if (!StringUtils.isNumeric(graphImportanceTextField.getText())) {
            errorLabel.setText("Importance value must be numeric");
        }
        else if (Integer.parseInt(graphImportanceTextField.getText()) >= 5 || Integer.parseInt(graphImportanceTextField.getText()) <= 1) {
            errorLabel.setText("Importance value must be between 1 and 5");
        }
        else{
            CreateGraphController.graphObjectGetter().saveGraph(graphNameTextField.getText(), Integer.parseInt(graphImportanceTextField.getText()), graphDescriptionTextField.getText());
            CreateGraphController.getStage().close();
        }
        
        
    }

    @FXML
    void initialize() {

    }


}
