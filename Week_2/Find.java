import java.util.Scanner;
class Find
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = 8;
        int i, missing;
        int sum = 0;
        int duplicate = 0;
        int[] arr = {3, 1, 2, 5, 4, 6, 7, 5};
        int[] count = new int[n];
        for(i = 0; i<n; i++){
            count[i] = 0;
            sum += arr[i];
        }
        for(i = 0; i<n; i++){
            count[arr[i]-1] += 1;
            if(count[arr[i]-1] > 1){
                System.out.println("Duplicate element: " + arr[i]);
                duplicate = arr[i];
                break;
            }
        }
        missing = ((n*(n+1))/2) - (sum - duplicate);
        System.out.println("Missing element: " + missing);
    }
}