import java.net.URL;
import java.time.LocalDate;
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
    private TableColumn<TableObject, LocalDate> dateColumn;

    @FXML
    private TableColumn<TableObject, String> descriptionColumn = new TableColumn<>();

    @FXML
    private TableColumn<TableObject, String> downloadColumn;

    @FXML
    private TableColumn<TableObject, String> viewColumn;

    @FXML
    private TableColumn<TableObject, String> nameColumn = new TableColumn<>();

    @FXML
    private TableColumn<TableObject, String> removeColumn;

    @FXML
    private TableColumn<TableObject, String> fromColumn;

    @FXML
    private TableColumn<TableObject, String> toColumn;

    @FXML
    private TableColumn<TableObject, Integer> importanceColumn;

    @FXML
    private LineChart<TableObject, String> MyGraph;

    @FXML
    private TableView<TableObject> MyGraphsTable;

    private final ObservableList<TableObject> data = FXCollections.observableArrayList();

    private ArrayList<Button> viewButtons = new ArrayList<Button>();

    private ArrayList<Button> downloadButtons = new ArrayList<Button>();

    private ArrayList<Button> removeButtons = new ArrayList<Button>();


    public void addToTable() {
        ArrayList<Graph> graphs = Navigator.getUser().getGraphs();
    
        // Clearing items in the TableView before adding new data
        MyGraphsTable.getItems().clear();
    
        // Assuming nameColumn, descriptionColumn, etc. are TableColumn instances associated with MyGraphsTable
        // Make sure these TableColumn instances are defined and associated correctly with FXML or in code.
    
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name")); // Replace "name" with the actual property name in TableObject
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description")); // Replace "description" with the actual property name in TableObject
        // Repeat the above lines for other columns as well
    
        for (Graph graph : graphs) {
            viewButtons.add(new Button());
            downloadButtons.add(new Button());
            removeButtons.add(new Button());
            TableObject newData = new TableObject(graph.getGraphName(), graph.getGraphDescription(), graph.getDateCreated(), graph.getGraphImportance(), graph.getCurFromCode(), graph.getCurToCode(), viewButtons.get(viewButtons.size() - 1), downloadButtons.get(downloadButtons.size() - 1), removeButtons.get(removeButtons.size() - 1));
            MyGraphsTable.getItems().add(newData);
            System.out.println(graph.getGraphName() + graph.getGraphDescription() + graph.getDateCreated() + graph.getGraphImportance() + graph.getCurFromCode() + graph.getCurToCode() + viewButtons.get(viewButtons.size() - 1) + downloadButtons.get(downloadButtons.size() - 1) + removeButtons.get(removeButtons.size() - 1));
        }
    }

}
