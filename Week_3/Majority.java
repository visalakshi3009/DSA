import java.util.Scanner;
class Majority
{
    public static void mergeSort(int[] A)
    {
        if(A.length > 1)
        {
            int[] B  = new int[A.length/2];
            int[] C = new int[A.length - A.length/2];
            for(int i = 0; i<A.length/2; i++)
                B[i] = A[i];
            int k = 0;
            for(int i = A.length/2; i<A.length; i++)
                C[k++] = A[i];
            mergeSort(B);
            mergeSort(C);
            merge(B, C, A);
        }
    }
    public static void merge(int[] B, int[] C, int[] A)
    {
        int i = 0, j = 0, k = 0;
        while(i < B.length && j < C.length)
        {
            if(B[i] <= C[j])
                A[k] = B[i++];
            else
                A[k] = C[j++];
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
    }
    public static int majority(int[] arr)
    {
        mergeSort(arr);
        int modeFrequency = 0;
        int mode = 0;
        int i = 0;
        while(i < arr.length){
            int runVal = arr[i];
            int runFrequency = 1;
            while((i + runFrequency) < arr.length && arr[i+runFrequency] == runVal)
                runFrequency++;
            if(runFrequency > arr.length/2 && runFrequency > modeFrequency){
                mode = runVal;
                modeFrequency = runFrequency;
            }
            i += runFrequency;
        }
        return mode;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, i;
        System.out.println("Enter the number of elements in the array");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for(i = 0; i<n; i++)
            arr[i] = sc.nextInt();
        System.out.println("The mode is " + majority(arr));
    }
}