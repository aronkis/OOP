class Exceptie extends Exception 
{
    private String mesaj;

    public Exceptie(String mesaj) 
    {
        this.mesaj = mesaj;
    }

    public void afiseazaMesaj() 
    {
        System.out.println("Mesaj: " + mesaj);
    }
}