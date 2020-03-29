package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//Сортировка пузырьком
        int array[] = new int[10];
        System.out.println("Длина массива равна " + array.length);

        System.out.print("Массив состоит из ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }
            }
        }
        String intArrayString = Arrays.toString(array); //печатало что-то типа I@7150bd4d, а не элементы массива, сделал так
        System.out.println("\nОтсортировано пузырьком " + intArrayString);


        //сортировка выбором
        int array2[] = new int[10];
        System.out.println("Длина массива равна " + array2.length);
        System.out.print("Массив состоит из ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 100);
            System.out.print(array2[i] + " ");
        }
        for (int i = 0; i < array2.length; i++) {
            int min = array2[i];
            int minId = i;
            for (int j = i + 1; j < array2.length; j++) {
                if (array2[j] < min) {
                    min = array2[j];
                    minId = j;
                }
            }
            // замена
            int temp1 = array2[i];
            array2[i] = min;
            array2[minId] = temp1;
        }
        String intArrayString2 = Arrays.toString(array2);
        System.out.println("\nОтсортировано выбором " + intArrayString2);


//метод sort() из класса Arrays
        int array3[] = new int[10];
        System.out.println("Длина массива равна " + array3.length);
        System.out.print("Массив состоит из ");
        for (int i = 0; i < array3.length; i++) {
            array3[i] = (int) (Math.random() * 100);
            System.out.print(array3[i] + " ");
        }
        Arrays.sort(array3);
        String intArrayString3 = Arrays.toString(array3);
        System.out.println("\nОтсортировано методом Arrays.sort" + intArrayString3);


        //сортировка вставкой
        int elements[] = new int[]{3, 2, 5, 7, 1, 9};
        for (int i = 1; i < elements.length; i++) {
            int key = elements[i];
            int j = i - 1;
            while (j >= 0 && key < elements[j]) {
                elements[j + 1] = elements[j];
                j--;
            }
            elements[j + 1] = key;
        }
        String elementsSort = Arrays.toString(elements);
        System.out.println("\nОтсортировано вставкой " + elementsSort);


        //Пирамидальная сортировка (англ. Heapsort, «Сортировка кучей»)
        int[] numbers = {12, 2, 15, 56, 23, 78, 45, 34, 16, 91, 53, 27};
        heapsort(numbers);
        System.out.print("Сортировка кучей ");
        for (int h = 0; h < numbers.length; h++)
            System.out.print(+numbers[h] + " ");
    }

    public static void heapsort(int[] a) {
        for (int i = a.length / 2 - 1; i >= 0; i--)

            shiftDown(a, i, a.length);
        for (int i = a.length - 1; i > 0; i--) {
            swap(a, 0, i);
            shiftDown(a, 0, i);
        }
    }

    private static void shiftDown(int[] a, int i, int n) {
        int child;
        int tmp;
        for (tmp = a[i]; leftChild(i) < n; i = child) {
            child = leftChild(i);
            if (child != n - 1 && (a[child] < a[child + 1]))
                child++;
            if (tmp < a[child])
                a[i] = a[child];
            else
                break;
        }
        a[i] = tmp;
    }

    private static int leftChild(int i) {
        return 2 * i + 1;
    }

    public static void swap(int[] numbers, int i, int j) {
        int temp = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = temp;
    }




}








