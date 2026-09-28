class Solution {
    public int[] twoSum(int[] n, int target) {
        int[] arr ;
        int start = 0;
        int end = n.length-1;

        while(start<end){
            int temp = n[start] + n[end];
            if(temp == target){
                return new int[]{start+1, end+1};
            }else if(temp > target) end--;
            else start++;
        }

        return new int[2];
    }
}
