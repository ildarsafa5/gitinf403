package ru.itis.inf403;

public abstract class CalculateIntegral {
    private double a;
    private double b;
    private Function f;

    public CalculateIntegral() {
    }

    public CalculateIntegral(double a, double b, Function f) {
        this.a = a;
        this.b = b;
        this.f = f;
    }
    public abstract double get();

}
