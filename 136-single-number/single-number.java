class Solution {
    public int singleNumber(int[] nums) {
        int n=nums.length;
        HashMap<Integer, Integer> hashmap = new HashMap<>();
         for (int i = 0; i < n; i++) {
            int value = hashmap.getOrDefault(nums[i], 0);
            hashmap.put(nums[i], value + 1);
        }
        for (Map.Entry<Integer, Integer> it : hashmap.entrySet()) {
            if (it.getValue() == 1) {
                return it.getKey();
            }
        }
        return -1;
    }
}