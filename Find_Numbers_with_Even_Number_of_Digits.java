import java.util.Scanner;
public class FindEvenDigitNumbers
{
   public static int findEvenDigitNums(int arr[],int size)
   {
      int count=0;
	  for(int i=0;i<size;i++)
	  {
	       int digits_count=(int)Math.log10(arr[i]) + 1;
		   if(digits_count%2==0)
		       count++;
	  }
	  return count;
   }
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
	   int n,x[],i;
	   n=sc.nextInt();
	   x=new int[n];
	   for(i=0;i<n;i++)
	      x[i]=sc.nextInt();
		  
	  int result=findEvenDigitNums(x,n);
	  System.out.println(result);
   }
}
