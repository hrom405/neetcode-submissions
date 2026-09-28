class Solution {
    public int maxArea(int[] h) {
        int max = -1;
        int start = 0, end= h.length-1;
        while(start<end){
            int tmax = (end-start) * Math.min(h[start], h[end]);
            max = Math.max(max, tmax);
            if(h[start] > h[end]) end--;
            else start++;
        }

        return max;
    }
}
