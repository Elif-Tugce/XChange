import java.util.Date;

public class Graph {
 
    String graphName;
    String graphDescription;
    int graphImportance;
    Date dateCreated;
    String curFromCode;
    String curToCode;
    Date startDate;
    Date endDate;
    String imagePath;

    public Graph(String curFromCode, String curToCode, Date startDate, Date endDate) {
        this.curFromCode = curFromCode;
        this.curToCode = curToCode;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Graph(String graphName, String graphDescription, int graphImportance, Date dateCreated, String curFromCode, String curToCode, Date startDate, Date endDate, String imagePath) {
        this.graphName = graphName;
        this.graphDescription = graphDescription;
        this.graphImportance = graphImportance;
        this.dateCreated = dateCreated;
        this.curFromCode = curFromCode;
        this.curToCode = curToCode;
        this.startDate = startDate;
        this.endDate = endDate;
        this.imagePath = imagePath;
    }

    public Graph(String graphName, String graphDescription, int graphImportance) {
        this.graphName = graphName;
        this.graphDescription = graphDescription;
        this.graphImportance = graphImportance;
        
    }

    public String getCurFromCode() {
        return curFromCode;
    }

    public String getCurToCode() {
        return curToCode;
    }
    public Date getDateCreated() {
        return dateCreated;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getGraphDescription() {
        return graphDescription;
    }

    public int getGraphImportance() {
        return graphImportance;
    }

    public String getGraphName() {
        return graphName;
    }

    public String getImagePath() {
        return imagePath;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setCurFromCode(String curFromCode) {
        this.curFromCode = curFromCode;
    }

    public void setCurToCode(String curToCode) {
        this.curToCode = curToCode;
    }
}