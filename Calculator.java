package com.sahil.solid;


interface Operation {
    void calculate(int num1, int num2);
}

class Addition implements Operation {

    @Override
    public void calculate(int num1, int num2) {
        System.out.println(num1 + num2);
    }
}

class Multiplication implements Operation {

    @Override
    public void calculate(int num1, int num2) {
        System.out.println(num1 * num2);
    }
}

class Subtraction implements Operation {

    @Override
    public void calculate(int num1, int num2) {
        System.out.println(num1 - num2);
    }
}

public class CalculatorMain {

    public static void main(String[] args) {

        try {
            Operation operation = OperationFactory.newFactory("+");

            operation.calculate(10,12);

        }catch (Exception e) {
            e.printStackTrace();
        }


    }

}
