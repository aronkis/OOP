import java.util.ArrayList;

public class Room{
    private Integer id;
    private Integer numberOfBeds = 5;
    private Integer numberOfBedsOccupied = 0;
    private ArrayList<Animal> patients;
    private String typeOfAnimal;

    public Room(
        Integer id,
        Integer numberOfBeds,
        Integer numberOfBedsOccupied,
        String typeOfAnimal
    )
    {
        this.id = id;
        this.numberOfBeds = numberOfBeds;
        this.numberOfBedsOccupied = numberOfBedsOccupied;
        this.patients = new ArrayList<>(numberOfBeds);
        this.typeOfAnimal = typeOfAnimal;
    }

    public Integer GetId()
    {
        return this.id;
    }
     
    public Integer GetNumberOfBeds()
    {
        return this.numberOfBeds;
    }
     
    public Integer GetNumberOfBedsOccupied()
    {
        return this.numberOfBedsOccupied;
    }

    public Animal GetPatient(Integer pos)
    {
        return this.patients.get(pos);
    }

    public String GetTypeOfAnimal()
    {
        return this.typeOfAnimal;
    }

    public void SetId(Integer id)
    {
        this.id = id;
    }

    public void SetNumberOfBeds(Integer numberOfBeds)
    {
        this.numberOfBeds = numberOfBeds;
    }
     
    public void SetNumberOfBedsOccupied(Integer numberOfBedsOccupied)
    {
        this.numberOfBedsOccupied = numberOfBedsOccupied;
    }

    public void SetPatiens(ArrayList<Animal> patients)
    {
        this.patients = patients;
    }

    public void SetTypeOfAnimal(String typeOfAnimal)
    {
        this.typeOfAnimal = typeOfAnimal;
    }

    public void leave(Integer poz)
    {
        this.patients.remove(poz);
        this.numberOfBedsOccupied--;
    }

    public void enter(Animal animal)
    {    
        this.patients.add(animal);
        this.numberOfBedsOccupied++;
    }
}
