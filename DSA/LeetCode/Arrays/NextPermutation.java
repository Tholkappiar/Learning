class NextPermutation {
    public void nextPermutation(int[] nums) {
        int index1 = -1;
        int index2 = -1;
        // store the index if the break point is found
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index1 = i;
                break;
            }
        }
        // if there is no breaking point reverse the array
        if(index1==-1){
            reverse(nums,0);
            return;
        } else {
            for(int i=nums.length-1;i>=0;i--){
                if(nums[index1] < nums[i]){
                    index2 = i;
                    break;
                }
            }
        }

        // swap the indeces - index1 and index2
        swap(nums , index1, index2);
        // reverse the right side after the index 1
        reverse(nums,index1+1);
    }
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void reverse(int[] nums, int i){
        int j = nums.length-1;
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
}