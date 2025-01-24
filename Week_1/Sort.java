import java.util.Scanner;
class Sort
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, i, low, mid, high, temp;
        System.out.println("Enter the size of array");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements, either 0, 1 or 2");
        for(i = 0; i<n; i++)
            arr[i] = sc.nextInt();
        low = 0;
        mid = 0;
        high = n-1;
        while(mid <= high){
            if(arr[mid] == 0){
                temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 1)
                mid++;
            else{
                temp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = temp;
                high--;
            }
        }
        System.out.println("The sorted array is");
        for(i = 0; i<n; i++)
            System.out.print(arr[i] + "\t");
        System.out.println();
    }
}