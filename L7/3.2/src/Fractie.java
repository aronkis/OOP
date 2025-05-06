
public class Fractie implements Numeric 
{

    private double num;
    private double denom;

    public double getDenom() 
    {
        return denom;
    }

    public double getNum() 
    {
        return num;
    }

    public Fractie() 
    {
        this.num = 0.0;
        this.denom = 1.0;
    }

    public Fractie(double num, double denom) 
    {
        this.num = num;
        this.denom = denom;
    }

    @Override
    public void add(Object b) 
    {
        Fractie t = (Fractie) b;
        if (this.denom != t.denom) 
        {
            this.num = (this.num * t.denom) + (t.num * this.denom);
            this.denom = this.denom * t.denom;
        } else 
        {
            this.num += t.num;
        }
    }

    @Override
    public void sub(Object b) 
    {
        Fractie t = (Fractie) b;
        if (this.denom != t.denom) 
        {
            this.num = (this.num * t.denom) - (t.num * this.denom);
            this.denom = this.denom * t.denom;
        } else 
        {
            this.num -= t.num;
        }
    }

    @Override
    public void mul(Object b) 
    {
        Fractie t = (Fractie) b;
        this.num *= t.num;
        this.denom *= t.denom;
    }

}
