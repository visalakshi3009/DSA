import java.util.Scanner;
class Stocks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int profit = 0, max = 0;
        int n, i, min, pos;
        System.out.println("Enter the number of days");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the stock prices for each day");
        for(i = 0; i<n; i++)
            arr[i] = sc.nextInt();
        min = arr[0];
        pos = 0;
        for(i = 0; i<n-1; i++){
            if(arr[i] < min){
                min = arr[i];
                pos = i;
            }
        }
        for(i = pos + 1; i<n; i++){
            if(arr[i] > max && arr[i] > min)
                max = arr[i];
        }
        if(max != 0)
            profit = max - min;
        System.out.println("The maximum profit is " + profit);
    }
}