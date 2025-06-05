public class Squirel extends Animal {
    private Boolean hasFluffyTail;

    public Squirel(
        String name,
        Integer age,
        StateEnum state,
        Boolean hasFluffyTail
    )
    {
        super(name, age, state);
        this.hasFluffyTail = hasFluffyTail;
    }

    public Boolean GetTailFluffyness()
    {
        return this.hasFluffyTail;
    }

    public void SetTailFluffyness(Boolean hasFluffyTail)
    {
        this.hasFluffyTail = hasFluffyTail;
    }
    
}
