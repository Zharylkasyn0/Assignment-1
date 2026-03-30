public class task4 {
    public static int baseSumRecursive(int b, int n){
        if(n==0){
            return 1;
        }
        return baseSumRecursive(b, n - 1) + (int)Math.pow(b, n);
    }
    public static void main(String[] args){
        System.out.println(baseSumRecursive(4, 3));
    }
}
