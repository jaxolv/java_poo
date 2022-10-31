package util;

public class CurrencyConvertor {
    public static final double IOF = 6.0 / 100.0;

    public static double conversor(double dollar, double value) {
        return dollar * value + (dollar * value) * IOF;
    }
}
