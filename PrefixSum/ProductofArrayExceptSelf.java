package PrefixSum;

public class ProductofArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] prefix = new int [n];
        prefix[0]=1;
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]*nums[i-1];
        }
        int [] sufix = new int [n];
        sufix[n-1]=1;
        for(int i=n-2;i>=0;i--){
            sufix[i]=sufix[i+1]*nums[i+1];
        }
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=prefix[i]*sufix[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        ProductofArrayExceptSelf solver = new ProductofArrayExceptSelf();

        int[] nums = {1, 2, 3, 4};
        int[] result = solver.productExceptSelf(nums);


        System.out.print("Output: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
