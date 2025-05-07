public class App 
{
    public static void main(String[] args) 
    {
        try 
        {
            throw new Exception("Exceptie generata!");
        } 
        catch (Exception e) 
        {
            System.out.println("Exceptia prinsa: " + e.getMessage());
        } 
        finally 
        {
            System.out.println("Finally!");
        }
    }
}
