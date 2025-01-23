package ru.itis.inf403;

public class CalculateIntegralRight extends AbstractCalculateIntegral{
    public CalculateIntegralRight(double a, double b, Function f) {
        super(a,b,f);
    }

    public double get() {
        double s = 0;
        double h = (b-a) / N;
        for (int i = 0; i < N; i++) {
            s+=h*f.calculate(b-h*i);
        }
        return s;
    }
}
