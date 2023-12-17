import java.io.File;
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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.io.File;

public class CurrencyConverterController{

    ObservableList<String> currencyList = FXCollections.observableArrayList();


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
    private ImageView fromCurrencyFlag;

    @FXML
    private ImageView toCurrencyFlag;

    @FXML
    void initialize() {

        String imagePath = Database.getCurrencyFlag(Navigator.getUser().getCurDefaultFrom());
        File file = new File(imagePath);
        Image image = new Image(file.toURI().toString());
        fromCurrencyFlag.setImage(image);

        String imagePath2 = Database.getCurrencyFlag(Navigator.getUser().getCurDefaultTo());
        File file2 = new File(imagePath2);
        Image image2 = new Image(file2.toURI().toString());
        toCurrencyFlag.setImage(image2);
        
        for (int i = 0; i < Navigator.getCurrencies().size(); i ++){
            currencyList.add(Navigator.getCurrencies().get(i));
        }

        welcomeText.setText("Welcome to XChange " + Navigator.getUser().getFirstName() + " " + Navigator.getUser().getLastName());
        convertFromBox.setValue(Navigator.getUser().getCurDefaultFrom());
        convertFromBox.setItems(currencyList);

        convertToBox.setValue(Navigator.getUser().getCurDefaultTo());
        convertToBox.setItems(currencyList);
    }

    
    @FXML
    void fromCurrencyDropdownAction(ActionEvent event) {
        String imagePath = Database.getCurrencyFlag((String)convertFromBox.getValue());
        File file = new File(imagePath);
        Image image = new Image(file.toURI().toString());
        fromCurrencyFlag.setImage(image);
    }

    @FXML
    void toCurrencyDropdownAction(ActionEvent event) {
        String imagePath2 = Database.getCurrencyFlag((String)convertToBox.getValue());
        File file2 = new File(imagePath2);
        Image image2 = new Image(file2.toURI().toString());
        toCurrencyFlag.setImage(image2);
    }

    @FXML
    void changeButtonListener(MouseEvent event) {
        ImageView tempForImage;
        Object tempForCurrency;

        tempForImage = fromCurrencyFlag;
        fromCurrencyFlag.setImage(toCurrencyFlag.getImage());
        toCurrencyFlag.setImage(tempForImage.getImage());

        tempForCurrency = convertFromBox.getValue();
        convertFromBox.setValue(convertToBox.getValue());
        convertToBox.setValue(tempForCurrency);
    }

    @FXML
    void currencyConverterAmountListener(InputMethodEvent event) {

    }

}
