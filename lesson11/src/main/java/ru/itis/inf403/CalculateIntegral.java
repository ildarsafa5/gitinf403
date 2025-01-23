package ru.itis.inf403;

public class CalculateIntegral extends AbstractCalculateIntegral{
    public CalculateIntegral(double a, double b, Function f) {
        super(a,b,f);
    }

    public double get() {
        double s = 0;
        double h = (b-a) / N;
        for (int i = 0; i < N; i++) {
            s+=h*(f.calculate(a+h*i)+f.calculate(a+h*(i+1))/2);
        }
        return s;
    }
}
