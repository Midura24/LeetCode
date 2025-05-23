class Solution {
    public int longestConsecutive(int[] nums) {
        int count=0;
        int longest=1;
        int n=0;
        HashSet<Integer> set = new HashSet<>();
        
        if(nums.length==0)
        {
            return 0;
        }
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        
        for(Integer element:set)
        {
            if(!set.contains(element-1))
            {
                count=1;
                n=element;
                while(set.contains(n+1))
                {
                    count=count+1;
                    n=n+1;
                }
                longest=Math.max(longest,count);
            }
        }
        return longest;
    }
}