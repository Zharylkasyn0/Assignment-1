import java.util.Arrays;

public class bubblesort {

    public static void main(String[] args) {

        int[] arr = {74,16,84,37,38,78,40,77,27,64};

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {

                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}