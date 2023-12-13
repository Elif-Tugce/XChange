/**
 * CurrencyCalculation
 */

import java.util.Date;
public class CurrencyCalculation {

    private int currencyID;
    private String currencyCode;
    private String currencyName;
    private String currencyFlagPath;
    private double rateToDollar;

    public CurrencyCalculation (int currencyID, String currencyCode, String currencyName, String currencyFlagPath) {
        this.currencyID = currencyID;
        this.currencyCode = currencyCode;
        this.currencyName = currencyName;
        this.currencyFlagPath = currencyFlagPath;
    }

    public double [] getRateToDollar (Date dateFrom, Date dateTo) { 
        return DatabaseConnection.getValuesByDate(currencyID, dateFrom, dateTo);
    }
   
    public double getRateToDollarToday (){
        return DatabaseConnection.getTodaysValue(currencyID);
    }

    public int getCurrencyID() {
        return currencyID;
    }
    
}