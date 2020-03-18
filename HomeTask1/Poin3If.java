package com.company;


import java.util.Scanner;

public class Poin3If {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Какое Ваше имя?");
        String name = in.nextLine();

        if (name.equals("Вася")) {
            System.out.print("Привет!\nЯ тебя так долго ждал");
        }
        if (name.equals("Анастасия")) {
            System.out.println("Я тебя так долго ждал");
        }
        if (!(name.equals("Вася")) && !(name.equals("Анастасия"))) {
            System.out.println("Добрый день, а вы кто?");
        }


    }
}
