public class App 
{
    public static void main(String[] args) 
    {
        CalendarLucru calendar = new CalendarLucru();
        Lucrator lucrator = new Lucrator("Ionel", calendar);

        try 
        {
            lucrator.lucreaza("Luni");
            lucrator.lucreaza("Marti");
            lucrator.lucreaza("Duminica");
        } 
        catch (ExceptieZiNelucratoare e) 
        {
            System.out.println(e.getMessage());
        }
    }
}