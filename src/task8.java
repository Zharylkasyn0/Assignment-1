import java.util.Scanner;
public class task8 {
    public static void generate(int[] result, int n, int k, int index) {
        if (index == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(result[i]);
                if (i < n - 1) System.out.print(" ");
            }
            System.out.println();
            return;
        }

        for (int i = 1; i <= k; i++) {
            result[index] = i;
            generate(result, n, k, index + 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        int[] sequence = new int[n];
        generate(sequence, n, k, 0);
    }
}
