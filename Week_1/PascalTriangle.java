import java.util.Scanner;
class PascalTriangle
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, i, j, a, b;
        System.out.println("Enter the number of rows");
        n = sc.nextInt();
        int[][] tri = new int[n][];
        for(i = 0; i<n; i++){
            tri[i] = new int[i + 1];
        }
        for(i = 0; i<n; i++){
            for(j = 0; j<=i; j++){
                if(j == 0 || i == j)
                    tri[i][j] = 1;
                else
                    tri[i][j] = tri[i-1][j-1] + tri[i-1][j];
            }
        }
        System.out.println("The Pascal's triangle is");
        for(i = 0; i<n; i++){
            for(j = 0; j<=i; j++)
                System.out.print(tri[i][j] + "\t");
            System.out.println();
        }
        System.out.println("The row " + n + " is");
        for(j = 0; j<n; j++)
            System.out.print(tri[n-1][j] + "\t");
        System.out.println("\nEnter a row and column number");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("The element in the corresponding position is " + tri[a-1][b-1]);
    }
}