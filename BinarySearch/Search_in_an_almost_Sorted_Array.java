package BinarySearch;

public class Search_in_an_almost_Sorted_Array {
    public int findTarget(int arr[], int target) {
        // Your code here
        int n = arr.length;
        int low = 0, high = arr.length - 1;
        while(low<=high){
            int mid = low + (high - low) / 2;
            if(arr[mid]==target  ) return mid;
            if(mid>low && arr[mid-1]==target) return mid-1;
            if(mid<high && arr[mid+1]==target)return mid+1;

            if (arr[mid] > target) {
                high = mid - 2;
            } else {
                low = mid + 2;
            }
        }
        return -1;
    }
}
