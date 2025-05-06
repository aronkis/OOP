
import java.util.Arrays;

public class App 
{

    public static void main(String[] args) 
    {
        Persoana[] persoane = 
        {
            new Persoana("Pop", "Ion", 30),
            new Persoana("Radu", "Maria", 25),
            new Persoana("Toma", "Andrei", 35)
        };

        // Arrays.sort(persoane);
        // for (Persoana p : persoane) 
        //{
        //     System.out.println(p);
        // }
        
        Arrays.sort(persoane);
        for (Persoana p : persoane) 
        {
            System.out.println(p);
        }
    }
}
