import java.util.Arrays;

public class quicksort {

    public static void partition(int[] arr) {
        // Берем первый элемент как Pivot (индекс 0)
        int pivot = arr[0];
        // i — это граница элементов, которые меньше pivot
        int i = 0;


        // Проходим по всем элементам после pivot
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] < pivot) {
                i++;
                // Меняем местами текущий элемент с тем, что стоит на границе "меньших"
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // ФИНАЛЬНЫЙ ШАГ:
        // Меняем местами pivot (индекс 0) и последний элемент, который был меньше него (индекс i)
        // Именно здесь 64 улетает на 0-й индекс, а 74 встает на свое место.
        int temp = arr[0];
        arr[0] = arr[i];
        arr[i] = temp;


    }

    public static void main(String[] args) {
        // Твой набор данных из варианта
        int[] dataset = {74, 16, 84, 37, 38, 78, 40, 77, 27, 64};

        partition(dataset);

        System.out.println("Результат : " + Arrays.toString(dataset));
    }
}