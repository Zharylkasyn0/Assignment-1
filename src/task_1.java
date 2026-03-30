public class task_1 {
    public static int squareNumbersSumRecursive(int n) {
        if (n == 1)
            return 1;
        return squareNumbersSumRecursive(n - 1) + n * n;
    }

    public static void main(String[] args){
        System.out.println(squareNumbersSumRecursive(5));
    }
}