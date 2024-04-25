class Solution {
    public int trap(int[] height) {

        // find max and store it in seperate arrays
        int len = height.length;
        int[] arr1 = new int[len];
        int[] arr2 = new int[len];
        int i = 1, j = len - 2;

        arr1[0] = height[0];
        arr2[len - 1] = height[len - 1];
        while (i < len && j >= 0) {
            arr1[i] = Math.max(arr1[i - 1], height[i]);
            arr2[j] = Math.max(arr2[j + 1], height[j]);
            i++;
            j--;
        }
        // take the min and sub with i
        int ans = 0;
        for (int k = 0; k < len; k++) {
            ans += Math.min(arr1[k], arr2[k]) - height[k];
        }
        // add and return
        return ans;
    }
}
