import org.w3c.dom.ls.LSOutput;

public class EnumCountry implements IExample {
    public static void main(String[] args) {
        Country inf = Country.BELARUS;
        System.out.println(inf);
    }
    
    @Override
    public void Area(int area) {
        System.out.println();

    }
    public void Population(int population) {

    }
}
