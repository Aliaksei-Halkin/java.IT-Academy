package com.company;


public class Main {
    public static void main(String[] args) {

        //ЗАДАНИЕ 1.2

        int x = 42, y = 15;
        int result;

        result = x & y;
        System.out.println(result + "   " + Integer.toBinaryString(result));  //10   1010
        result = x | y;
        System.out.println(result + "   " + Integer.toBinaryString(result)); //47   101111
        result = x ^ y;
        System.out.println(result + "   " + Integer.toBinaryString(result));  //37   100101
        result = x << y;
        System.out.println(result + "   " + Integer.toBinaryString(result));    //1376256   101010000000000000000
        result = x >> y;
        System.out.println(result + "   " + Integer.toBinaryString(result));   // 0  0
        result = x >>> y;
        System.out.println(result + "   " + Integer.toBinaryString(result));    // 0  0
        result = ~ x;
        System.out.println(result + "   " + Integer.toBinaryString(result));  // -43   11111111111111111111111111010101
        result = x &= y;
        System.out.println(result + "   " + Integer.toBinaryString(result));  // 10   1010
        result = x |= y;
        System.out.println(result + "   " + Integer.toBinaryString(result));  //15   1111
        result = y ^= x;
        System.out.println(result + "   " + Integer.toBinaryString(result));  // 0  0
        result >>= x;
        System.out.println(result + "   " + Integer.toBinaryString(result));  // 0  0
        result = x <<= y;
        System.out.println(result + "   " + Integer.toBinaryString(result));//  15  1111
        result = y >>>= x;
        System.out.println(result + "   " + Integer.toBinaryString(result)); // 0  0

        //ЗАДАНИЕ 1.3
        x = -42;
        y = -15;

        result = x & y;
        System.out.println(result + "   " + Integer.toBinaryString(result));  //-48   11111111111111111111111111010000
        result = x | y;
        System.out.println(result + "   " + Integer.toBinaryString(result)); //-9   11111111111111111111111111110111
        result = x ^ y;
        System.out.println(result + "   " + Integer.toBinaryString(result));  //39   100111
        result = x << y;
        System.out.println(result + "   " + Integer.toBinaryString(result));    //-5505024   11111111101011000000000000000000
        result = x >> y;
        System.out.println(result + "   " + Integer.toBinaryString(result));   // -1   11111111111111111111111111111111
        result = x >>> y;
        System.out.println(result + "   " + Integer.toBinaryString(result));    // 32767   111111111111111
        result = ~ x;
        System.out.println(result + "   " + Integer.toBinaryString(result));  // 41   101001
        result = x &= y;
        System.out.println(result + "   " + Integer.toBinaryString(result));  // -48   11111111111111111111111111010000
        result = x |= y;
        System.out.println(result + "   " + Integer.toBinaryString(result));  //-15   11111111111111111111111111110001
        result = y ^= x;
        System.out.println(result + "   " + Integer.toBinaryString(result));  // 0  0
        result >>= x;
        System.out.println(result + "   " + Integer.toBinaryString(result));  // 0  0
        result = x <<= y;
        System.out.println(result + "   " + Integer.toBinaryString(result));//  -15   11111111111111111111111111110001
        result = y >>>= x;
        System.out.println(result + "   " + Integer.toBinaryString(result)); // 0  0

// write your code here
    }
}
