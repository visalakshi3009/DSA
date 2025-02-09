import java.util.Scanner;
class MergeIntervals
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m, i, j, temp;
        System.out.println("Enter the number of intervals");
        m = sc.nextInt();
        int[][] intervals = new int[m][2];
        System.out.println("Enter the intervals");
        for(i = 0; i<m; i++){
            for(j = 0; j<2; j++)
                intervals[i][j] = sc.nextInt();
        }
        int[][] newIntervals = new int[m][2];
        int pos = 0;
        for(i = 0; i<m-1; i++){
            pos = i;
            for(j = i+1; j<m; j++){
                if(intervals[j][0] < intervals[pos][0])
                    pos = j;
                else if(intervals[j][0] == intervals[pos][0] && intervals[j][1] < intervals[pos][1])
                    pos = j;
            }
            temp = intervals[i][0];
            intervals[i][0] = intervals[pos][0];
            intervals[pos][0] = temp;
            temp = intervals[i][1];
            intervals[i][1] = intervals[pos][1];
            intervals[pos][1] = temp;
        }
        pos = 0;
        newIntervals[pos][0] = intervals[0][0];
        newIntervals[pos][1] = intervals[0][1];
        for(i = 1; i<m; i++){
            if(intervals[i][0] <= newIntervals[pos][1])
                newIntervals[pos][1] = intervals[i][1];
            else{
                newIntervals[++pos][0] = intervals[i][0];
                newIntervals[pos][1] = intervals[i][1];
            }
        }
        System.out.println("The Merged intervals are");
        for(i = 0; i<=pos; i++){
            for(j = 0; j<2; j++)
                System.out.print(newIntervals[i][j] + "\t");
            System.out.println();
        }
    }
}