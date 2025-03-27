public class Complex {
    private  float Re_;
    private  float Im_;

    public Complex()
    {
        Re_ = 0;
        Im_ = 0;
    }

    public Complex(float Re, float Im)
    {
        Re_ = Re;
        Im_ = Im;
    }

    public void Print()
    {
        if (Im_ < 0)
        {
            System.out.printf("%.2f - %.2fj", Re_, Math.abs(Im_));
        }
        else
        {
            System.out.printf("%.2f + %.2fj", Re_, Im_);
        }

    }

    public Complex Add(Complex b)
    {
        this.Re_ += b.Re_;
        this.Im_ += b.Im_;
        return new Complex(this.Re_, this.Im_);
    }

    public Complex Substract(Complex b)
    {
        this.Re_ -= b.Re_;
        this.Im_ -= b.Im_;
        return new Complex(this.Re_, this.Im_);
    }

    public Complex Multiply(Complex b)
    {
        Complex t = new Complex(this.Re_, this.Im_);
        t.Re_ = this.Re_ * b.Re_ - this.Im_ * b.Im_;
        t.Im_ = this.Re_ * b.Im_ + this.Im_ * b.Re_;
        return new Complex(t.Re_, t.Im_);
    }
}