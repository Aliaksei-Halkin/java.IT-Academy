public enum ECountry implements IExample {
    BELARUS(200000, 9000000),

    RUSSIA(17000000, 50000000),

    USA(90000000, 25000000),

    GERMANY(2000000, 30000000),

    AUSTRIA(9800000, 10000000),

    CANADA(9850000, 42000000),

    JAPAN(200210, 18000000),

    CHINA(10000245, 100000000),

    INDIA(3000254, 80000000),

    AUSTRALIA(8452124, 14325000), ;


    private int area;
    private int population;

    ECountry(int getArea, int getPopulation) {
        this.area = getArea;
        this.population = getPopulation;
    }


    public int getArea() {
        return area;
    }


    public int getPopulation() {
        return population;
    }

    public String toString() {
        return name() + "  Площадь " + area + "  Население  " + population;

    }


}