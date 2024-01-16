import java.text.NumberFormat;
import java.text.*;
import java.util.Scanner;
public class TeylorCalculate {
    private int k;
    private double x;

    public TeylorCalculate(int k, double x) {
        this.k = k;
        this.x = x;
    }
    double epsilon = Math.pow(10, -k); 
    double taylorSum = computeTaylorSeries(x,epsilon);
    double standardExp = Math.exp(x);
    public double computeTaylorSeries(double x, double epsilon) {
        double sum = 1.0; 
        double term = 1.0; 
        int n = 1;

        while (Math.abs(term) >= epsilon) {
            term *= x / n;
            sum += term;
            n++;
        }
        return sum;
    }
}
