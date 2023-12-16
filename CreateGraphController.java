import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javax.imageio.ImageIO;

import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.SnapshotParameters;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.image.WritableImage;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class CreateGraphController {

    private Stage stage;
    private Scene scene;
    
    @FXML
    private ResourceBundle resources;

    @FXML
    private AnchorPane createAnchorPane;

    @FXML
    private URL location;

    @FXML
    private LineChart<String, Number> linearChart;

    @FXML
    void amountDropDownAction(ActionEvent event) {

    }

    @FXML
    void changeButtonAction(MouseEvent event) {

    }

    @FXML
    void convertedAmountDropDownAction(ActionEvent event) {

    }

    @FXML
    void generateNowButtonAction(MouseEvent event) {

    }

    @FXML
    void downloadButtonAction(MouseEvent event) {

    LineChart<String, Number> linearChart = new LineChart<>(new CategoryAxis(), new NumberAxis());
    //SOME JUNK DATA FOR DOWNLOAD GRAPH!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.getData().add(new XYChart.Data<>("1 Jan 2022", 210));
        series.getData().add(new XYChart.Data<>("1 Feb 2022", 17));
        series.getData().add(new XYChart.Data<>("1 March 2022", 10));
        series.getData().add(new XYChart.Data<>("1 April 2022", 24));
        series.getData().add(new XYChart.Data<>("1 May 2022", 39));
        series.getData().add(new XYChart.Data<>("2 Jan 2022", 28));
        series.getData().add(new XYChart.Data<>("2 Feb 2022", 11));
        series.getData().add(new XYChart.Data<>("2 March 2022", 11));
        series.getData().add(new XYChart.Data<>("2 April 2022", 24));
        series.getData().add(new XYChart.Data<>("2 May 2022", 11));
        linearChart.getData().add(series);

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

    @FXML
    void saveButtonAction(MouseEvent event) throws IOException {
        FXMLLoader rootLoader = new FXMLLoader(getClass().getResource("SaveGraphFrame.fxml"));

        Parent root = rootLoader.load();

        Stage mainStage = new Stage();
        Stage popupStage = new Stage();

        popupStage.initOwner(mainStage);
        popupStage.setTitle("Save Graph");

        Scene popupScene = new Scene(root);
        popupStage.setScene(popupScene);
        popupStage.showAndWait();
    }

    @FXML
    void initialize() {

    }

}
