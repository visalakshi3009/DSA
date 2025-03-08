import java.util.Scanner;
class Power
{
    public static double power(double a, int b)
    {
        if(b == 0)
            return 1;
        if(b == 1)
            return a;
        double pow = power(a, b/2);
        if(b % 2 == 0)
            return pow * pow;
        return pow * pow * a;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        double x;
        System.out.println("Enter the double number");
        x = sc.nextDouble();
        System.out.println("Enter the power");
        n = sc.nextInt();
        System.out.println(x + "^" + n + " is " + power(x, n));
    }
}