import java.util.*;
class Calculator
{
    public int Addition(int a,int b)
    {
        return a+b;
    }
    public int Addition(int a,int b, int c)
    {
        return a+b+c;
    }
    public double Addition(double [] a)
    {
        int sum =0;
        for(int i=0;i<a.length;i++)
            sum += a[i];
        return sum;
    }
}
public class Test
{
    public static void main(String[] args)
    {
        Calculator c = new Calculator();
        System.out.print("Addition = " + c.Addition(3,5));
        System.out.print("Addition = " + c.Addition(3,5,7));
        // Testing overloaded mmethod with array
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = sc.nextInt();
        double [] x = new double [size];
        System.out.println("Enter array elements:");
        for(int i=0;i<size;i++)
          x[i] = sc.nextDouble();
        System.out.print("Addition = " + c.Addition(x));        
    }
}
