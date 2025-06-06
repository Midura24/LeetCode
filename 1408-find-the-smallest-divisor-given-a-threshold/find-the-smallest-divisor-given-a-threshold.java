class Solution {

    int max(int arr[])
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            max=Math.max(max,arr[i]);
        }
        return max;
    }

    int smallestDiv(int []arr,int div)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=Math.ceil((double)arr[i]/(double)div);
        }
        return sum;
    }
    public int smallestDivisor(int[] nums, int threshold) { 
        int low=1;
        int high=max(nums);
        if(nums.length>threshold)
        {
            return -1;
        }

        while(low<=high)
        {
            int mid=(low+high)/2;
            int val=smallestDiv(nums,mid);
            if(val<=threshold)
            {
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
    }
}