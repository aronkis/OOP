public class Kangoroo extends Animal {
    private Integer jumpDistance;

    public Kangoroo( 
        String name,
        Integer age,
        StateEnum state,
        Integer jumpDistance)
    {
        super(name, age, state);
        this.jumpDistance = jumpDistance;
    }

    public Integer GetJumpDistance()
    {
        return this.jumpDistance;
    }

    public void SetJumpDistance(Integer jumpDistance)
    {
        this.jumpDistance = jumpDistance;
    }
}
