/**
 * Calculator
 */

import java.util.Date;

public class Calculator {

    public static double calculateToday(CurrencyCalculation currencyFrom, CurrencyCalculation currencyTo, double amount) {
        return ((currencyTo.getRateToDollarToday() / currencyFrom.getRateToDollarToday()) * amount);
    }

    public static double [] calculatePast (CurrencyCalculation currencyFrom, CurrencyCalculation currencyTo, Date dateFrom, Date dateTo) {

        double [] curToDollarFrom = currencyFrom.getRateToDollar(dateFrom, dateTo);
        double [] curToDollarTo = currencyTo.getRateToDollar(dateFrom, dateTo);
        double [] cur = new double[curToDollarFrom.length];

        for (int i = 0; i < cur.length; i++){
            cur [i] = curToDollarTo[i] / curToDollarFrom [i];
        }

        return cur;
    }
    
}