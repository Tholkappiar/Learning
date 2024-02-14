class MajorityElement2 {
    public List<Integer> majorityElement(int[] nums) {
        
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        List<Integer> ls = new ArrayList<Integer>();

        for(int i=0;i<nums.length;i++)
            hm.put(nums[i] , hm.getOrDefault(nums[i] , 0) + 1);
        
        int temp = nums.length/3;
        for(int key : hm.keySet()){
            if(temp < hm.get(key))
                ls.add(key);
        }
        return ls;
    }
}