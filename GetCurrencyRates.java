import java.util.Calendar;
import java.util.Date;

/**
 * Calculator
 */

public class GetCurrencyRates {

    public static double latest(String currencyFromCode, String currencyToCode) throws Exception {
        Double x = GetRatesAPI.requestLatest(currencyFromCode);
        Double y = GetRatesAPI.requestLatest(currencyToCode);
        return y/x;
    }

    public static double historical(Date dateFrom, Date dateTo, String currencyFromCode, String currencyToCode) throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateFrom);
        calendar.add(Calendar.YEAR, 1);

        boolean useMonths = calendar.getTime().before(dateTo);

        // Loop through the dates
        calendar.setTime(dateFrom);
        while (!calendar.getTime().after(dateTo)) {
            Date currentDate = calendar.getTime();

            // Make API call for the current date 
            Double x = GetRatesAPI.requestHistorical(currentDate, currencyFromCode);
            Double y = GetRatesAPI.requestHistorical(currentDate, currencyToCode);

            // Increment the date by 1 day or 1 month
            if (useMonths) {
                calendar.add(Calendar.MONTH, 1);
            } else {
                calendar.add(Calendar.DAY_OF_MONTH, 1);
            }
            return x/y;
        }
        return 0;
    }

}