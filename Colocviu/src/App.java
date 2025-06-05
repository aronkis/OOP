public class App {
    public static void main(String[] args) throws Exception {
        Clinic clinic = new Clinic();
        
        Squirel s = new Squirel("Peter", 1, StateEnum.LIGHT, false);

        Kangoroo k = new Kangoroo("Henry", 3, StateEnum.SERIOUS, 5);

        Koala ko = new Koala("Jason", 6, StateEnum.LIGHT, 12);

        Room r1 = new Room(1, 5, 0, "Squirel");

        Room r2 = new Room(2, 5, 0, "Kangoroo");
        
        Room r3 = new Room(3, 5, 0, "Koala");

        clinic.AddRoom(r1);
        clinic.AddRoom(r2);
        clinic.AddRoom(r3);

        try
        {
            clinic.evaluateAnimal(1, s);
        }       
        catch (IncompatibleAnimals e)
        {
            System.out.println(e);
        }
        catch (ClinicFull e)
        {
            System.out.println(e);
        }

        try
        {
            clinic.evaluateAnimal(2, k);
        }       
        catch (IncompatibleAnimals e)
        {
            System.out.println(e);
        }
        catch (ClinicFull e)
        {
            System.out.println(e);
        }

        try
        {
            clinic.evaluateAnimal(3, ko);
        }       
        catch (IncompatibleAnimals e)
        {
            System.out.println(e);
        }
        catch (ClinicFull e)
        {
            System.out.println(e);
        }

        System.out.println("Number of free rooms = " + clinic.CalcualteNumberOfAvailableRooms());
        clinic.ReportClinic();
    }
}