class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] leftM = new int[n];
        int[] rightM = new int[n];
        leftM[0] = height[0];
        rightM[n-1] = height[n-1];
        for(int i =1,j=n-2;i<n && j>=0 ;i++,j--){
            leftM[i] = Math.max(leftM[i-1], height[i]);
            rightM[j] = Math.max(rightM[j+1], height[j]);
        }
        int sum=0;
        for(int i = 0; i<n;i++){
            sum+= Math.abs(Math.min(leftM[i], rightM[i]) - height[i]);
        }

        return sum;

    }
}
