import java.util.Scanner;
class Order
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n, i, j, min, temp, pos;
        boolean flag = false;
        System.out.println("Enter the number of digits");
        n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the digits");
        for(i = 0; i<n; i++)
            arr[i] = sc.nextInt();
        for(i = n-1; i>0; i--){
            if(arr[i] > arr[i-1]){
                min = arr[i];
                pos = i;
                for(j = i + 1; j<n; j++){
                    if(arr[j] > arr[i-1] && arr[j] < min){
                        min = arr[j];
                        pos = j;
                    }
                }
                arr[pos] = arr[i-1];
                arr[i-1] = min;
               for(j = 0; j<(n-i)/2; j++){
                temp = arr[i+j];
                arr[i+j] = arr[n-j-1];
                arr[n-j-1] = temp;
               }
                flag = true;
                break;
            }
        }
        if(!flag){
            for(j = 0; j<n/2; j++){
                temp = arr[j];
                arr[j] = arr[n-j-1];
                arr[n-j-1] = temp;
            }
        }
        System.out.println("The next order is");
        for(i = 0; i<n; i++)
            System.out.print(arr[i] + "\t");
        System.out.println();
    }
}