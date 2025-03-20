public class Sofer {
    private String nume_;
    private String prenume_;
    private int varsta_;
    private long numar_de_permis_de_conducere_;
    private Ocupatie ocupatie_;

    public Sofer() {
        this.nume_ = "";
        this.prenume_ = "";
        this.varsta_ = 0;
        this.numar_de_permis_de_conducere_ = 0;
        this.ocupatie_ = new Ocupatie();
    }

    public Sofer(String nume, String prenume, 
                 int varsta, long numar_de_permis_de_conducere,
                 Ocupatie ocupatie) {
        this.nume_ = nume;
        this.prenume_ = prenume;
        this.varsta_ = varsta;
        this.numar_de_permis_de_conducere_ = numar_de_permis_de_conducere;
        this.ocupatie_ = ocupatie;
    }

    public String GetNume() { return nume_; }
    public String GetPrenume() { return prenume_; }
    public int GetVarsta() { return varsta_; }
    public long GetNumar_de_permis_de_conducere() { return numar_de_permis_de_conducere_; }
    public Ocupatie GetOcupatie() { return ocupatie_; }

    public void SetNume(String nume) { this.nume_ = nume; }
    public void SetPrenume(String prenume) { this.prenume_ = prenume; }
    public void SetVarsta(int varsta) { this.varsta_ = varsta; }
    public void SetNumar_de_permis_de_conducere(long numar_de_permis_de_conducere) { this.numar_de_permis_de_conducere_ = numar_de_permis_de_conducere; }
    public void SetOcupatie(Ocupatie ocupatie) { this.ocupatie_ = ocupatie; }
}

