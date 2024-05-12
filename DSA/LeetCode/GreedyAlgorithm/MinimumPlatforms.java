class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
            
        Arrays.sort(arr);
        Arrays.sort(dep);
        
        int max = 1;
        int curr_plat = 1;
        
        int i = 1;
        int j = 0;
        
        while(i<n && j<n) {
            if(arr[i] <= dep[j]) {
                curr_plat++;
                max = Math.max(curr_plat,max);
                i++;
            } else {
                curr_plat--;
                j++;
            }
        }
        
        return max;
    }
}
