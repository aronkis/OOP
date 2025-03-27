

public class App {
    public static void main(String[] args) throws Exception {
        Matrix mat1 = new Matrix(2, 2);
        Matrix mat2 = new Matrix(2, 2);

        for (int i = 0; i < mat1.GetRows(); i++)
        {
            for (int j = 0; j < mat1.GetCols(); j++)
            {
                mat1.AddValue(i, j, new Complex((float)(Math.random() * 9) + 1, 
                                                (float)(Math.random() * 9) + 1));
                mat2.AddValue(i, j, new Complex((float)(Math.random() * 9) + 1, 
                                                (float)(Math.random() * 9) + 1));
            }
        }
        mat1.Print();
        System.out.println();
        
        mat2.Print();
        System.out.println();

        mat1 = mat1.Add(mat2);
        mat1.Print();
        System.out.println();

        mat1 = mat1.Substract(mat2);
        mat1.Print();
        System.out.println();

        Matrix mat3 = mat1.Multiply(mat2);
        mat3.Print();
        System.out.println();
        
        mat1 = mat1.Multiply(new Complex(5, 0));
        mat1.Print();
        System.out.println();
    }
}
