import java.util.Scanner;
public class task7 {

    public static void fill(int[][] arr, int n, int row, int col, int num) {
        if (n <= 0) return;
        if (n == 1) {
            arr[row][col] = num;
            return;
        }

        for (int i = 0; i < n; i++)
            arr[row][col + i] = num++;

        for (int i = 1; i < n; i++)
            arr[row + i][col + n - 1] = num++;

        for (int i = n - 2; i >= 0; i--)
            arr[row + n - 1][col + i] = num++;

        for (int i = n - 2; i >= 1; i--)
            arr[row + i][col] = num++;

        fill(arr, n - 2, row + 1, col + 1, num);
    }

    public static void print(int[][] arr, int i, int j, int n) {
        if (i == n) return;

        System.out.print(arr[i][j]);

        if (j == n - 1) {
            System.out.println();
            print(arr, i + 1, 0, n);
        } else {
            System.out.print(" ");
            print(arr, i, j + 1, n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int[][] spiral = new int[n][n];
        fill(spiral, n, 0, 0, 1);
        print(spiral, 0, 0, n);
    }
}
