import java.util.Arrays;

public class MergeSort {

    static void mergeSort(int[] a) {

        if (a.length < 2) return;

        int mid = a.length / 2;

        int[] left = Arrays.copyOfRange(a, 0, mid);
        int[] right = Arrays.copyOfRange(a, mid, a.length);

        mergeSort(left);
        mergeSort(right);

        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length)
            a[k++] = left[i] < right[j] ? left[i++] : right[j++];

        while (i < left.length) a[k++] = left[i++];
        while (j < right.length) a[k++] = right[j++];
    }

    public static void main(String[] args) {

        int[] arr = {74,16,84,37,38,78,40,77,27,64};

        mergeSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}