/*Program to count occurrences of a given character in a string.*/
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter a character to count: ");
        char target = sc.next().charAt(0);

        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target) {
                count++;
            }
        }

        System.out.println("Count of character '" + target + "' in the string: " + count);
    }
}

