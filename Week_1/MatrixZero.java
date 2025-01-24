import java.util.Scanner;
class MatrixZero
{
    public static int[][] modifyMatrix(int[][] mat)
    {
        int i, j, a, b, m, n;
        m = mat.length;
        n = mat[0].length;
        int[][] newMat = new int[m][n];
        for(i = 0; i<m; i++){
            for(j = 0; j<n; j++)
                newMat[i][j] = mat[i][j];
        }
        for(i = 0; i<m; i++){
            for(j = 0; j<n; j++){
                if(mat[i][j] == 0){
                   for(a = 0; a < m; a++)
                        newMat[a][j] = 0;
                    for(b = 0; b<n; b++)
                        newMat[i][b] = 0; 
                }
            }
        }
        return newMat;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m, n, i, j;
        System.out.println("Enter the dimensions of matrix");
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] mat = new int[m][n];
        System.out.println("Enter the matrix elements");
        for(i = 0; i<m; i++){
            for(j = 0; j<n; j++)
                mat[i][j] = sc.nextInt();
        }
        mat = modifyMatrix(mat);
        System.out.println("The new matrix is");
        for(i = 0; i<m; i++){
            for(j = 0; j<n; j++)
                System.out.print(mat[i][j] + "\t");
            System.out.println();
        }
    }
}