public class USCarFactory implements CarFactory{
    public Car getCar(String model) {
        Car car = null;
        switch (model) {
            case "MINI" -> car = new USMiniCar();
               
        
            case "LUXURY" -> car = new USLuxuryCar();
        }
        return car;
    }
}
