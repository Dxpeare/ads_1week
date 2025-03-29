package assignment1;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        printPermutations(str, "");
        scanner.close();
    }
    public static void printPermutations(String str, String prefix) {
        if (str.isEmpty()) {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            String newStr = str.substring(0, i) + str.substring(i + 1);
            printPermutations(newStr, prefix + str.charAt(i));
        }
    }
}

