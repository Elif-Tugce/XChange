/**
 * CurrencyCalculation
 */

import java.util.Calendar;
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
        //Ece, I am just looping and calling my code, nothing to worry about I think
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateFrom);
        calendar.add(Calendar.YEAR, 1);

        boolean useMonths = calendar.getTime().before(dateTo);

        // Loop through the dates
        calendar.setTime(dateFrom);
        while (!calendar.getTime().after(dateTo)) {
            Date currentDate = calendar.getTime();

            // Make API call for the current date
            new GetCurrencyRate("historical/" + currentDate, currencyCode);

            // Increment the date by 1 day or 1 month
            if (useMonths) {
                calendar.add(Calendar.MONTH, 1);
            } else {
                calendar.add(Calendar.DAY_OF_MONTH, 1);
            }
        }
        return DatabaseConnection.getValuesByDate(currencyID, dateFrom, dateTo);
    }
   
    public double getRateToDollarToday (){
        new GetCurrencyRate("latest", currencyCode);
        return DatabaseConnection.getTodaysValue(currencyID);
    }

    public int getCurrencyID() {
        return currencyID;
    }
    
}