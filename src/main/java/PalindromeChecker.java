import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        // TODO: Create a Scannner and read a full line from the user with nextLine().
        //       Keep the original input string so you can print it in the final message.
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = sc.nextLine();
        // TODO: Build a lowercase version of the input for checking (case-insensitive comparison).
        //       (You don't need to remove spaces/punctuation for the current tests.)
        String lowercaseWord = word.toLowerCase();
        // TODO: Determine whether the lowercase string reads the same forwards and backwards.
        //       Tip: compare it to a reversed copy of itself.
        String reversedWord = "";
        for (int i = lowercaseWord.length() - 1; i >= 0; i--) {
            reversedWord += lowercaseWord.charAt(i);
        }
        boolean palindrome = lowercaseWord.equals(reversedWord);
        // TODO: Treat single-character inputs as palindromes (the above check will already handle this).

        // TODO: Print EXACTLY ONE of the following lines (no extra punctuation/labels):
        //       "<original> is a palindrome"
        //       "<original> is not a palindrome"
        //       where <original> is exactly what the user typed (preserve casing).
        if (palindrome == true)
        {
            System.out.println(word + " is a palindrome");
        }
        else{
            System.out.println(word + " is NOT a palindrome");
        }
    }
}