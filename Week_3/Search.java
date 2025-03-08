import java.util.Scanner;
class Search
{
    public static int binSearch(int[] arr, int ele)
    {
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] == ele)
                return mid;
            if(ele < arr[mid])
                high = mid-1;
            else
                low = mid+1;
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m, n, i, j, ele;
        boolean flag = false;
        int pos = 0;
        System.out.println("Enter the matrix dimensions");
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] matrix = new int[m][n];
        System.out.println("Enter the matrxi elements");
        for(i = 0; i<m; i++){
            for(j = 0; j<n; j++)
                matrix[i][j] = sc.nextInt();
        }
        System.out.println("Enter the element to be searched");
        ele = sc.nextInt();
        for(i = 0; i<m; i++){
            if(ele >= matrix[i][0] && ele <= matrix[i][n-1]){
                pos = binSearch(matrix[i], ele);
                flag = true;
                break;
            }
        }
        if(!flag || pos == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found in row " + (i+1) + " and column " + (pos+1));
    }
}