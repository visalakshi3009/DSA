import java.util.Scanner;
class Grid
{
    public static int paths(int i, int j, int m, int n)
    {
        if(i == m-1 && j == n-1)
            return 1;
        if(i > m-1 || j > n-1)
            return 0;
        return paths(i+1, j, m, n) + paths(i, j+1, m, n);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m, n;
        System.out.println("Enter the matrix dimensions");
        m = sc.nextInt();
        n = sc.nextInt();
        System.out.println("The number of possible paths are " + paths(0, 0, m, n));
    }
}