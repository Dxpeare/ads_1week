package assignment1;
import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int devided = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                devided++;
            }
        }
        if (devided == 2) {
            System.out.println("Prime");
        } else
            System.out.println("Composite");
    }
}


