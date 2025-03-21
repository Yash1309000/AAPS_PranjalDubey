package PrefixSum;

    import java.util.Arrays;

    public class CLoseSum {
        public int threeSumClosest(int[] arr, int target) {
            Arrays.sort(arr);
            int n = arr.length;
            int closestSum = arr[0] + arr[1] + arr[2];
            int num1 = arr[0], num2 = arr[1], num3 = arr[2];

            for (int i = 0; i < n - 2; i++) {
                int left = i + 1, right = n - 1;

                while (left < right) {
                    int sum = arr[i] + arr[left] + arr[right];


                    if (Math.abs(sum - target) < Math.abs(closestSum - target)) {
                        closestSum = sum;
                        num1 = arr[i];
                        num2 = arr[left];
                        num3 = arr[right];
                    }
                    if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;
                    } else {
                        System.out.println("Numbers: " + arr[i] + ", " + arr[left] + ", " + arr[right]);
                        return sum;
                    }
                }
            }
            System.out.println("Numbers: " + num1 + ", " + num2 + ", " + num3);
            return closestSum;
        }
        public static void main(String[] args){
            CLoseSum sol = new CLoseSum();
            int[]arr = {1, 10 ,4,5};
            int target = 11;
            System.out.println(+sol.threeSumClosest(arr,target));
        }
    }

