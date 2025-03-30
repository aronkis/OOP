
import java.util.ArrayList;

public class Ghiozdan {
    public Ghiozdan() {}

    public void add(Caiet caiet)
    {
        this.items_.addLast(caiet);
    }

    public void add(Manual manual)
    {
        this.items_.addLast(manual);
    }

    public void listItems()
    {
        for (Rechizita r : this.items_)
        {
            System.out.println(r.getNume());
        }
    }

    public void listManual()
    {
        for (Rechizita r : this.items_)
        {
            if (r instanceof Manual)
            {
                System.out.println(r.getNume());
            }
        }
    }

    public void listCaiet()
    {
        for (Rechizita r : this.items_)
        {
            if (r instanceof Caiet)
            {
                System.out.println(r.getNume());
            }
        }
    }

    public int getNrRechizite()
    {
        return this.items_.size();
    }

    public int getNrManuale()
    {
        int result = 0;

        for (Rechizita r : this.items_)
        {
            if (r instanceof Manual)
            {
                
                result++;
            }
        }
        return result;
    }

    public int getNrCaiete()
    {
        int result = 0;

        for (Rechizita r : this.items_)
        {
            if (r instanceof Caiet)
            {
                
                result++;
            }
        }
        return result;
    }

    private final ArrayList<Rechizita> items_ = new ArrayList<>();
}
