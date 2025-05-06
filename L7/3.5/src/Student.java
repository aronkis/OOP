
class Student implements Cloneable 
{

    private String nume;
    private String prenume;
    private Masina masina;

    public Student(String nume, String prenume, Masina masina) 
    {
        this.nume = nume;
        this.prenume = prenume;
        this.masina = masina;
    }

    public String getNume() 
    {
        return nume;
    }

    public String getPrenume() 
    {
        return prenume;
    }

    public Masina getMasina() 
    {
        return masina;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException 
    {
        return super.clone();
    }

    public Student deepClone() throws CloneNotSupportedException 
    {
        Student clonedStudent = (Student) super.clone();
        clonedStudent.masina = (Masina) masina.clone();
        return clonedStudent;
    }

    @Override
    public String toString() 
    {
        return "Student: nume = " + nume + ", prenume = " + prenume + "; " + masina.toString();
    }
}
