public class Motocicleta extends Autoturism{
    private String tipMotocicleta_;

    public Motocicleta(String marca, float viteza, String culoare, int capacitate, String tipMotocicleta)
    {
        super(marca, viteza, culoare, capacitate);
        this.tipMotocicleta_ = tipMotocicleta;
    }

    public void setTipMotocicleta(String tipMotocicleta)
    {
        this.tipMotocicleta_ = tipMotocicleta;
    }

    public String getTipMotocicleta()
    {
        return this.tipMotocicleta_;
    }

    public String toString() {
        return super.toString() + ", Motocicleta tip motocicleta =" + tipMotocicleta_ + "]";
    }

}
