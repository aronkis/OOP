class Car extends Machine implements Vehicle 
{
    private String model;
    private int year;

    public Car(String model, int year) 
    {
        super("Car");
        this.model = model;
        this.year = year;
    }

    public String getModel() 
    {
        return model;
    }

    public int getYear() 
    {
        return year;
    }

    @Override
    public void start() 
    {
        System.out.println("Car engine is starting.");
    }

    @Override
    public void stop() 
    {
        System.out.println("Car engine is stopping.");
    }

    @Override
    public void rotate() 
    {
        System.out.println("Car wheels are rotating.");
    }

    @Override
    public void brake() 
    {
        System.out.println("Car is braking.");
    }

    @Override
    public void turnOn() 
    {
        System.out.println("Car lights are turning on.");
    }

    @Override
    public void turnOff() 
    {
        System.out.println("Car lights are turning off.");
    }

    @Override
    public void honk() 
    {
        System.out.println("Car is honking.");
    }
}