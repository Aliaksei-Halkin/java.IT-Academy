package com.company;

public class Main {

    public static void main(String[] args) {
        CalculatorWithOperator calc = new CalculatorWithOperator();
        // 4.1 + 15 * 7 + (28 / 5) ^ 2
        double result1 = CalculatorWithOperator.multiply(15, 7);
        double result2 = CalculatorWithOperator.devide(28, 5);
        double result3 = CalculatorWithOperator.stepen(result2, 2);
        double result = result1 + result2 + result3;
        System.out.println(result);

//СДЕЛАЛ ВСЕ С ДРОБНОЙ ЧАСТЬЮ(DOUBLE)--УНИВЕРСАЛЬНЫЙ ВАРИАНТ ДЛЯ КАЛЬКУЛЯТОРА
    }


}

// write your code here


