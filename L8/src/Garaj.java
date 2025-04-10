import java.util.Vector;

public class Garaj 
{
    private Vector<Vehicul> vehicule;

    public Garaj() 
    {
        vehicule = new Vector<>();
    }

    public void adaugaVehicul(Vehicul vehicul) 
    {
        vehicule.add(vehicul);
    }

    public void afiseazaVehicule() 
    {
        for (Vehicul v : vehicule) 
        {
            System.out.println(v.toString());
        }
    }

    public Vector<Vehicul> getVehicule() 
    {
        return vehicule;
    }

    public void setVehicule(Vector<Vehicul> vehicule) 
    {
        this.vehicule = vehicule;
    }
}
