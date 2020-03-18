package com.company;

import java.util.Scanner;

public class Poin3Ifelse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Какое Ваше имя?");
        String name = in.nextLine();

        if (name.equals("Вася")) {
            System.out.print("Привет!\nЯ тебя так долго ждал");
        } else if (name.equals("Анастасия")) {
            System.out.println("Я тебя так долго ждал");
        } else {
            System.out.println("Добрый день, а вы кто?");
        }
    }
}
