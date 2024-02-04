package Recursion;

public class Reverse_Array {
    public static int[] reverseArray(int n, int []nums) {
        int[] arr = new int[n];
        return reverse(n-1, nums, arr,0);
    }

    public static int[] reverse(int n,int[] nums,int[] arr,int i){
        if(n<0)
            return arr;
        arr[i] = nums[n];
        return reverse(n-1, nums, arr, i+1);
    }
}
