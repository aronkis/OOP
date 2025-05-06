
public class Matrice 
{

    Numeric vals[][];
    int rows;
    int cols;

    public Matrice(int rows, int cols) 
    {
        this.rows = rows;
        this.cols = cols;
        vals = new Numeric[rows][cols];
    }

    public void add(Matrice mat) 
    {
        for (int i = 0; i < this.rows; i++) 
        {
            for (int j = 0; j < this.cols; j++) 
            {
                this.vals[i][j].add(mat.vals[i][j]);
            }
        }
    }

    public void sub(Matrice mat) 
    {
        for (int i = 0; i < this.rows; i++) 
        {
            for (int j = 0; j < this.cols; j++) 
            {
                this.vals[i][j].sub(mat.vals[i][j]);
            }
        }
    }

    public void mul(Matrice b) 
    {
        if (this.cols != b.cols) 
        {
            System.out.println("Error.");
            return;
        }

        Matrice t = this;
        for (int i = 0; i < this.rows; i++) 
        {
            for (int j = 0; j < b.cols; j++) 
            {
                Numeric sum = null;
                for (int k = 0; k < cols; k++) 
                {
                    Numeric product = t.vals[i][k];
                    product.mul(b.vals[k][j]);
                    if (sum == null) 
                    {
                        sum = product;
                    } else 
                    {
                        sum.add(product);
                    }
                }
                this.vals[i][j] = sum;
            }
        }
    }

    public void muls(Numeric b) 
    {
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                this.vals[i][j].mul(b);
            }
        }
    }
}
