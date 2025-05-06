
public class Persoana implements Comparable<Persoana> 
{

    private String nume;
    private String prenume;
    private Integer varsta;

    public Persoana(String nume, String prenume, Integer varsta) 
    {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
    }

    public String getNume() 
    {
        return nume;
    }

    public String getPrenume() 
    {
        return prenume;
    }

    public Integer getVarsta() 
    {
        return varsta;
    }

    @Override
    public int compareTo(Persoana other) 
    {
        // return this.nume.compareTo(other.getNume());
        return this.varsta.compareTo(other.getVarsta());
    }

    @Override
    public String toString() 
    {
        return "Persoana:"
                + "nume='" + nume + '\''
                + ", prenume='" + prenume + '\''
                + ", varsta=" + varsta;
    }
}
