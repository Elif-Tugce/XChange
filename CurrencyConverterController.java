import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class CurrencyConverterController{

    @FXML
    private ResourceBundle resources;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private URL location;

    @FXML
    private Label welcomeText;
    
    @FXML
    private ComboBox<String> dropDown;
    
    @FXML
    void amountDropDownAction(ActionEvent event) {
        for(int i = 0; i < 30; i++){
            dropDown.getItems().addAll(Navigator.getCurrencies().get(i));
        }
    }

    @FXML
    void changeButtonListener(MouseEvent event) {

    }

    @FXML
    void currencyConverterAmountListener(InputMethodEvent event) {

    }

    @FXML
    void initialize() {
        welcomeText.setText("Welcome to XChange " + Navigator.getUser().getFirstName() + " " + Navigator.getUser().getLastName());
    }

}
