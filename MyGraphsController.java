import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class MyGraphsController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private AnchorPane myGraphAnchorPane;

    @FXML
    private URL location;

    @FXML
    private LineChart<?, ?> MyGraph;

    @FXML
    private TableView<?> MyGraphsTable;

    @FXML
    void initialize() {
        assert MyGraph != null : "fx:id=\"MyGraph\" was not injected: check your FXML file 'MyGraphs.fxml'.";
        assert MyGraphsTable != null : "fx:id=\"MyGraphsTable\" was not injected: check your FXML file 'MyGraphs.fxml'.";

    }

}
