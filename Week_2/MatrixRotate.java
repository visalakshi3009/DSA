import java.util.Scanner;
class MatrixRotate{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m, n, i, j;
        System.out.println("Enter the matrix dimensions");
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] matrix = new int[m][n];
        System.out.println("Enter the matrix elements");
        for(i = 0; i<m; i++){
            for(j = 0; j<n; j++)
                matrix[i][j] = sc.nextInt();
        }
        int[][] newMatrix = new int[n][m];
        for(i = 0; i<n; i++){
            for(j = 0; j<m; j++)
                newMatrix[i][j] = matrix[m-j-1][i];
        }
        System.out.println("The rotated matrix is");
        for(i = 0; i<n; i++){
            for(j = 0; j<m; j++)
                System.out.print(newMatrix[i][j] + "\t");
            System.out.println();
        }
    }
}