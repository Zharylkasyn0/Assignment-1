import java.util.Scanner;
public class task5 {
    public static void NumberReverseRecursive(Scanner scanner, int n) {
        if (n == 0) {
            return;
        }
        int number = scanner.nextInt();

        NumberReverseRecursive(scanner, n - 1);

        System.out.print(number + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        NumberReverseRecursive(scanner, N);

        scanner.close();
    }
}
