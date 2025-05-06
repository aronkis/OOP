
class Masina implements Cloneable 
{

    private String marca;
    private String culoare;

    public Masina(String marca, String culoare) 
    {
        this.marca = marca;
        this.culoare = culoare;
    }

    public String getMarca() 
    {
        return marca;
    }

    public String getCuloare() 
    {
        return culoare;
    }

    public void setCuloare(String culoare) 
    {
        this.culoare = culoare;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException 
    {
        return super.clone();
    }

    @Override
    public String toString() 
    {
        return "Masina: marca = " + marca + ", culoare = " + culoare;
    }
}
