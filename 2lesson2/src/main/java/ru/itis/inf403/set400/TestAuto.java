package ru.itis.inf403.set400;

public class TestAuto {
    public static void main(String[] args) {
        Auto a = new Auto(Model.HetchBack,10,10,"fwewf");
        System.out.println(a.equals(new Auto(Model.HetchBack,10,10,"scs")));
    }
}
