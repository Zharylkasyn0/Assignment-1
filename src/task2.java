public class task2 {
    public static int arraySumRecursive(int[] arr, int n) {
        if (n == 0)
            return 0;
        return arraySumRecursive(arr, n-1) + arr[n-1];
    }

    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arraySumRecursive(arr, 5));
    }
}