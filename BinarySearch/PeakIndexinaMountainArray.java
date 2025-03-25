package BinarySearch;

class PeakIndexInMountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] < arr[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        PeakIndexInMountainArray search = new PeakIndexInMountainArray();

        int[] arr1 = {0, 2, 5, 3, 1}; // Peak at index 2
        System.out.println("Peak Index: " + search.peakIndexInMountainArray(arr1));

        int[] arr2 = {1, 3, 8, 12, 4, 2}; // Peak at index 3
        System.out.println("Peak Index: " + search.peakIndexInMountainArray(arr2));

        int[] arr3 = {10, 20, 30, 40, 50, 40, 30, 20, 10}; // Peak at index 4
        System.out.println("Peak Index: " + search.peakIndexInMountainArray(arr3));

        int[] arr4 = {0, 10, 20, 30, 40, 30, 20, 10, 0}; // Peak at index 4
        System.out.println("Peak Index: " + search.peakIndexInMountainArray(arr4));
    }
}
