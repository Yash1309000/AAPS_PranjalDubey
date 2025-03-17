package Recursion;

public class SummationOfArryElement {
    static int findSum(int A[], int N) {
            if (N <= 0) {
                return 0;
            }
            return findSum(A, N - 1) + A[N - 1];
        }
        public static void main(String[] args) {
            int A[] = { 1, 2, 3, 4, 5 };
            int N = A.length;
            int sum = findSum(A, N);
            System.out.println("Sum of array elements: " + sum);
        }
    }



