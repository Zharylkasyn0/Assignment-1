import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {

        int[] arr = {74,16,84,37,38,78,40,77,27,64};

        Arrays.sort(arr);

        int target = 78;
        int l = 0, r = arr.length - 1;

        while (l <= r) {

            int m = (l + r) / 2;

            if (arr[m] == target) {
                System.out.println("Found at index " + m);
                break;
            }

            if (arr[m] < target)
                l = m + 1;
            else
                r = m - 1;
        }
    }
}
