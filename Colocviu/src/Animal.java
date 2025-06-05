public class Animal {
    private String name;
    private Integer age;
    private StateEnum state;

    public Animal(
        String name,
        Integer age,
        StateEnum state
    )
    {
        this.name = name;
        this.age = age;
        this.state = state;
    }

    public String GetName()
    {
        return this.name;
    }

    public Integer GetAge()
    {
        return this.age;
    }

    public StateEnum GetState(){
        return state;
    }

    public void SetName(String name)
    {
        this.name = name;
    }

    public void SetAge(Integer age)
    {
        this.age = age;
    }

    public void SetState(StateEnum state)
    {
        this.state = state;
    }
    
}
