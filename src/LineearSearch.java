public class LineearSearch {

    public static void main(String[] args) {

        int[] arr = {74,16,84,37,38,78,40,77,27,64};
        int target = 84;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == target) {
                System.out.println("Found at index " + i);
                break;
            }
        }
    }
}
