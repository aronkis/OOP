public class TestGaraj {
    public static void main(String[] args) {
        Masina masina1 = new Masina("BMW", 200f,,"Negru", 5, 2, "Benzina");
        Masina masina2 = new Masina("Audi", ,250f, "Rosu", 5, 4, "Motorina");

        Motocicleta moto1 = new Motocicleta("Kawasaki", 180f, "Verde", 2, "Sport");
        Motocicleta moto2 = new Motocicleta("Harley", 150f, "Negru", 2, "Cruiser");

        Garaj garaj = new Garaj();
        garaj.adaugaVehicul(masina1);
        garaj.adaugaVehicul(masina2);
        garaj.adaugaVehicul(moto1);
        garaj.adaugaVehicul(moto2);

        garaj.afiseazaVehicule();

        for (Vehicul v : garaj.getVehicule()) {
            if (v instanceof Autoturism) {
                ((Autoturism)v).porneste();
                v.accelereaza(50);
                System.out.println("Viteza curenta: " + v.getViteza() + " km/h");
                ((Autoturism)v).opreste();
            }
        }
        garaj.afiseazaVehicule();
    }
}
