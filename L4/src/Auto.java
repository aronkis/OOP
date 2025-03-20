import java.awt.Color;

public class Auto {
    private String marca_;
    private Color culoare_;
    private int viteza_;
    private int treapta_curenta_;
    private int viteza_maxima_;

    private Motor motor_;
    private Sofer sofer_;

    private final int numar_de_usi_ = 5;

    public Auto() {
        this.marca_ = "";
        this.culoare_ = Color.BLACK;
        this.viteza_ = 0;
        this.treapta_curenta_ = 0;
        this.viteza_maxima_ = 0;
        this.motor_ = new Motor();
        this.sofer_ = new Sofer();
    }

    public Auto(String marca, Color culoare, int viteza, 
                int treapta_curenta, int viteza_maxima,
                Motor motor, Sofer sofer) 
    {
        this.marca_ = marca;
        this.culoare_ = culoare;
        this.viteza_ = viteza;
        this.treapta_curenta_ = treapta_curenta;
        this.viteza_maxima_ = viteza_maxima;
        this.motor_ = motor;
        this.sofer_ = sofer;
    }

    public String GetMarca() { return marca_; }
    public Color GetCuloare() { return culoare_; }
    public int GetViteza() { return viteza_; }
    public int GetTreaptaCurenta() { return treapta_curenta_; }
    public int GetVitezaMaxima() { return viteza_maxima_; }
    public int GetNumarDeUsi() { return numar_de_usi_; }
    public Sofer GetSofer() { return sofer_; }
    public Motor GetMotor() { return motor_; }

    public void SetMarca(String marca) { marca_ = marca; }
    public void SetCuloare(Color culoare) { culoare_ = culoare; }
    public void SetViteza(int viteza) { viteza_ = viteza; }
    public void SetTreaptaCurenta(char treapta_curenta) { treapta_curenta_ = treapta_curenta; }
    public void SetVitezaMaxima(int viteza_maxima) { viteza_maxima_ = viteza_maxima; }
    public void SetSofer(Sofer sofer) { sofer_ = sofer; }
    public void SetMotor(Motor motor) { motor_ = motor; }

    public void Accelerate(int viteza) 
    { 
        if (this.viteza_ + viteza > viteza_maxima_)
        {
            this.viteza_ += viteza;
        }
        else
        {
            this.viteza_ = viteza_maxima_;
        }
    }

    public void Accelerate (short viteza)
    {
        if (this.viteza_ + viteza > viteza_maxima_)
        {
            this.viteza_ += viteza;
        }
        else
        {
            this.viteza_ = viteza_maxima_;
        }
    }

    public void Decelerate(int viteza) 
    { 
        if (this.viteza_ - viteza > 0)
        {
            this.viteza_ -= viteza; 
        }
        else
        {
            this.viteza_ = 0;
        }
    }
}
