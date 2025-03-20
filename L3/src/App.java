import java.math.BigInteger;
import java.util.Scanner;

public class App {
    public static boolean Prime(int n)
    {
        if (n == 0 || n == 1)
        {
            return false;
        }
        if (n == 2)
        {
            return true;
        }
        if (n % 2 == 0)
        {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
            {
                return false;
            }
        }

        return true;
    }

    public static void Goldbach (int m, int n)
    {
        for (int i = m; i <= n; i++)
        {
            if (i % 2 == 0)
            {
                for (int j = 2; j <= i; j++)
                {
                    for (int k = j; k <= i; k++)
                    {
                        if (Prime(j) && Prime(k) && j + k == i)
                        {
                            System.out.print(j);
                            System.out.print(" + ");
                            System.out.print(k);
                            System.out.print(" = ");
                            System.out.println(i);
                        }
                    }
                }
            }
        }
    }


    public static void Newton(float a, float b, float c, float x_0, float epsilon)
    {
        int nr_of_iterations = 0;
        float x_n = x_0;
        float x_n1 = 9999.0f;
        float diff = x_n1 - x_n;

        System.out.print(a + "x^2 + ");
        System.out.print(b + "x + ");
        System.out.print(c + " = 0");

        while (Math.abs(diff) > epsilon)
        {
            x_n1 = x_n - ((a * x_n * x_n + b * x_n + c) / (a * 2 * x_n + b));
            diff = x_n1 - x_n;
            x_n = x_n1;
            nr_of_iterations++;
        }
        System.out.print("\nx_1 = " + x_n1);
        System.out.print(" --- n_it = " + nr_of_iterations);
        System.out.print(" --- eps = " + epsilon + "\n");
    }

    public static void GetVowel(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            if ("aeiou".indexOf((str.charAt(i))) != -1)
            {
                System.out.print(str.charAt(i) + " ");
            }
        }
    }

    public static void GetVowelPosition(String str, char c)
    {
        for (int i = 0; i < str.length(); i++)
        {
            if (c == (str.charAt(i)))
            {
                System.out.print(i + 1 + " ");
            }
        }
    }
    public static String Factorial(int n)
    {
        BigInteger f = BigInteger.ONE; 

        for (int i = 2; i <= n; i++)
            f = f.multiply(BigInteger.valueOf(i));

        return f.toString();
    }

    public static void ChanceToWin()
    {
        System.out.println("Chance to win the lottery = " + 
                                    (Double.parseDouble(Factorial(6)) 
                                     / Double.parseDouble(Factorial(49-6)))
        );
    }

    public static void LotterySimulator()
    {
        int arr[] = new int[50];
        int r = (int)(Math.random() * 49) + 1;
        int i = 0;

        while (i < 6)
        {
            if (arr[r] == 0)
            {
                arr[r] = 1;
                System.out.print(r + " ");
                i++;
            }
            r = (int)(Math.random() * 49) + 1;
        }
    }


    public static void PrintOrderedLottoNumbers(int drawnNumbers[])
    {
        long bitSet = 0;
        
        for (int i = 0; i < 6; i++) 
        {
            bitSet |= (1L << drawnNumbers[i]);
        }

        System.out.println("Numbers in ascending order:");
        for (int i = 0; i <= 63; i++) 
        {
            if ((bitSet & (1L << i)) != 0) 
            {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        System.out.println("Numbers in descending order:");
        for (int i = 63; i >= 0; i--) 
        {
            if ((bitSet & (1L << i)) != 0) 
            {
                System.out.print(i + " ");
            }
        }

    }

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        // P1
        // System.out.print("m = ");
        // int m = s.nextInt();
        // System.out.print("n = ");
        // int n = s.nextInt();
        // Goldbach(m, n);


        // P2
        // float a, b, c, x_0;
        // // System.out.print("a = ");
        // // a = s.nextInt();
        // // System.out.print("b = ");
        // // b = s.nextInt();
        // // System.out.print("c = ");
        // // c = s.nextInt();
        // // System.out.print("x_0 = ");
        // // x_0 = s.nextInt();
        // a = 3;
        // b = -4;
        // c = -6;
        // x_0 = 1;        

        // Newton(a, b, c, x_0, 0.01f);
        // Newton(a, b, c, x_0, 0.001f);
        // Newton(a, b, c, x_0, 0.0001f);
        // Newton(a, b, c, x_0, 0.00001f);
        // Newton(a, b, c, x_0, 0.000001f);


        // P3
        // System.out.print("Input = ");
        // String str = new String(s.nextLine());
        // GetVowel(str);
        // System.out.print("\nPosition of character: ");
        // String c = s.nextLine();
        // GetVowelPosition(str, 'a');
        // System.out.print("\n");

        // P4
        // ChanceToWin();

        // P5
        // LotterySimulator();

        // P6
        int arr[] = {1,48,12,33,45,21};
        PrintOrderedLottoNumbers(arr);
        
        s.close();

    }
}