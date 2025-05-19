class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxinum=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                count++;
                maxinum=Math.max(maxinum,count);
            }
            else
            {
                count=0;
            }
        }
        return maxinum;
    }
}