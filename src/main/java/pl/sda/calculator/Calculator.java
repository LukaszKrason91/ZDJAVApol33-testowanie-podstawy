package pl.sda.calculator;

public class Calculator {

    public int add(int arg1, int arg2) {

        return arg1 + arg2;
    }

    public boolean isDividableByThree(int arg) {

        return arg % 3 == 0;
    }

    public int substract(int arg1, int arg2) {
        return arg1 - arg2;
    }

    public int multiplication1(int arg1, int arg2) {
        return arg1 * arg2;
    }

    public int decrementation(int arg1, int arg2) {
        if (arg2 == 0) {
            return 0;
        } else {
            return arg1 / arg2;
        }

    }

    public boolean isEven(int arg1) {
        return (arg1 % 2) == 0;
    }
    public boolean isNotEven(int arg1) {
        return (arg1 % 2) != 0;
    }
    public double percentage(double arg1, double arg2) {
//        throw new RuntimeException("Nie zaimplementowano");
        return (arg1 * arg2) / 100;
    }

}
