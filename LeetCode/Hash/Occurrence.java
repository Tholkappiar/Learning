package Hash;

public class Occurrence {
    public static int[] countFrequency(int n, int x, int []nums){
        

        // for precomputing 
        int[] hash = new int[n];
        for (int i = 0; i < n ; i++) {
            if(nums[i]<=n)
                hash[nums[i]-1] += 1;
        }

        return hash;

    }
}