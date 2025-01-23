package ru.itis.inf403;

public class CalculateIntegralMiddle extends AbstractCalculateIntegral {
    public CalculateIntegralMiddle(double a,double b, Function f) {
        super(a,b,f);
    }

    public double get() {
        double s = 0;
        double h = (b-a) / N;
        s+=h*f.calculate(a+h/2);
        for (int i = 1; i < N; i++) {
            s+=h*f.calculate(a+((h*i)+h/2));
        }
        return s;
    }
}
