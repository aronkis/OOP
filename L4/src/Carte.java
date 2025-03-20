public class Carte {
    private String titlu;
    private String autor;
    private boolean esteDisponibila;

    // Constructor
    public Carte(String titlu, String autor) {
        this.titlu = titlu;
        this.autor = autor;
        this.esteDisponibila = true;
    }

    public String getTitlu() {
        return titlu;
    }

    public String getAutor() {
        return autor;
    }

    public boolean esteDisponibila() {
        return esteDisponibila;
    }

    public void imprumuta() {
        if (esteDisponibila) {
            esteDisponibila = false;
            System.out.println("Cartea \"" + titlu + "\" a fost împrumutată.");
        } else {
            System.out.println("Cartea \"" + titlu + "\" nu este disponibilă pentru împrumut.");
        }
    }

    public void returneaza() {
        if (!esteDisponibila) {
            esteDisponibila = true;
            System.out.println("Cartea \"" + titlu + "\" a fost returnată.");
        } else {
            System.out.println("Cartea \"" + titlu + "\" nu era împrumutată.");
        }
    }
}
