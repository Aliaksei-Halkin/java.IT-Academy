package com.company;

import java.util.Arrays;

public class Main {
    public static void sort(int[] array) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i <= array.length - 2; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
            swapped = false;
            for (int i = array.length - 2; i >= 0; i--) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);
        String intArrayString2 = Arrays.toString(array);
        System.out.println("ПОСЛЕ " + intArrayString2);
    }

    public static void main(String[] args) {

        int[] array = {10,5,8,4,15,24,51,48,51,12,14};
        String intArrayString = Arrays.toString(array);
        System.out.println("ДО: " + intArrayString);
        sort(array);


    }
}