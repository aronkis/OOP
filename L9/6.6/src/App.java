
public class App 
{
    public static void main(String[] args) 
    {
        try 
        {
            Test test = new Test();
            test.f();
        } 
        catch (ExceptieB e) 
        {
            System.out.println("Exceptie in main: " + e.getMessage());
        }
    }
}
