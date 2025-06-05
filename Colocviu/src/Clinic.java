
import java.util.ArrayList;

public class Clinic implements ClinicMethods {

    private ArrayList<Room> rooms;
    private final Integer nrOfRooms = 5;

    public Clinic() {
        this.rooms = new ArrayList<>();
    }

    public ArrayList<Room> GetRooms() {
        return this.rooms;
    }

    public void SetRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public void AddRoom(Room room)
    {
        this.rooms.add(room);
    }

    @Override
    public void evaluateAnimal(Integer roomId, Animal animal) throws IncompatibleAnimals, ClinicFull {
        if (animal.GetState() == StateEnum.LIGHT) {
            System.out.println("The animal will go home today!");
            return;
        }
        try {
            occupyRoom(roomId, animal);
        } catch (ClinicFull e) {
            System.out.println(e);
        }
    }

    @Override
    public void occupyRoom(Integer roomId, Animal animal) throws ClinicFull {

        if (this.rooms.get(roomId).GetNumberOfBedsOccupied() >= this.rooms.get(roomId).GetNumberOfBeds()) {
            throw new ClinicFull();
        }

        this.rooms.get(roomId).enter(animal);
    }

    @Override
    public void leaveRoom(String name) {
        for (int i = 0; i < this.nrOfRooms; i++) {
            for (int j = 0; j < rooms.get(i).GetNumberOfBedsOccupied(); j++) {
                Animal animal = rooms.get(i).GetPatient(j);
                if (animal.GetName().equals(name)) {
                    rooms.get(i).leave(j);
                }
            }
        }
    }

    public Integer CalcualteNumberOfAvailableRooms()
    {
        Integer res = 0;
        for (Room room: this.rooms)
        {
            if (room.GetNumberOfBedsOccupied() == 0)
            {
                res++;
            }
        }
        return res;
    }

    public void ReportGradeOfOccupancy()
    {
        for (Room room: this.rooms)
        {
            System.out.println("In camera" + room.GetId() + "se afla" + room.GetNumberOfBedsOccupied() + room.GetTypeOfAnimal() + " si mai exista" + (room.GetNumberOfBeds() - room.GetNumberOfBedsOccupied()) +"  locuri libere,");
        }
    }
    
    public void ReportClinic()
    {
        Integer squireles = 0;
        Integer kangoroo = 0;
        Integer koala = 0;
        Integer numberOfSpecies = 0;
        Boolean isSquireles = false;
        Boolean isKangoroo = false;
        Boolean isKoala = false;

        for (Room room: this.rooms)
        {
            if (room.GetTypeOfAnimal().equals("Squirel"))
            {
                squireles += room.GetNumberOfBedsOccupied();
                isSquireles = true;
            }
            if (room.GetTypeOfAnimal().equals("Kangoroo"))
            {
                kangoroo += room.GetNumberOfBedsOccupied();
                isKangoroo = true;
            }
            if (room.GetTypeOfAnimal().equals("Koala"))
            {
                koala += room.GetNumberOfBedsOccupied();
                isKoala = true;
            }
        }

        if (isSquireles == true)
        {
            numberOfSpecies++;
        }
        if (isKangoroo == true)
        {
            numberOfSpecies++;
        }
        if (isKoala == true)
        {
            numberOfSpecies++;
        }

        System.out.println("In clinica se afla " + numberOfSpecies + " specii de animale diferite care \n\t " + koala + " canguri \n\t" + kangoroo + " koala \n\t" + squireles + " veverite \nIn total in clinica se afla" + (koala + kangoroo + squireles) + " animal");

    }

}
