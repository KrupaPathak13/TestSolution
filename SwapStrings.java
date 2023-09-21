/*Swap two Strings Without Using any Third Variable
 Input: a = "Hello", b = "World".
Output: Strings after swap: a = World and b = Hello*/

import java.util.Scanner;

public class SwapStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the  String1: ");
        String a = sc.nextLine();

        System.out.print("Enter the String2: ");
        String b = sc.nextLine();

        System.out.println("Strings before swap: a = " + a + " and b = " + b);

        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());

        System.out.println("Strings after swap: a = " + a + " and b = " + b);
    }
}
