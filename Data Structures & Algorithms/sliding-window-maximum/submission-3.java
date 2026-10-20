class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
      Deque<Integer> de = new ArrayDeque<>();
      int n = nums.length;
      int[] result = new int[n-k+1];
      for(int i =0; i<n; i++){
        
        while(!de.isEmpty() && de.peekFirst() <= i -k ){
            de.removeFirst();
        }

        while(!de.isEmpty() && nums[de.peekLast()] <= nums[i]){
            de.removeLast();
        }

        de.addLast(i);

        if(i >= k-1){
            result[i-k+1] = nums[de.peekFirst()];
        }
      }

      return result;  
    }
}
