package PrefixSum;

public class Equilibrium_Point {
    public static int findEquilibrium(int arr[]) {
        // code here
        int left= 0, total= 0;
        for(int i = 0; i<arr.length; i++){
            total+=arr[i];
        }
        for(int i = 0; i<arr.length; i++){
            int right= total - left - arr[i];
            if(right==left){
                return i;
            }
            left+=arr[i];

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 2, 2};
        System.out.println(findEquilibrium(arr)); 
    }
}
