package com.company;


public class Main {


    public static void main(String[] args) {

        EasySearch s = new EasySearch();
        System.out.println("Слово 'Война' встречается " + s.search(s.a, s.readAllBytesJava7(s.filePath)) + " раз.");//57
        System.out.println("Союз 'и' встречается " + s.search(s.b, s.readAllBytesJava7(s.filePath)) + " раз.");//13883
        System.out.println("Слово 'Мир' встречается " + s.search(s.c, s.readAllBytesJava7(s.filePath)) + " раз.");//298
    }


}
