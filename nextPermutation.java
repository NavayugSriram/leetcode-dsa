class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        
        if(nums.length <=1 || nums == null) return ;
        int i =n-2;
        while(i>=0 && nums[i] >= nums[i+1]){
            i--;
        }
        if(i>=0){
            int j = n -1;
            while(nums[j] <= nums[i]) j--;
            swap(nums, i,j);
        }
        reverse(nums, i+1, nums.length -1);

    }

    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        // return nums;
    }

    public void reverse(int[] nums, int i, int j){
        while(i<j)
            swap(nums, i++,j--);

    }
}
