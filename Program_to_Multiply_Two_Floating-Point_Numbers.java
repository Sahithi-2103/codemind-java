import java.util.Scanner;
public class two
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float x,y,z;
        x=sc.nextFloat();
        y=sc.nextFloat();
        z=x*y;
        System.out.format("%.2f",z);
    }
}