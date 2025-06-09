class Solution {
    static int func(int arr[], int pages)
    {
        int student=1;
        int stpage=0;
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]+stpage<=pages)
            {
                stpage+=arr[i];
            }
            else
            {
                student++;
                stpage=arr[i];
            }
        }
        return student;
    }
    
    static int max(int arr[])
    {
        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            maxi=Math.max(maxi,arr[i]);
        }
        return maxi;
    }
    
    static int sum(int[]arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
    public int splitArray(int[] nums, int k) {
       int low = max(nums);
        int high= sum(nums);
        while(low<=high)
        {
            int mid=(low+high)/2;
            int method=func(nums,mid);
            if(method>k)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return low;
    }
}