import java.util.Scanner;

public class WordCensor {
    public static void main(String[] args) {
        // TODO: Read a full sentence from the user using Scanner.nextLine()
        // TODO: Replace each banned word with exactly ***: dang, nuts, oops, yikes
        // TODO: Print the result prefixed with: Censored:
        // NOTE: Tests require exactly three asterisks (no ****) for every replacement
        Scanner scan = new Scanner(System.in);
        System.out.print("Input: ");
        String line =  scan.nextLine();
        line = line.toLowerCase();
        line = line.replace("dang", "***");
        line = line.replace("nuts", "***");
        line = line.replace("oops", "***");
        line = line.replace("yikes", "***");
        System.out.print("Censored: " + line);
    }
}
