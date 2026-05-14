public class Hashing {

    public static void main(String[] args) {

        int[] arr = {74,16,84,37,38,78,40};
        int[] hash = new int[7];

        for (int i = 0; i < 7; i++)
            hash[i] = -1;

        for (int x : arr) {

            int idx = x % 7;

            while (hash[idx] != -1)
                idx = (idx + 1) % 7;

            hash[idx] = x;
        }

        for (int i = 0; i < 7; i++)
            System.out.println(i + " -> " + hash[i]);
    }
}