package lab5.src.main;

public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }   
    public double divide(double a, double b) {

        if (b != 0) {
            return a / b;
        }
        else {
            return 0;
        }
    }
    public double sqrt(double a) {

        if (a >= 0) {
            return Math.sqrt(a);
        }
        else {
            return 0;
        }
    }
}