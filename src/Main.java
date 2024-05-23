import Practice.BasicFunction;
import Practice.QuadraticSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4, 6, 8, 5, 3, 2, 4};
        QuadraticSort.insertionSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(BasicFunction.binarySearch(arr,3));
    }
}