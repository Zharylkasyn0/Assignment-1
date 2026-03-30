import java.util.Scanner;
public class task6 {
    public static void StringReverseRecursive(Scanner scanner, int n) {
        if (n == 0) {
            return;
        }
        String text = scanner.nextLine();

        StringReverseRecursive(scanner, n - 1);

        System.out.print(text + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        StringReverseRecursive(scanner, N);
        scanner.close();
    }
}