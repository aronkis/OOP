class App 
{
    public static void handleEngine(Engine engine) 
    {
        engine.start();
        engine.stop();
    }

    public static void handleWheels(Wheels wheels) 
    {
        wheels.rotate();
        wheels.brake();
    }

    public static void handleLights(Lights lights) 
    {
        lights.turnOn();
        lights.turnOff();
    }

    public static void handleVehicle(Vehicle vehicle) 
    {
        vehicle.honk();
    }

    public static void main(String[] args) 
    {
        Car car = new Car("BMW", 2023);
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Type: " + car.getType());

        handleEngine(car);
        handleWheels(car);
        handleLights(car);
        handleVehicle(car);
    }
}
