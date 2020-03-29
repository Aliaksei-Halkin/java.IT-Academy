package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int array2[] = new int[5];
        System.out.println("Длина массива равна " + array2.length);
        //System.out.print("Массив состоит из ");
        System.out.println("Введите значения массива ");
        Scanner sc = new Scanner(System.in);
        int n = array2.length;
        for (int i = 0;i < n; i++) {
            array2[i] = sc.nextInt();
        }
//cортировка
        for (int i = 0; i < n; i++) {
            int min = array2[i];
            int minId = i;
            for (int j = i + 1; j < n; j++) {
                if (array2[j] < min) {
                    min = array2[j];
                    minId = j;
                }
            }
                       int temp1 = array2[i];
            array2[i] = min;
            array2[minId] = temp1;
        }
        //удаляем повтор


        for ( int i = 0, m = 0; i != n; i++, n = m )
        {
            for ( int j = m = i + 1; j != n; j++ )
            {
                if ( array2[j] != array2[i] )
                {
                    if ( m != j ) array2[m] = array2[j];
                    m++;
                }
            }
        }


        if ( n != array2.length )
        {
            int[] b = new int[n];
            for ( int i = 0; i < n; i++ ) b[i] = array2[i];

            array2 = b;
        }

        for ( int x : array2 ) System.out.print( x + " " );
        System.out.println();

        //String intArrayString2 = Arrays.toString(array2);
       // System.out.println("\nОтсортировано выбором " + intArrayString2);


    }
}
