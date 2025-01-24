import java.util.Scanner;
class Kadane
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, i, max;
        int sum = 0;
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for(i = 0; i<n; i++)
            arr[i] = sc.nextInt();
        max = 0;
        for(i = 0; i<n; i++){
            sum += arr[i];
            if(sum > max)
                max = sum;
            if(sum < 0)
                sum = 0;
        }
        System.out.println("The maximum sum is " + max);
    }
}