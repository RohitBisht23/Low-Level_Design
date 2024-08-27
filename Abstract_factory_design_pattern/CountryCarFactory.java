public class CountryCarFactory {
    public static CarFactory getCountryCarFactory(String location) {
        CarFactory carFactory = null;

        switch (location) {
            case "US" -> carFactory = new USCarFactory();
              
            case "INDIA" -> carFactory = new IndianCarFactory();
        }
        return carFactory;
    }
}
