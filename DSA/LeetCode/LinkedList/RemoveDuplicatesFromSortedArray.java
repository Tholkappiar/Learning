class Solution {
    public int removeDuplicates(int[] nums) {

        int i = 0;
        int j = 1;
        int len = nums.length;

        while (j < len) {
            if (nums[i] < nums[j]) {
                i++;
                swap(i, j, nums);

            } else {
                j++;
            }
        }
        return i + 1;
    }

    public static void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}