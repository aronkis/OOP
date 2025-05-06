
public class Complex implements Numeric 
{

    public double re;
    public double im;

    public Complex() 
	{
        this.re = 0;
        this.im = 0;
    }

    @Override
    public void add(Object b) 
	{
        Complex t = (Complex) b;
        this.re += t.re;
        this.im += t.im;
    }

    @Override
    public void sub(Object b) 
	{
        Complex t = (Complex) b;
        this.re -= t.re;
        this.im -= t.im;
    }

    @Override
    public void mul(Object b) 
	{
        Complex t = this;
        Complex t2 = (Complex) b;

        this.re = t.re * t2.re - t.im * t2.im;
        this.im = t.re * t2.im + t.im * t2.re;
    }
}
