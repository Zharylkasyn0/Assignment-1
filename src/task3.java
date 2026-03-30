public class task3 {
    public static int SumPositive(int n) {
        if (n == 1) {
            return 1;
        }

        return SumPositive(n - 1) + n;
    }

    public static void main(String[] args) {
        System.out.println(SumPositive(5));
    }
}
