class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length<2) return nums;
        int n = nums.length;
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = nums[0];
        right[n-1] = nums[n-1];
        for(int i =1, j=n-2;i<n && j>=0;i++,j--){
            left[i] = nums[i] * left[i-1];
            right[j] = nums[j] * right[j+1];
        }

        int[] result = new int[n];
        result[0] = right[1];
        result[n-1] = left[n-2];
        for(int i = 1;i<n-1;i++){
            result[i] = left[i-1] * right[i+1];
        }
        return result;
    }
}  
