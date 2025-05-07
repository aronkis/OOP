public class App 
{
    public static void main(String[] args) 
    {
        String text = null; 

        try 
        {
            int lungime = text.length(); 
            System.out.println("Lungime = " + lungime);
        } 
        catch (NullPointerException e) 
        {
            System.out.println("NullPointerException: " + e.getMessage());
        }
    }
}
