class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {   int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int right = 0; right < n; right++) {

            // 1. Remove indices outside the current window.
            while (!deque.isEmpty() && deque.peekFirst() <= right - k) {
                deque.pollFirst();
            }

            // 2. Remove smaller or equal elements from the back.
            while (!deque.isEmpty()
                    && nums[deque.peekLast()] <= nums[right]) {
                deque.pollLast();
            }

            // 3. Add the current index.
            deque.offerLast(right);

            // 4. Record maximum once the first window is complete.
            if (right >= k - 1) {
                result[right - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result;
    }
}
