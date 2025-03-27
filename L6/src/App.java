public class App {
    public static void main(String[] args) throws Exception {
        Manual m1 = new Manual("1");
        Manual m2 = new Manual("2");
        Manual m3 = new Manual("3");

        Caiet c1 = new Caiet("A");
        Caiet c2 = new Caiet("B");
        Caiet c3 = new Caiet("C");

        Ghiozdan g = new Ghiozdan();

        g.add(c1);
        g.add(c2);
        g.add(c3);

        g.add(m1);
        g.add(m2);
        g.add(m3);

        System.out.println("Rechizite: ");
        g.listItems();
        System.out.println("\nCaiete: ");
        g.listCaiet();
        System.out.println("\nManuale: ");
        g.listManual();

        System.out.println("\nNumarul de rechizite = " + g.getNrRechizite());
        System.out.println("Numarul de caiete = " + g.getNrCaiete());
        System.out.println("Numarul de manuale = " + g.getNrManuale());


    }
}
