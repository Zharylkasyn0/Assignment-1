import java.util.Scanner;
public class task10 {
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }

        if (n % 2 == 0) {
            return isPowerOfTwo(n / 2);
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        boolean result = isPowerOfTwo(n);

        System.out.println(n + " is " + (result ? "" : "not ") + "a power of two");

        scanner.close();
    }
}