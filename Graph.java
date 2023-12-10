package XChange;
import java.util.Date;

/**
 * Graph
 */
public class Graph {
    Date dateFrom;
    Date dateTo;
    CurrencyCalculation currencyFrom;
    CurrencyCalculation currencyTo;
    String graphName;
    String graphDescription;
    int graphImportance;
    Date dateCreated;
    String imageAddress;
    double ratesToDollarByDay;


    public Graph(CurrencyCalculation currencyFrom, CurrencyCalculation currencyTo, Date dateFrom, Date dateTo){

    }

    public Graph(CurrencyCalculation currencyFrom, CurrencyCalculation currencyTo, Date dateFrom, Date dateTo, String graphName, String graphDescription, int graphImportance, Date dateCreated, String imageAddress){

    }

    public void drawGraph(){

    }

    public void saveGraph(){

    }

    public void downloadGraph(){

    }
}