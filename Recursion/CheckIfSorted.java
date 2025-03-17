package Recursion;

public class CheckIfSorted {
    public static boolean arraySortedOrNot(int[] arr, int n) {
            if (n == 1 || n == 0) {
                return true;
            }
            return arr[n - 1] >= arr[n - 2] && arraySortedOrNot(arr, n - 1);
        }
        public static void main(String[] args) {
            int[] arr = {20, 23, 23, 45, 78, 88};
            int n = arr.length;

            if (arraySortedOrNot(arr, n)) {
                System.out.println("Yes, the array is sorted.");
            } else {
                System.out.println("No, the array is not sorted.");
            }
        }
    }


