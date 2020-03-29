import java.util.Comparator;

public class CountryAreaComparator implements Comparator<ECountry> {
    public int compare(ECountry country1, ECountry country2) {
        /*if (country1.getArea() == country2.getArea()) {//https://vertex-academy.com/tutorials/ru/interfejsy-comparable-comparator-java/
            return 0;
        }
        if (country1.getArea() > country2.getArea()) {
            return 1;
        } else {
            return -1;
        }*/
        return Integer.compare(country1.getArea(), country2.getArea());
    }


}