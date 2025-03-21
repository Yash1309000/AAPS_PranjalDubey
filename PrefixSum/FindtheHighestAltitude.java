package PrefixSum;

public class FindtheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int max =0;
        int ps=0;
        for(int i=0;i<gain.length;i++){
            ps+=gain[i];
            max=Math.max(max,ps);
        }
        return max;
    }
    public static void main(String[] args) {
        FindtheHighestAltitude solver = new FindtheHighestAltitude();

        int[] gain = {-5, 1, 5, 0, -7};
        int result = solver.largestAltitude(gain);

        System.out.println("Highest Altitude: " + result);
    }
}
