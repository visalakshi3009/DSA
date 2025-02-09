import java.util.Scanner;
class Inversion
{
    public static int MergeSort(int[] A)
    {
        int inversion = 0;
        if(A.length > 1){
            int n = A.length;
            int[] B = new int[n/2];
            int[] C = new int[n - (n/2)];
            int k = 0;
            for(int i = 0; i<n/2; i++)
                B[i] = A[k++];
            for(int i = 0; i<n - (n/2); i++)
                C[i] = A[k++];
            inversion += MergeSort(B);
            inversion += MergeSort(C);
            inversion += Merge(B, C, A);
        }
        return inversion;
    }
    public static int Merge(int[] B, int[] C, int [] A)
    {
        int i = 0, j = 0, k = 0;
        int inversion = 0;
        while(i < B.length && j < C.length){
            if(B[i] <= C[j]){
                A[k] = B[i];
                i++;
            }
            else{
                A[k] = C[j];
                j++;
                inversion += (B.length - i);
            }
            k++;
        }
        if(i < B.length){
            for(; i<B.length; i++)
                A[k++] = B[i];
        }
        else if(j < C.length){
            for(; j<C.length; j++)
                A[k++] = C[j];
        }
        return inversion;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int inversion;
        int n, i;
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        System.out.println("Enter the array elements");
        int[] A = new int[n];
        for(i = 0; i<n; i++)
            A[i] = sc.nextInt();
        inversion = MergeSort(A);
        System.out.println("The inversion of the array is " + inversion);
    }
}

