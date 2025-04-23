public class BinarySearch {
    public int search(int[] array, int val) {
        int left = 0, right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if(array[mid] == val) {
                return mid;
            }
            if(array[mid] < val) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
