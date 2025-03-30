class Insecta {
    private int i = 9;
    protected int j;

    Insecta() {
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }

    private static int x1 = printInit("static Insecta.x1 initializata");

    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}

class Gindac extends Insecta {
    private int k = printInit("Gindac.k initializat");

    public Gindac() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }

    private static int x2 = printInit("static Gindac.x2 initializat");
}

class Fluture extends Insecta {
    private int l = printInit("Fluture.l initializat");

    public Fluture() {
        System.out.println("l = " + l);
        System.out.println("j = " + j);
    }

    private static int x3 = printInit("static Fluture.x3 initializat");
}

class SuperGindac extends Gindac {
    private int m = printInit("SuperGindac.m initializat");

    public SuperGindac() {
        System.out.println("m = " + m);
    }

    private static int x4 = printInit("static SuperGindac.x4 initializat");
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Main constructor");

        System.out.println("\nCreare obiect Gindac:");
        Gindac g = new Gindac();
        
        System.out.println("\nCreare obiect Fluture:");
        Fluture f = new Fluture();
        
        System.out.println("\nCreare obiect SuperGindac:");
        SuperGindac sg = new SuperGindac();
    }
}
