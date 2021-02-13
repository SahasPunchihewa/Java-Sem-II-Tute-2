import java.util.Scanner;
class Q7B
{
    public static void main(String [] args)
    {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int x = S.nextInt();
        if (x > 0) {
            System.out.println("The value is positive:");
        }
        if (x < 0) {
            System.out.println("The value is negative:");
        }
        else {
            System.out.println("The value is zero:");
        }
        System.out.println("Good Bye!");
    }
}

