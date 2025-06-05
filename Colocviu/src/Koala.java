public class Koala extends Animal{
    private Integer hoursSleptByDay;

    public Koala( 
        String name,
        Integer age,
        StateEnum state,
        Integer hoursSleptByDay)
    {
        super(name, age, state);
        this.hoursSleptByDay = hoursSleptByDay;
    }

    public Integer GetHoursSleptByDay()
    {
        return this.hoursSleptByDay;
    }

    public void SetHoursSleptByDay(Integer hoursSleptByDay)
    {
        this.hoursSleptByDay = hoursSleptByDay;
    }
}
