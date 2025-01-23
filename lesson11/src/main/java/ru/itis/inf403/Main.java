package ru.itis.inf403;

public class Main {
    public static void main(String[] args) {
        CalculateIntegralLeft left = new CalculateIntegralLeft(0, Math.PI/2,new Sinus());
        System.out.println(left.get());
        CalculateIntegralRight right = new CalculateIntegralRight(0,Math.PI/2,new Sinus());
        System.out.println(right.get());
        CalculateIntegralMiddle middle = new CalculateIntegralMiddle(0,Math.PI/2,new Sinus());
        System.out.println(middle.get());
        CalculateIntegral integral = new CalculateIntegral(0,Math.PI/2,new Sinus());
        System.out.println(integral.get());

    }


}