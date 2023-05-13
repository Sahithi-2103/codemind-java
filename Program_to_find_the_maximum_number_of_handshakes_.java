import java.util.Scanner;
public class shakes
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,tn;
        n=sc.nextInt();
        tn=(n*(n-1))/2;
        System.out.println(tn);
    }
}