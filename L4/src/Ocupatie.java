public class Ocupatie {
    private String denumire;
    private String data_incepari;

    public Ocupatie() {
        this.denumire = "";
        this.data_incepari = "";
    }

    public Ocupatie(String denumire, String data_incepari) {
        this.denumire = denumire;
        this.data_incepari = data_incepari;
    }

    public String getDenumire() { return denumire; }
    public void setDenumire(String denumire) { this.denumire = denumire; }

    public String getData_incepari() { return data_incepari; }
    public void setData_incepari(String data_incepari) { this.data_incepari = data_incepari; }
}
