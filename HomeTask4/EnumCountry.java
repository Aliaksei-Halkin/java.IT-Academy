import org.w3c.dom.ls.LSOutput;


import java.util.Scanner;

public class EnumCountry implements IExample {
    public static void main(String[] args) {

        System.out.println(ECountry.BELARUS); //BELARUS  Площадь 200000  Нселение  9000000
        ECountry belarus = ECountry.valueOf("BELARUS");//BELARUS
        System.out.println(belarus);//BELARUS
        Boolean s;
        System.out.println(s = belarus == ECountry.BELARUS);//true
        // ECountry italy = ECountry.valueOf("ITALY");
        //System.out.println(italy);//IllegalArgumentException: No enum constant ECountry.ITALY Process finished with exit code 1

        CountryAreaComparator firstComp = new CountryAreaComparator();
        String country1 = new String();
        String country2 = new String();

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите две страны для сравнения");
        country1 = sc.nextLine();
        country2 = sc.nextLine();
        System.out.println("Результат сравнения: " + firstComp);


    }


    //  System.out.println("Результат сравнения: " + cac.compare(ECountry.valueOFIgnoreCase(n),ECountry.valueOFIgnoreCase(n1)));



    @Override
    public int getArea() {
        return 0;
    }

    @Override
    public int getPopulation() {
        return 0;
    }

}



