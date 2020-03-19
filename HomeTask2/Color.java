package com.company;

public class Color {

    private final int RED = 1;
    private final int ORANGE = 2;
    private final int YELLOW = 3;
    private final int GREEN = 4;
    private final int BLUE = 5;
    private final int INDIGO = 6;
    private final int VIOLET = 7;
    int num;

    public Color(int num) {
        this.num = num;
    }

    public int getNumber() {
        return  num;
    }

    public String getName() {
        String name;
        switch (num) {
            case RED:
                name = "Красный";
                break;
            case ORANGE:
                name = "Оранжевый";
                break;
            case YELLOW:
                name = "Желтый";
                break;
            case GREEN:
                name = "Зеленый";
                break;
            case BLUE:
                name = "Голубой";
                break;
            case INDIGO:
                name = "Синий";
                break;
            case VIOLET:
                name = "Фиолетовый";
                break;
            default:
                name = "неизвeстно";
        }
        return name;
    }


}





