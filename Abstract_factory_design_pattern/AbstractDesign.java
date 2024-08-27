public class AbstractDesign {
    public static void main(String[] args) {
        CarFactory indianCarFactory = CountryCarFactory.getCountryCarFactory("INDIA");

        Car indianMiniCar = indianCarFactory.getCar("MINI");

        indianMiniCar.construct();
    }
}
