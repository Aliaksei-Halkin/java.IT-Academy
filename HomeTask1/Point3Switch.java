package com.company;

import java.util.Scanner;

public class Point3Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Какое Ваше имя?");
        String name = in.nextLine();
        switch (name) {
            case "Вася":
                System.out.print("Привет!\nЯ тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто?");
        }

    }
}
