public class App 
{
    public static void main(String[] args)
    {

        Matrice a = new Matrice(2,2);

        for (int i = 0; i < a.rows; i++)
        {
            for (int j = 0; j < a.cols; j++)
            {
                a.vals[i][j] = new Fractie(1.0, 2.0);
            }
        }

        for (int i = 0; i < a.rows; i++)
        {
            for (int j = 0; j < a.cols; j++)
            {
                System.out.print(((Fractie)a.vals[i][j]).getNum());
                System.out.print("/");                
                System.out.print(((Fractie)a.vals[i][j]).getDenom());
                System.out.print(" ");                
            }
            System.out.println();
        }

        for (int i = 0; i < a.rows; i++)
        {
            for (int j = 0; j < a.cols; j++)
            {
                a.vals[i][j].add(new Fractie(1.0, 3.0));
            }

        }

        System.out.println("\n");
        for (int i = 0; i < a.rows; i++)
        {
            for (int j = 0; j < a.cols; j++)
            {
                System.out.print(((Fractie)a.vals[i][j]).getNum());
                System.out.print("/");                
                System.out.print(((Fractie)a.vals[i][j]).getDenom());
                System.out.print(" ");                
            }
            System.out.println();
        }
    }
}
