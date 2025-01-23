package ru.itis.inf403;

public abstract class AbstractCalculateIntegral {
    protected double a;
    protected double b;
    protected Function f;
    protected static final int N = 1000;

    public AbstractCalculateIntegral() {
    }

    public AbstractCalculateIntegral(double a, double b, Function f) {
        this.a = a;
        this.b = b;
        this.f = f;
    }
    public abstract double get();

}
