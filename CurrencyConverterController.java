import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyEvent;
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
    private TextField fromCurreencyTextField;

    @FXML
    private Label toCurreencyLabelField;

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

    ArrayList<String> infoBoxes;

    double theRate = 1.5;

    @FXML
    void initialize() throws Exception {

        infoBoxes = getRandomInfo();

        //theRate = GetCurrencyRates.latest(Navigator.getUser().getCurDefaultFrom(), Navigator.getUser().getCurDefaultTo());
        fromCurreencyTextField.setText("1");
        toCurreencyLabelField.setText("" + theRate);

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
    void fromCurrencyDropdownAction(ActionEvent event) throws Exception {
        String imagePath = Database.getCurrencyFlag((String)convertFromBox.getValue());
        File file = new File(imagePath);
        Image image = new Image(file.toURI().toString());
        fromCurrencyFlag.setImage(image);

        //theRate = GetCurrencyRates.latest((String)convertFromBox.getValue(), (String)convertToBox.getValue());
    }

    @FXML
    void toCurrencyDropdownAction(ActionEvent event) throws Exception {
        String imagePath2 = Database.getCurrencyFlag((String)convertToBox.getValue());
        File file2 = new File(imagePath2);
        Image image2 = new Image(file2.toURI().toString());
        toCurrencyFlag.setImage(image2);

        //theRate = GetCurrencyRates.latest((String)convertFromBox.getValue(), (String)convertToBox.getValue());
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

        fromCurreencyTextField.setText(toCurreencyLabelField.getText());
        toCurreencyLabelField.setText(" "+Double.parseDouble(fromCurreencyTextField.getText()) * theRate);
    }

    @FXML
    void currencyConverterAmountListener(KeyEvent event) {

        if (fromCurreencyTextField.getText() == null) {

            fromCurreencyTextField.setText("");
        }
        else if (!isValidInput(fromCurreencyTextField.getText())) {
            event.consume();
    }

    else {
            toCurreencyLabelField.setText("" + (theRate * Double.parseDouble(fromCurreencyTextField.getText())));
        }
       
    }

    public static ArrayList<String> getRandomInfo() {
        ArrayList<String> allInfo = new ArrayList<String>();
        ArrayList<String> randomInfo = new ArrayList<String>();

        try {
            Scanner sc = new Scanner(new File("information.txt"));
            
            while (sc.hasNextLine()) {
                if (sc.nextLine().equals("")) {
                    break;
                }
                allInfo.add(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Random rand = new Random();
        for (int i = 0; i < 3; i++) {
            int index = rand.nextInt(allInfo.size());
            randomInfo.add(allInfo.get(index));
            allInfo.remove(index);
        }

        return randomInfo;
    }

    private boolean isValidInput(String text) {
        try {
            Double.parseDouble(text);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
