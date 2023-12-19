import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.imageio.ImageIO;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.SnapshotParameters;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Tooltip;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;

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
    private TableColumn<TableObject, Button> downloadColumn;

    @FXML
    private TableColumn<TableObject, Button> viewColumn;

    @FXML
    private TableColumn<TableObject, String> nameColumn = new TableColumn<>();

    @FXML
    private TableColumn<TableObject, Button> removeColumn;

    @FXML
    private TableColumn<TableObject, String> fromColumn;

    @FXML
    private TableColumn<TableObject, String> toColumn;

    @FXML
    private TableColumn<TableObject, Integer> importanceColumn;

    @FXML
    private LineChart<String, Double> MyGraph;

    
    @FXML
    private TableView<TableObject> myGraphsTable;

    private final ObservableList<TableObject> data = FXCollections.observableArrayList();

    private ArrayList<Button> viewButtons = new ArrayList<Button>();

    private ArrayList<Button> downloadButtons = new ArrayList<Button>();

    private ArrayList<Button> removeButtons = new ArrayList<Button>();


    public void initialize() {

        importanceColumn.setCellValueFactory(new PropertyValueFactory<TableObject, Integer>("Importance"));
        downloadColumn.setCellValueFactory(new PropertyValueFactory<TableObject, Button>("Download"));
        removeColumn.setCellValueFactory(new PropertyValueFactory<TableObject, Button>("Remove"));
        viewColumn.setCellValueFactory(new PropertyValueFactory<TableObject, Button>("View"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<TableObject, String>("Name"));
        dateColumn.setCellValueFactory(new PropertyValueFactory<TableObject, LocalDate>("Date"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<TableObject, String>("Description"));
        fromColumn.setCellValueFactory(new PropertyValueFactory<TableObject, String>("currencyFrom"));
        toColumn.setCellValueFactory(new PropertyValueFactory<TableObject, String>("currencyTo"));

        ArrayList<Graph> graphs = Navigator.getUser().getGraphs();

        myGraphsTable.getItems().clear();
        myGraphsTable.setEditable(true);
    
        for (Graph graph : graphs) {
            viewButtons.add(new Button("View"));
            viewButtons.get(viewButtons.size() - 1).setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {        
                    LocalDate startDate = graph.getStartDate();
                    LocalDate endDate = graph.getEndDate();

                    ArrayList<Double> values = GetCurrencyRates.calculateHistorical(
                    graph.getCurFromCode(), graph.getCurToCode(), startDate, endDate);
                    ArrayList<LocalDate> dates = GetCurrencyRates.getHistoricalDates(values, endDate);

                    XYChart.Series<String, Double> series = new XYChart.Series<>();

                    MyGraph.getData().clear();

                    for (int i = 0; i < values.size(); i++) {
                        series.getData().add(new XYChart.Data<>(Integer.toString(i + 1), values.get(i)));
                    }

                    MyGraph.setCreateSymbols(false);
                    MyGraph.getData().add(series);

                    MyGraph.getXAxis().setTickLabelsVisible(false);

                    Tooltip tooltip = new Tooltip();
                    Tooltip.install(MyGraph, tooltip);

                    MyGraph.setOnMouseMoved(e -> {
                        double mouseX = e.getX();

                        String nearestDate = "";
                        Double nearestValue = null;
                        double nearestDistance = Double.MAX_VALUE;

                        for (XYChart.Series<String, Double> s : MyGraph.getData()) {
                            for (XYChart.Data<String, Double> d : s.getData()) {
                                double displayX = MyGraph.getXAxis().getDisplayPosition(d.getXValue());

                                double distance = Math.abs(displayX - mouseX);

                                if (distance < nearestDistance) {
                                    nearestDistance = distance;
                                    nearestDate = dates.get(Integer.parseInt(d.getXValue()) - 1).toString();
                                    nearestValue = d.getYValue();
                                }
                            }
                        }

                        if (nearestValue != null) {
                            tooltip.setText("Date: " + nearestDate + "\nValue: " + nearestValue);
                            tooltip.show(MyGraph, e.getScreenX(), e.getScreenY() + 20);
                        } else {
                            tooltip.hide();
                        }
                    });

                    MyGraph.setOnMouseExited(e -> {
                    tooltip.hide();
                    });

                }
            });

            downloadButtons.add(new Button("Download"));
            downloadButtons.get(downloadButtons.size() - 1).setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    CategoryAxis xAxis = new CategoryAxis();
                    NumberAxis yAxis = new NumberAxis(); 

                    LineChart<String, Number> linearChart = new LineChart<>(xAxis, yAxis);
                    LocalDate startDate = graph.getStartDate();
                    LocalDate endDate = graph.getEndDate();

                    ArrayList<Double> values = GetCurrencyRates.calculateHistorical(
                    graph.getCurFromCode(), graph.getCurToCode(), startDate, endDate);
                    ArrayList<LocalDate> dates = GetCurrencyRates.getHistoricalDates(values, endDate);

                    XYChart.Series<String, Number> series = new XYChart.Series<>();

                    linearChart.getData().clear();
                    yAxis.setForceZeroInRange(false);
                    linearChart.setHorizontalGridLinesVisible(false);
                    linearChart.setVerticalGridLinesVisible(false);
                    xAxis.setTickLabelsVisible(false);
                    xAxis.setTickMarkVisible(false);

                    for (int i = 0; i < values.size(); i++) {
                        series.getData().add(new XYChart.Data<>(Integer.toString(i + 1), values.get(i)));
                    }

                    linearChart.setCreateSymbols(false);
                    linearChart.getData().add(series);

                    linearChart.getXAxis().setTickLabelsVisible(false);

                    Group chartGroup = new Group(linearChart);

                    FileChooser fileChooser = new FileChooser();
                    fileChooser.setTitle("Save your linear graph");
                    fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("PNG Files", "*.png"));

                    File file = fileChooser.showSaveDialog(null);

                    if (file != null) {

                        WritableImage image = chartGroup.snapshot(new SnapshotParameters(), null);
                        try {
                            ImageIO.write(SwingFXUtils.fromFXImage(image, null), "png", file);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });

            removeButtons.add(new Button("Remove"));
            removeButtons.get(removeButtons.size() - 1).setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    Navigator.getUser().deleteGraph(graph.getGraphName());
                    myGraphsTable.getItems().remove(myGraphsTable.getSelectionModel().getSelectedIndex());
                    myGraphsTable.refresh();
                }
            });

            TableObject table = new TableObject(graph.getGraphName(), graph.getGraphDescription(), graph.getDateCreated(), graph.getGraphImportance(), graph.getCurFromCode(), graph.getCurToCode(), viewButtons.get(viewButtons.size() - 1), downloadButtons.get(downloadButtons.size() - 1), removeButtons.get(removeButtons.size() - 1));
            data.add(table);
            myGraphsTable.setItems(data);
        }
    }

}
