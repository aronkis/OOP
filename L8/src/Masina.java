public class Masina extends Autoturism {

    private int numarUsi_;
    private String tipCombustibil_;

    public Masina(String marca, float viteza, String culoare, int capacitate, int numarUsi, String tipCombustibil)
    {
        super(marca, viteza, culoare, capacitate);
        this.numarUsi_ = numarUsi;
        this.tipCombustibil_ = tipCombustibil;
    }

    public void setNumarUsi(int numarUsi)
    {
        this.numarUsi_ = numarUsi;
    }

    public int getNumarUsi()
    {
        return this.numarUsi_;
    }

    public void setTipCombustibil(String tipCombustibil)
    {
        this.tipCombustibil_ = tipCombustibil;
    }

    public String getTipCombustibil()
    {
        return this.tipCombustibil_;
    }

    @Override
    public String toString() 
    {
        return super.toString() + ", Masina numar usi=" + numarUsi_ + ", tip combustibil=" + tipCombustibil_;
    }
}