package com.company;

public class Poin2 {
    public static void main(String[] args) {
        int result;

        result = 5 + 2 / 8;
        System.out.println(result); //Результат 5
        // 2/8 c отбрасыванием дробной части это 0,  5+0=5

        result = (5 + 2) / 8;
        System.out.println(result); //Результат 0
        // сначала в скобках суммируем =7 и делим на 8, откуидываем дробную часть и получаем 0


        //(5 + 2++) / 8;
        int z = 2;
        result = (5 + z++) / 8;
        System.out.println(result); // 5+2=7   7/8 =0

        //(5 + 2++) / --8
        z = 2;
        int m = 8;
        result = (5 + z++) / --m;
        System.out.println(result);  //Результат 1
        // 5+2=7 и  7/7(m при вычисление приобретает значение 7)


        //(5 * 2 >> 2++) / --8
        z = 2;
        m = 8;
        result = (5 * 2 >> z++) / --m;
        System.out.println(result);//результат 0
        // (10>>2 сдвигаем биты 00001010 на 2, получаем 00000010 ,а это 2) и делим на семь


        //Выражение (5 + 7 > 20 ? 68 : 22 * 2 >> 2++) / --8
        z = 2;
        m = 8;
        result = (5 + 7 > 20 ? 68 : 22 * 2 >> z++) / --m;
        System.out.println(result); //Результат 1
        // сначала скобки, z++ равняется 2,   22*2=44,  5+7=12,
        // промежуточный рез. 12>20?68:44>>2
        // побитовый сдвиг 44 вправо на 2(101100 сдвиг на 2, получаем 001011 или 11),
        // промежут рез 12>20?68:11,  тернарный оператор 12>20  это false , получаем 11
        // 11/7=1 остаток отбрасываем

        //Выражение (5 + 7 > 20 ? 68 => 68 : 22 * 2 >> 2++) / --8 Результат -ОШИБКА
        z = 2;
        m = 8;
        //12>20?68 =>68:44>>2
        //побитовый сдвиг 44 вправо на 2(101100 сдвиг на 2, получаем 001011 или 11)
        //12>20 ? 68=>68 : 11  => ОШИБКА, не правильно записано, но рзультат бвл бы 11 и в итоге 1

        //Выражение 6 - 2 > 3 && 12 * 12 <= 119

        boolean c = 6 - 2 > 3 && 12 * 12 <= 119;
        System.out.println(c);//folse
        //4 > 3 && 132 <= 119
        // true && false   итого false

        boolean d = true && false;
        System.out.println(d); //false   когда значения разные то false


    }


}
