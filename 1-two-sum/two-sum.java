class Solution {
    public int[] twoSum(int[] nums, int target) {

        int [] result=new int[2];
        HashMap<Integer,Integer> hashmap=new HashMap<>();

     for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int n = target - num;
            if (hashmap.containsKey(n)) {
                result[0] = hashmap.get(n);
                result[1] = i;
                return result;
            }

            hashmap.put(nums[i], i);
        }
        return nums;
    }
}