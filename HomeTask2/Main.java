package com.company;

public class Main {

    public static void main(String[] args) {
        //  В отдельном классе, создать мэйн метод. Внутри данного метода создать экземпляр Color. В конструктор передать число 3.
        //  Далее вывести в консоль номер цвета и его названия использую результат выполнения методов getNumber и getName.
        Color color = new Color(3);
        System.out.println(color.getName());
        System.out.println(color.getNumber());
    }
}
