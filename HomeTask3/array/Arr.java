import java.util.Scanner;

public class Arr {
    public static void main(String[] args) {
        int nums[] = new int[3];
        System.out.println("Длина массива равна " + nums.length);

          /*  System.out.print("Массив состоит из ");
           for (int i = 0; i<nums.length; i++) {
               nums[i] = (int) (Math.random()*10+1 );
               System.out.print(nums[i]+" ");
          }
           */
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите значения массива");
        int i = 0;
        for (i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        /*for (i = 0; i < nums.length; i++) {
            System.out.println("Элемент массива № " + i + " равен " + nums[i]);
        }
        int j = 0;
        do {
            System.out.println("Элемент массива № " + j + " равен " + nums[j]);
            j++;
        } while (j < nums.length);

        int a = 0;
        while (a < nums.length) {
            System.out.println("Элемент массива № " + a + " равен " + nums[a]);
            a++;
        }

        for (int b : nums) {
            System.out.println("Элемент массива № " + b + " равен " + nums[b]);
        }
*/
        for (i = 0; i < nums.length; i = i + 2) {
            System.out.println("Элемент массива № " + i + " равен " + nums[i]);
        }
    }
}
