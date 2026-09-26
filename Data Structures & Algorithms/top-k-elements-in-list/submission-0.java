class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       Map<Integer, Integer> map = new HashMap<>();
       for(int i: nums){
        map.put(i, map.getOrDefault(i,0)+1);
       }
       List<Map.Entry<Integer, Integer>> entries =
        new ArrayList<>(map.entrySet());

        entries.sort(Map.Entry.comparingByValue());

        int[] result = new int[k];
        for(int i =0;i<k;i++){
            result[i] = entries.get(entries.size() -1 -i).getKey();
        }
    return result;

    }
}
