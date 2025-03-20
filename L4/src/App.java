
// import java.awt.Color;

public class App {
    public static void main(String[] args) throws Exception {
        /* Ocupatie ocupatie = new Ocupatie("sofer", 
                                         "2018-06-19");
        Sofer sofer = new Sofer("John", "Doe", 22, 
                                1234123, ocupatie);
        
        Motor motor  = new Motor("BHA981", "Benzina", 
                                 1988, 170);
        
        Auto a = new Auto("LADA", Color.BLUE, 25, 
                          2, 155, 
                          motor, sofer);

        System.out.println("Masina: " + a.GetMarca());
        System.out.println("Viteza: " + a.GetViteza());
        System.out.println("Puterea masini: " + a.GetMotor().getPutere()); */

        // Problema 6
        System.out.println("\n\n\nProblema6:");

        Biblioteca biblioteca = new Biblioteca();

        Carte carte1 = new Carte("1984", "George Orwell");
        Carte carte2 = new Carte("Mândrie și prejudecată", "Jane Austen");
        Carte carte3 = new Carte("Micul Prinț", "Antoine de Saint-Exupéry");

        biblioteca.adaugaCarte(carte1);
        biblioteca.adaugaCarte(carte2);
        biblioteca.adaugaCarte(carte3);

        biblioteca.afiseazaCarti();
        biblioteca.imprumutaCarte("1984");
        biblioteca.afiseazaCarti();

        biblioteca.imprumutaCarte("1984");

        biblioteca.returneazaCarte("1984");
        biblioteca.afiseazaCarti();

    }
}

// chisdavid4321@gmail.com