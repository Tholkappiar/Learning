class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        List<List<Integer>> ls = new ArrayList<>();

        int len = nums.length;
        for(int i=0;i<len;i++){
            int j=i+1;
            int k = len - 1 ;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0){
                    set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                } else if(sum<0){
                    j++;
                } else {
                    k--;
                }
            }
        }
        ls.addAll(set);
        return ls;
    }
}