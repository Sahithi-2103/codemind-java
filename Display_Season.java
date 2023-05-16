import java.util.Scanner;
public class Sample
{
    public static String findSeason(int m)
    {  //logic for season find
        String season="-1";
        switch(m)
        {
            case 4:
            case 5:
            case 6:
                season="Summer";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                season="Rainy";
                break;
            case 11:
            case 12:
            case 1:
                season="Winter";
                break;
            case 2:
            case 3:
                season="Spring";
                break;
        }
        return season;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int month_num;
        month_num=sc.nextInt();
        String result=Sample.findSeason(month_num);
        System.out.println(result);
    }
}