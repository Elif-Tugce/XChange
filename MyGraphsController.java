import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class MyGraphsController{

    @FXML
    private ResourceBundle resources;

    @FXML
    private AnchorPane myGraphAnchorPane;

    @FXML
    private URL location;

    @FXML
    private LineChart<?, ?> MyGraph;

    @FXML
    private TableColumn<TableObject, String> gName;

    @FXML
    private TableColumn<TableObject, String> gDescription;

    @FXML
    private TableColumn<TableObject, Integer> gImportance;

    @FXML
    private TableView<TableObject> MyGraphsTable;

    private final ObservableList<TableObject> data = FXCollections.observableArrayList();

    private ArrayList<Button> viewButtons;

    private ArrayList<Button> downloadButtons;

    private ArrayList<Button> removeButtons;


    public void addToTable(){
        ArrayList<Graph> graphs = Navigator.getUser().getGraphs();
        for (int i = 0; i < graphs.size(); i++) {
            Graph graph = graphs.get(i);
            viewButtons.add(new Button());
            downloadButtons.add(new Button());
            removeButtons.add(new Button());
            data.add(new TableObject(graph.getGraphName(), graph.getGraphDescription(), graph.getDateCreated(), graph.getGraphImportance(), graph.getCurFromCode(), graph.getCurToCode(), viewButtons.get(i), downloadButtons.get(i), removeButtons.remove(i)));
            MyGraphsTable.setItems(data);
        }
    }

}
