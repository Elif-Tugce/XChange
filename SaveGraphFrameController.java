import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.microsoft.sqlserver.jdbc.StringUtils;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class SaveGraphFrameController {

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

}
