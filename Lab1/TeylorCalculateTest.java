import java.text.NumberFormat;


import static org.junit.jupiter.api.Assertions.*;

public class TeylorCalculateTest {
    @org.junit.jupiter.api.Test
    public void computeTaylorSeries1() {
        
        double x = 4.0;
        int k = 5;
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(k);
        double epsilon = Math.pow(10, -k);
        TeylorCalculate tc = new TeylorCalculate(k,x);
        double actualSum = tc.computeTaylorSeries(x, epsilon);
        
        double expectedSum = Math.exp(x);
        System.out.println("Сумма через расчет: " + formatter.format(expectedSum));
        
        double actualSum = Main.computeTaylorSeries(x, epsilon);
        System.out.println("Сумма через стандартную функцию: " + formatter.format(actualSum));

        assertTrue(Math.abs(actualSum-expectedSum)<epsilon);
    }
    @org.junit.jupiter.api.Test
    public void computeTaylorSeries2() {
       
        double x = 42.0;
        int k = 2;
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(k);
        double epsilon = Math.pow(10, -k);

      
        double expectedSum = Math.exp(x);
        System.out.println("Сумма через расчет: " + formatter.format(expectedSum));
        
        double actualSum = Main.computeTaylorSeries(x, epsilon);
        System.out.println("Сумма через стандартную функцию: " + formatter.format(actualSum));
       
        assertTrue(Math.abs(actualSum-expectedSum)<epsilon);
    }
    @org.junit.jupiter.api.Test
    public void computeTaylorSeries3() {
      
        double x = -2.0;
        int k = 8;
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(k);
        double epsilon = Math.pow(10, -k);

       
        double expectedSum = Math.exp(x);
        System.out.println("Сумма через расчет: " + formatter.format(expectedSum));
        
        double actualSum = Main.computeTaylorSeries(x, epsilon);
        System.out.println("Сумма через стандартную функцию: " + formatter.format(actualSum));
      
        assertTrue(Math.abs(actualSum-expectedSum)<epsilon);
    }
    @org.junit.jupiter.api.Test
    public void computeTaylorSeries4() {
        
        double x = -20.0;
        int k = 3;
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(k);
        double epsilon = Math.pow(10, -k);

       
        double expectedSum = Math.exp(x);
        System.out.println("Сумма через расчет: " + formatter.format(expectedSum));
      
        double actualSum = Main.computeTaylorSeries(x, epsilon);
        System.out.println("Сумма через стандартную функцию: " + formatter.format(actualSum));
        
        assertTrue(Math.abs(actualSum-expectedSum)<epsilon);
    }
    @org.junit.jupiter.api.Test
    public void computeTaylorSeries5() {
       
        double x = 10.0;
        int k = 10;
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMaximumFractionDigits(k);
        double epsilon = Math.pow(10, -k);

      
        double expectedSum = Math.exp(x);
        System.out.println("Сумма через расчет: " + formatter.format(expectedSum));
       
        double actualSum = Main.computeTaylorSeries(x, epsilon);
        System.out.println("Сумма через стандартную функцию: " + formatter.format(actualSum));
        
        assertTrue(Math.abs(actualSum-expectedSum)<epsilon);
    }
}
