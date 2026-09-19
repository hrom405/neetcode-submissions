class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> s = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (s.containsKey(complement)) {
                return new int[]{s.get(complement), i};
            }
            s.put(nums[i], i);
        }
        return null;
    }
}
