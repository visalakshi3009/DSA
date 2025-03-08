import java.util.Scanner;
class ReversePairs
{
    public static int mergeSort(int[] A)
    {
        int reverse = 0;
        if(A.length > 1)
        {
            int[] B  = new int[A.length/2];
            int[] C = new int[A.length - A.length/2];
            for(int i = 0; i<A.length/2; i++)
                B[i] = A[i];
            int k = 0;
            for(int i = A.length/2; i<A.length; i++)
                C[k++] = A[i];
            reverse += mergeSort(B);
            reverse += mergeSort(C);
            reverse += merge(B, C, A);
        }
        return reverse;
    }
    public static int merge(int[] B, int[] C, int[] A)
    {
        int i = 0, j = 0, k = 0;
        int reverse = 0;
        while(i < B.length && j < C.length)
        {
            if(B[i] <= C[j])
                A[k] = B[i++];
            else{
                for(int z = i; z<B.length; z++){
                    if(B[z] > 2 * C[j])
                        reverse++;
                }
                A[k] = C[j++];
            }
            k++;
        }
        if(i < B.length){
            while(i < B.length)
                A[k++] = B[i++];
        }
        else if(j < C.length){
            while(j < C.length)
                A[k++] = C[j++];
        }
        return reverse;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, i;
        System.out.println("Enter the number of elements in array");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for(i = 0; i<n; i++)
            arr[i] = sc.nextInt();
        int reverse = mergeSort(arr);
        System.out.println("The number of reverse pairs are " + reverse);
    }
}