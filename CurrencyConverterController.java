import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class CurrencyConverterController{

    ObservableList<String> currencyList = FXCollections.observableArrayList("USD", "TL", "EUR", "USD", "TL", "EUR", "USD", "TL", "EUR", "USD", "TL", "EUR", "USD", "TL", "EUR", "USD", "TL", "EUR", "USD", "TL", "EUR", "USD", "TL", "EUR", "USD", "TL", "EUR", "USD", "TL", "EUR", "USD", "TL", "EUR");

    @FXML
    private ResourceBundle resources;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private URL location;

    @FXML
    private Label welcomeText;
    
    @FXML
    private ComboBox convertFromBox;

    @FXML
    private ComboBox convertToBox;

    @FXML
    void initialize() {
        welcomeText.setText("Welcome to XChange " + Navigator.getUser().getFirstName() + " " + Navigator.getUser().getLastName());
        convertFromBox.setValue(Navigator.getUser().getCurDefaultFrom());
        convertFromBox.setItems(currencyList);

        convertToBox.setValue(Navigator.getUser().getCurDefaultTo());
        convertToBox.setItems(currencyList);
    }
    
    @FXML
    void amountDropDownAction(ActionEvent event) {
    }

    @FXML
    void changeButtonListener(MouseEvent event) {

    }

    @FXML
    void currencyConverterAmountListener(InputMethodEvent event) {

    }

}
