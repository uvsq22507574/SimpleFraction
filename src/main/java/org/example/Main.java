package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(3, 4);
        Fraction f2 = new Fraction(6);
        Fraction f3 = new Fraction();

        assert f1.toString().equal(3,4);
        assert f2.toString().equal(6);
        assert f3.toString().equal();



    }
}