import java.util.Scanner;

public class Q5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Character : ");
        char input=sc.next().charAt(0);
        if(Character.isUpperCase(input))
        {
            System.out.println("Uppercase");
        }
        else
        {
            System.out.println("lowercase");
        }
    }
}
