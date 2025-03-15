package ru.itis.inf403;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputModel {
    public static double input() throws NotPositiveNumber,InputMismatchException,ArithmeticException {
        Scanner sc = new Scanner(System.in);
        double num =  sc.nextDouble();
        if(num > 0 ) {
            return num;
        } else {
          throw new NotPositiveNumber();
        }
    }
}
