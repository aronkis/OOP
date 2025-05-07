public class App 
{
    public static void main(String[] args) 
    {
        A a = new C(); 

        try 
        {
            a.executa(); 
        } 
        catch (Exceptie1 e) 
        {
            System.out.println("In main: " + e.getMessage());
        }
    }
}
