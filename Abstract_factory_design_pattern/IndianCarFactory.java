public class IndianCarFactory implements CarFactory{
    public Car getCar(String model) {
        Car car = null;
        switch (model) {
            case "MINI" -> car = new IndianMiniCar();


            case "LUXUTY" -> car = new IndianLuxuryCar();
        }
        return car;
    }
}
