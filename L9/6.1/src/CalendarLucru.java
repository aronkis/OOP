import java.util.ArrayList;

class CalendarLucru 
{
    private ArrayList<Zi> zile;

    public CalendarLucru() 
    {
        zile = new ArrayList<>();
        zile.add(new Zi("Luni", true));
        zile.add(new Zi("Marti", true));
        zile.add(new Zi("Miercuri", true));
        zile.add(new Zi("Joi", true));
        zile.add(new Zi("Vineri", true));
        zile.add(new Zi("Sambata", false));
        zile.add(new Zi("Duminica", false));
    }

    public Zi getZi(String nume) 
    {
        for (Zi zi : zile) 
        {
            if (zi.getNume().equals(nume)) 
            {
                return zi;
            }
        }
        return null;
    }

    public void setZiLucratoare(String nume) 
    {
        Zi zi = getZi(nume);
        if (zi != null) 
        {
            zi.setLucratoare();
        }
    }

    public void setZiNelucratoare(String nume) 
    {
        Zi zi = getZi(nume);
        if (zi != null) 
        {
            zi.setNelucratoare();
        }
    }
}