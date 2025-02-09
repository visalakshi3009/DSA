import java.util.Scanner;
class ArraySort
{
    public static void sort(int[] arr)
    {
        int n = arr.length;
        for(int i = 0; i<n-1; i++){
            for(int j = 0; j<n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m, n, i, j, temp;
        System.out.println("Enter the size of the two arrays");
        m = sc.nextInt();
        n = sc.nextInt();
        int[] arr1 = new int[m];
        int[] arr2 = new int[n];
        System.out.println("Enter the elements of array 1");
        for(i = 0; i<m; i++)
            arr1[i] = sc.nextInt();
        System.out.println("Enter the elements of array 2");
        for(i = 0; i<n; i++)
            arr2[i] = sc.nextInt();
        i = m-1;
        j = 0;
        while(i >= 0 && j < n-1){
            if(arr1[i] > arr2[j]){
                temp = arr2[j];
                arr2[j] = arr1[i];
                arr1[i] = temp;
                i--;
                j++;
            }
            else
                break;
        }
        sort(arr1);
        sort(arr2);
        System.out.println("The elements are");
        for(i = 0; i<m; i++)
            System.out.print(arr1[i] + "\t");
        System.out.println();
        for(i = 0; i<n; i++)
            System.out.print(arr2[i] + "\t");
        System.out.println();
    }
}