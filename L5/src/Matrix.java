public class Matrix {
    private final Complex[][] values_;
    private final int cols_;
    private final int rows_;

    public Matrix(int cols, int rows)
    {
        this.cols_ = cols;
        this.rows_ = rows;
        this.values_ = new Complex[rows][cols];
        for (int i = 0; i < this.rows_; i++)
        {
            for (int j = 0; j < this.cols_; j++)
            {
                this.values_[i][j] = new Complex();
            }
        }
    }

    public int GetRows() { return rows_; }
    public int GetCols() { return cols_; }

    public void AddValue(int i, int j, Complex a)
    {
        this.values_[i][j] = a;
    }

    public Complex GetValueOnPos(int i, int j)
    {
        return this.values_[i][j];
    }

    public Matrix Add(Matrix b)
    {
        if (this.rows_ != b.GetRows() || this.cols_ != b.GetCols()) {
            System.out.println("Error.");
            return this;
        }

        Matrix t = new Matrix(this.GetCols(), this.GetRows());
        for (int i = 0; i < rows_; i++)
        {
            for (int j = 0; j < cols_; j++)
            {
                t.values_[i][j] = this.values_[i][j].Add(b.GetValueOnPos(i, j));
            }
        }
        return t;
    }

    public Matrix Substract(Matrix b)
    {
        if (this.rows_ != b.GetRows() || this.cols_ != b.GetCols()) {
            System.out.println("Error.");
            return this;
        }

        Matrix t = new Matrix(this.GetCols(), this.GetRows());
        for (int i = 0; i < rows_; i++)
        {
            for (int j = 0; j < cols_; j++)
            {
                t.values_[i][j] = this.values_[i][j].Substract(b.GetValueOnPos(i, j));
            }
        }
        return t;
    }

    public Matrix Multiply(Complex b)
    {
        Matrix t = new Matrix(this.GetCols(), this.GetRows());
        for (int i = 0; i < rows_; i++)
        {
            for (int j = 0; j < cols_; j++)
            {
                t.values_[i][j] = this.values_[i][j].Multiply(b);
            }
        }
        return t;
    }

    public Matrix Multiply(Matrix b)
    {
        if (this.cols_ != b.GetRows()) {
            System.out.println("Error.");
            return this;
        }

        Matrix t = new Matrix(b.GetCols(), this.GetRows());
        for (int i = 0; i < this.rows_; i++) {
            for (int j = 0; j < b.GetCols(); j++) {
                Complex sum = new Complex();
                for (int k = 0; k < this.cols_; k++) {
                    Complex product = this.GetValueOnPos(i, k).Multiply(b.GetValueOnPos(k, j));
                    sum.Add(product);
                }
                t.AddValue(i, j, sum);
            }
        }
        return t;
    }

    public void Print()
    {
        for (int i = 0; i < rows_; i++)
        {
            System.out.print("| ");
            for (int j = 0; j < cols_; j++)
            {
                this.values_[i][j].Print();
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}
