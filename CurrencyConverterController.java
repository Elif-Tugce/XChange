import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class CurrencyConverterController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private URL location;

    @FXML
    private Label welcomeText;

    @FXML
    void amountDropDownAction(ActionEvent event) {

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
