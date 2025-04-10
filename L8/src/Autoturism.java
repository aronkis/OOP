public class Autoturism implements Vehicul {
    private String marca_;
    private float viteza_;
    private String culoare_;
    private int capacitate_;

    public Autoturism(String marca, float viteza, String culoare, int capacitate)
    {
        this.marca_ = marca;
        this.viteza_ = viteza;
        this.culoare_ = culoare;
        this.capacitate_ = capacitate;
    }

 
    public void setMarca(String marca)
    {
        this.marca_ = marca;
    }

    public String getMarca()
    {
        return this.marca_;
    }

    public void setViteza(float viteza)
    {
        this.viteza_ = viteza;
    }

    @Override
    public float getViteza()
    {
        return this.viteza_;
    }

    public void setCuloare(String culoare)
    {
        this.culoare_ = culoare;
    }

    public String getCuloare()
    {
        return this.culoare_;
    }

    public void setCapacitate(int capacitate)
    {
        this.capacitate_ = capacitate;
    }

    public int getCapacitate()
    {
        return this.capacitate_;
    }

    public void porneste()
    {
        this.viteza_ = 10;
    }

    public void opreste()
    {
        this.viteza_ = 0;
    }

    @Override
    public void accelereaza(float viteza)
    {
        this.viteza_ += viteza;
    }
    
    @Override
    public void decelereaza(float viteza)
    {
        this.viteza_ -= viteza;
    }

    @Override
    public String toString()
    {
        return new String("Marca: " + this.marca_ +
                        "\nViteza: " + this.viteza_ +
                        "\nCuloare: " + this.culoare_ +
                        "\nCapacitate: " + this.capacitate_);
    }
}
