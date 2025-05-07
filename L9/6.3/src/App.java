public class App 
{
    public static void main(String[] args) 
    {
        int[] a = {0, 1, 2};

        try 
        {
            System.out.println("Valoarea este pe pozitia -1: " + a[-1]);
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
