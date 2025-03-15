package ru.itis.inf403;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x = 0;
        boolean flag = true;
        while(flag) {
            try {
                x = InputModel.input();
                flag = false;
                x = 1 / (int)x;
            } catch(InputMismatchException e) {
                System.out.println("Неправильный ввод, повторите");
            } catch (ArithmeticException e) {
                System.out.println("Введите отличное от 0 значение");
                flag = true;
            } catch (NotPositiveNumber e) {
                System.out.println("Число должно быть позитивным");
                flag = true;
            }
        }
        System.out.println(x);
    }
}
