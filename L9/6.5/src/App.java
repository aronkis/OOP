public class App 
{
    public static void main(String[] args) 
    {
        try 
        {
            throw new Exceptie("Exceptie generata!");
        } 
        catch (Exceptie e) 
        {
            e.afiseazaMesaj();
        }
    }
}