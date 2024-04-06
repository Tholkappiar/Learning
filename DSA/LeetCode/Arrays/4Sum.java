class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        Arrays.sort(nums);
        Set<List<Integer>> hs = new HashSet<>();
        List<List<Integer>> ans = new ArrayList<>();

        int len = nums.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                int k = j+1;
                int l = len-1;

                while(k<l){
                    long sum = (long)nums[i] + nums[j] + nums[k] + nums[l];
                    if(sum == target){
                        hs.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                        k++;
                        l--;
                    } else if(sum < target){
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }
        ans.addAll(hs);
        return ans;
    }
}