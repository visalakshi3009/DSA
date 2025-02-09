import java.util.Scanner;
class Duplicate
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int i;
        int[] arr = {3, 1, 3, 4, 2};
        int[] count = new int[n];
        for(i = 0; i<n; i++)
            count[i] = 0;
        for(i = 0; i<n; i++){
            count[arr[i]] += 1;
            if(count[arr[i]] > 1){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}