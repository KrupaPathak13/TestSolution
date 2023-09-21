/* Determine whether a given string is Palindrome
*/
import java.util.*;

public class PalindromeString {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String:");
        String str = sc.nextLine();
        String revstr = "";
        boolean isPalindrome = true;

        char[] charStr = str.toCharArray();
        int size = charStr.length;

        for (int i = size - 1; i >= 0; i--) {
            revstr = revstr + charStr[i];
        }


        if (!revstr.equals(str))
        {
            isPalindrome = false;
        }

        System.out.println("Input: " + str);
        System.out.println("Output: " + isPalindrome);
    }
}
