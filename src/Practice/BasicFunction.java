package Practice;

public class BasicFunction {
    public static int binarySearch(int[] arr, int target) {
        int beg = 0, end = arr.length - 1, mid;
        while (beg <= end) {
            mid = beg + (end - beg) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target)
                end = mid - 1;
            else if (arr[mid] < target)
                beg = mid + 1;
        }
        return -1;
    }
}
