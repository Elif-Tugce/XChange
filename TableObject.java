import java.time.LocalDate;

import javafx.scene.control.Button;

public class TableObject {
    
    public String name;
    public String description;
    public LocalDate date;
    public int importance;
    public String currencyFrom;
    public String currencyTo;
    public Button view;
    public Button download;
    public Button remove;

    public TableObject(String name, String description, LocalDate date, int importance, String currencyFrom, String currencyTo, Button view, Button download, Button remove) {
        this.name = name;
        this.description = description;
        this.date = date;
        this.importance = importance;
        this.currencyFrom = currencyFrom;
        this.currencyTo = currencyTo;
        this.view = view;
        this.download = download;
        this.remove = remove;
    }

}
