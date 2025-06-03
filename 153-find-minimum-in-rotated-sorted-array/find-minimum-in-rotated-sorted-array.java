class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int val=Integer.MAX_VALUE;

        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[low]<=nums[mid])
            {
                val=Math.min(val,nums[low]);
                low=mid+1;
            }
            else
            {
                val=Math.min(val,nums[mid]);
                high=mid-1;
            }
        }
        return val;
    }
}