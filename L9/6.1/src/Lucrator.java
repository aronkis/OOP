class Lucrator 
{
    private String nume;
    private CalendarLucru calendar;

    public Lucrator(String nume, CalendarLucru calendar) 
    {
        this.nume = nume;
        this.calendar = calendar;
    }

    public void lucreaza(String zi) throws ExceptieZiNelucratoare 
    {
        Zi ziua = calendar.getZi(zi);
        if (ziua == null) 
        {
            System.out.println(zi + " nu este o zi a saptamanii");
        } else if (!ziua.esteLucratoare()) 
        {
            throw new ExceptieZiNelucratoare("Exceptie: lucru in zi nelucratoare");
        } else 
        {
            System.out.println("Lucratorul " + nume + " lucreaza " + zi);
        }
    }
}