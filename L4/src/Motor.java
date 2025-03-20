public class Motor {
    private String serie_;
    private String combustibil_;
    private int volum_;
    private int putere_;

    public Motor() {
        this.serie_ = "";
        this.combustibil_ = "";
        this.volum_ = 0;
        this.putere_ = 0;
    }

    public Motor(String serie, String combustibil, 
                 int volum, int putere) {
        this.serie_ = serie;
        this.combustibil_ = combustibil;
        this.volum_ = volum;
        this.putere_ = putere;
    }

    public String getSerie() { return serie_; }
    public void setSerie(String serie) { this.serie_ = serie; }

    public String getCombustibil() { return combustibil_; }
    public void setCombustibil(String combustibil) { this.combustibil_ = combustibil; }

    public int getVolume() { return volum_; }
    public void setVolume(int volume) { this.volum_ = volume; }

    public int getPutere() { return putere_; }
    public void setPutere(int putere) { this.putere_ = putere; }
}
