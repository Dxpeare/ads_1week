package assignment1;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        double AVG = 0;
        for (int i = 0; i < n; i++) {
            AVG += arr[i];
        }
        System.out.println(AVG/ arr.length);
    }
}
