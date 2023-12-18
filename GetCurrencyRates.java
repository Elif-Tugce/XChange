import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Calculator
 */

public class GetCurrencyRates {

    public static double calculateLatest(String currencyFromCode, String currencyToCode) throws Exception {
        Double x = GetRatesAPI.requestLatest(currencyFromCode);
        Double y = GetRatesAPI.requestLatest(currencyToCode);
        return y/x;
    }

    public static ArrayList<Double> calculateHistorical(String currencyFromCode, String currencyToCode, LocalDate startDate, LocalDate endDate) {
        ArrayList<Double> values = new ArrayList<Double>();
        ArrayList<Double> fromValues = Database.getCurrencyValuesBetween(currencyFromCode, startDate, endDate);
        ArrayList<Double> toValues = Database.getCurrencyValuesBetween(currencyToCode, startDate, endDate);

        int valuesSize;
        if (fromValues.size() > toValues.size()) {
            valuesSize = toValues.size();
        }
        else {
            valuesSize = fromValues.size();
        }
        
        for (int i = 0; i < valuesSize; i++) {
            values.add(toValues.get(i) / fromValues.get(i));
        }

        return values;
    }

    public static ArrayList<LocalDate> getHistoricalDates(ArrayList<Double> values, LocalDate endDate) {
        ArrayList<LocalDate> dates = new ArrayList<LocalDate>();
        LocalDate startFrom = endDate.minusDays(values.size() - 1);

        for (int i = 0; i < values.size(); i++) {
            dates.add(startFrom);
            startFrom = startFrom.plusDays(1);
        }

        return dates;
    }

    //Ansar you can implement this to save missing last days to database in the format of USD/cur
    //There is a Database method getLatestDate which returns the latest date we have exchange rates
    //Also Database.getCurrencies returns codes of all currencies we have as an arraylist
    public static void saveHistoricalData() {

    }
    

}