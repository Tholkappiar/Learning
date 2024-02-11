package Arrays;

public class SortColors {
        public void sortColors(int[] nums) {
            int a = 0, b = 0 , c = 0;
            int[] arr = nums;
            for(int i=0;i<nums.length;i++){
                if(nums[i]==0) a++;
                else if(nums[i]==1) b++;
                else c++;
            }
            for(int i=0;i<a;i++){
                arr[i] = 0;
            }
            for(int i=a;i<a+b;i++){
                arr[i] = 1;
            }
            for(int i=a+b;i<a+b+c;i++){
                arr[i] = 2;
            }
        }
}
