/**
 * Calculator
 */

import java.util.Date;

public class Calculator {

    /*We probably wont need this since we will get the current data from the API directly
    public static double calculateToday(Currency currencyFrom, Currency currencyTo, double amount) {
        return ((currencyTo.getRateToDollarToday() / currencyFrom.getRateToDollarToday()) * amount);
    }*/

    /*We also probably dont need this since we wont store all data daily
    public static double [] calculatePast (Currency currencyFrom, Currency currencyTo, Date dateFrom, Date dateTo) {

        double [] curToDollarFrom = currencyFrom.getRateToDollar(dateFrom, dateTo);
        double [] curToDollarTo = currencyTo.getRateToDollar(dateFrom, dateTo);
        double [] cur = new double[curToDollarFrom.length];

        for (int i = 0; i < cur.length; i++){
            cur [i] = curToDollarTo[i] / curToDollarFrom [i];
        }

        return cur;
    }*/
    
}