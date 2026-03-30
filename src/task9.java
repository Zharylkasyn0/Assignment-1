import java.util.Scanner;
public class task9 {
    public static void permute(char[] arr, int start, int length) {
        if (start == length - 1) {
            for (int i = 0; i < length; i++) {
                System.out.print(arr[i]);
            }
            System.out.println();
            return;
        }

        for (int i = start; i < length; i++) {
            swap(arr, start, i);
            permute(arr, start + 1, length);
            swap(arr, start, i);
        }
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        sc.close();

        char[] chars = input.toCharArray();
        permute(chars, 0, chars.length);
    }
}
