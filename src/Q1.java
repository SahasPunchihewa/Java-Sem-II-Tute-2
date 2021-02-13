import java.util.Scanner;

public class Q1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Temperature : ");
        float temp=sc.nextFloat();
        if(temp>30)
        {
            System.out.println("Hot");
        }
        else
        {
            System.out.println("Cold");
        }
    }
}
