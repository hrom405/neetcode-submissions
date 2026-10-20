class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(k == 1) return nums;
        int n = nums.length;
        int[] result = new int[n-k+1];
        int[] l = new int[n];
        int[] r = new int[n];

        for(int i =0;i<n;i++){
            if(i%k == 0){
                l[i] = nums[i];
            }else{
                l[i] = Math.max(l[i-1], nums[i]);
            }

            int j = n-i-1;
            if(j == n - 1 || (j + 1) % k == 0){
                r[j] = nums[j];
            }else{
                r[j] = Math.max(r[j+1], nums[j]);
            }
        }

        // System.out.println(Arrays.toString(l) + ".. .. . . . " +  Arrays.toString(r));

        for (int i = 0; i < result.length; i++) {
            result[i] = Math.max(r[i], l[i + k - 1]);
        }

        return result;
     }
}
