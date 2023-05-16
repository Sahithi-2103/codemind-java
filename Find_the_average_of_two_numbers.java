import java.util.Scanner;
public class avg
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float a,b,c;
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=(a+b)/2;
        System.out.format("%.4f",c);
    }
}