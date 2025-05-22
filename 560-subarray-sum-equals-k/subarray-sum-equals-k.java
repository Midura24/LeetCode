class Solution {
    public int subarraySum(int[] nums, int k) {

        int sum=0;
        int maximum=0;
        int count=0;

        HashMap<Integer,Integer> hashmap=new HashMap<>();
        hashmap.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            sum += nums[i];
            maximum = sum-k;
            count += hashmap.getOrDefault(maximum,0);
            hashmap.put(sum,hashmap.getOrDefault(sum,0)+1);
        }
        return count;
    }
}