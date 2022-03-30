package datastructure.sort;

public class SelectionSort {

    public void selectionSort(int[] numbers, int n) {
        if (n == 1) {
            return;
        }

        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            if (numbers[i] > numbers[maxIndex]) {
                maxIndex = i;
            }
        }

        int temp = numbers[n - 1];
        numbers[n - 1] = numbers[maxIndex];
        numbers[maxIndex] = temp;
        
        selectionSort(numbers, n - 1);
    }
}
