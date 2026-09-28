class Solution {
    public int[] twoSum(int[] n, int target) {
        int[] arr ;
        int start = 0;
        int end = n.length-1;

        while(start<end){
            if((n[start] + n[end]) == target){
                return new int[]{start+1, end+1};
            }else if((n[start] + n[end]) > target) end--;
            else start++;
        }

        return new int[2];
    }
}
