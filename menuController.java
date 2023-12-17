import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class menuController {

    Parent aboutUsRoot;
    Parent helpRoot;
    Parent myGraphsRoot;
    Parent settingsRoot;

    private Scene scene;
    private Stage stage;


    @FXML
    private ResourceBundle resources;

   @FXML
    private SplitPane sp;

    @FXML
    private AnchorPane sideBarLeft;

    @FXML
    private Label usernameText;

    @FXML
    private AnchorPane allAnchorPane;


    @FXML
    private URL location;

    public menuController() throws IOException{
        aboutUsRoot = FXMLLoader.load(getClass().getResource("AboutUs.fxml"));
        helpRoot = FXMLLoader.load(getClass().getResource("Help.fxml"));
        myGraphsRoot = FXMLLoader.load(getClass().getResource("MyGraphs.fxml"));
        settingsRoot = FXMLLoader.load(getClass().getResource("Settings.fxml"));
    }

    @FXML
    void aboutButtonListener(MouseEvent event) throws IOException {
        //Parent root = FXMLLoader.load(getClass().getResource("AboutUs.fxml"));
        Node node = aboutUsRoot.lookup("#aboutUsAnchorPane");

        if(Navigator.getUser().getDarkModeOn() == 1){
            node.setStyle("-fx-background-color: #00072D");
        }
        else{
            node.setStyle("-fx-background-color: #AFD3E2");
        }

        sp.getItems().clear();
        sp.getItems().addAll(sideBarLeft , node);
    }

    @FXML
    void convertCurrencyButtonListener(MouseEvent event) throws IOException {
        Parent currencyConverterRoot = FXMLLoader.load(getClass().getResource("CurrencyConverter.fxml"));

        Node currencyNode = currencyConverterRoot.lookup("#currencyConverterAnchorPane");

        if(Navigator.getUser().getDarkModeOn() == 1){
            currencyNode.setStyle("-fx-background-color: #00072D");
        }
        else{
            currencyNode.setStyle("-fx-background-color: #AFD3E2");
        }

        sp.getItems().clear();
        sp.getItems().addAll(sideBarLeft ,currencyNode);
        
    }

    @FXML
    void createGraphButtonListener(MouseEvent event) throws IOException {
        Parent createGraphRoot = FXMLLoader.load(getClass().getResource("CreateGraph.fxml"));
        Node node = createGraphRoot.lookup("#createAnchorPane");

        if(Navigator.getUser().getDarkModeOn() == 1){
            node.setStyle("-fx-background-color: #00072D");
        }
        else{
            node.setStyle("-fx-background-color: #AFD3E2");
        }

        sp.getItems().clear();
        sp.getItems().addAll(sideBarLeft ,node);

    }

    @FXML
    void helpButtonListener(MouseEvent event) throws IOException {
        //Parent root = FXMLLoader.load(getClass().getResource("Help.fxml"));
        Node node = helpRoot.lookup("#helpAnchorPane");

        if(Navigator.getUser().getDarkModeOn() == 1){
            node.setStyle("-fx-background-color: #00072D");
        }
        else{
            node.setStyle("-fx-background-color: #AFD3E2");
        }

        sp.getItems().clear();
        sp.getItems().addAll(sideBarLeft ,node );

    }

    @FXML
    void logOutButtonListener(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SignIn.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    void myGraphsButtonListener(MouseEvent event) throws IOException {

        //Parent root = FXMLLoader.load(getClass().getResource("MyGraphs.fxml"));
        Node node = myGraphsRoot.lookup("#myGraphAnchorPane");

        if(Navigator.getUser().getDarkModeOn() == 1){
            node.setStyle("-fx-background-color: #00072D");
        }
        else{
            node.setStyle("-fx-background-color: #AFD3E2");
        }
        sp.getItems().clear();
        sp.getItems().addAll(sideBarLeft ,node );

    }

    @FXML
    void settingsButtonListener(MouseEvent event) throws IOException {
        //Parent root = FXMLLoader.load(getClass().getResource("Settings.fxml"));

        sp.getItems().clear();
        sp.getItems().addAll(sideBarLeft ,settingsRoot.lookup("#settingsAnchorPane") );


    }

    @FXML
    void initialize() throws IOException {
        usernameText.setText(Navigator.getUser().getFirstName() + " " + Navigator.getUser().getLastName());

        Parent currencyConverterRoot = FXMLLoader.load(getClass().getResource("CurrencyConverter.fxml"));

        Node currencyNode = currencyConverterRoot.lookup("#currencyConverterAnchorPane");

        if(Navigator.getUser().getDarkModeOn() == 1){
            currencyNode.setStyle("-fx-background-color: #00072D");
        }
        else{
            currencyNode.setStyle("-fx-background-color: #AFD3E2");
        }

        sp.getItems().clear();
        sp.getItems().addAll(sideBarLeft ,currencyNode);
    }

}
