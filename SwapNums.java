/* Swap two numbers without using a temporary variable
 Input:integer a = "10", b = "50".
Output: Strings after swap: a = 50 and b = 10
*/
import java.util.Scanner;

public class SwapNums
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("a = " + a + " b = " + b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a = " + a + " b = " + b);

	}
}