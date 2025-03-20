import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Carte> carti;

    // Constructor
    public Biblioteca() 
    {
        carti = new ArrayList<>();
    }

    // Adăugăm o carte în bibliotecă
    public void adaugaCarte(Carte carte) {
        carti.add(carte);
        System.out.println("Cartea \"" + carte.getTitlu() + "\" a fost adăugată în bibliotecă.");
    }

    // Împrumută o carte
    public void imprumutaCarte(String titlu) {
        for (Carte carte : carti) {
            if (carte.getTitlu().equalsIgnoreCase(titlu)) {
                carte.imprumuta();
                return;
            }
        }
        System.out.println("Cartea \"" + titlu + "\" nu există în bibliotecă.");
    }

    // Returnează o carte
    public void returneazaCarte(String titlu) {
        for (Carte carte : carti) {
            if (carte.getTitlu().equalsIgnoreCase(titlu)) {
                carte.returneaza();
                return;
            }
        }
        System.out.println("Cartea \"" + titlu + "\" nu există în bibliotecă.");
    }

    // Afișează toate cărțile din bibliotecă
    public void afiseazaCarti() {
        System.out.println("Cărțile disponibile în bibliotecă:");
        for (Carte carte : carti) {
            if (carte.esteDisponibila()){
                System.out.println("\t" + carte.getTitlu());
            }
        }
    }
}