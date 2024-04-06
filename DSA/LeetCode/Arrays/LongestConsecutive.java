class LongestConsecutive {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        
        // loop
        int count = 0;
        int lastSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if( nums[i]-1 == lastSmallest ) {
                count++;
            } else if (nums[i] != lastSmallest){
                count = 1;
            }
            lastSmallest = nums[i];
            largest = Math.max(count,largest); 
        }
        return largest;
    }
}