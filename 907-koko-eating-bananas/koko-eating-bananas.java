class Solution {
    int maxi(int arr[])
    {
        int maximum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            maximum=Math.max(maximum,arr[i]);
        }
        return maximum;
    }

    int func(int arr[], int h)
    {
        int total=0;
        for(int i=0;i<arr.length;i++)
        {
            total+=Math.ceil((double)arr[i]/(double)h);
        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=maxi(piles);
        int ans = 0;

        while(low<=high)
        {
            int mid=(low+high)/2;
            int method=func(piles,mid);
            if(method<=h)
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