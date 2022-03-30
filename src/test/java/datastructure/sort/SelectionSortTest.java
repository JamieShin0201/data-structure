package datastructure.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SelectionSortTest {

    SelectionSort s = new SelectionSort();

    @Test
    void selectionSort() {
        int[] numbers = {3, 2, 1, 4, 5};
        int[] sortedNumbers = {1, 2, 3, 4, 5};
        s.selectionSort(numbers, numbers.length);

        Assertions.assertArrayEquals(numbers, sortedNumbers);
    }
}
