
public class App 
{

    public static void main(String[] args) throws Exception 
    {
        Masina masina = new Masina("BMW", "Galben");
        Student student = new Student("Negru", "Ion", masina);

        Student shallowClonedStudent = (Student) student.clone();
        Student deepClonedStudent = student.deepClone();

        shallowClonedStudent.getMasina().setCuloare("Negru");

        System.out.println("Studentul de baza: " + student);
        System.out.println("Clonarea de suprafatã: " + shallowClonedStudent);

        deepClonedStudent.getMasina().setCuloare("Rosu");

        System.out.println("Clonarea de profunzime " + deepClonedStudent);
    }
}
