class Solution {
     int min(int arr[])
    {
        int minimum=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            minimum=Math.min(minimum,arr[i]);
        }
        return minimum;
    }

    int max(int arr[])
    {
        int maximum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            maximum=Math.max(maximum,arr[i]);
        }
        return maximum;
    }
    boolean possible(int arr[], int day, int m, int k)
    {
        int count=0;
        int  noofbloom=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<=day)
            {
                count++;
            }
            else
            {
                noofbloom+=(count/k);
                count=0;
            }
        }
        noofbloom+=(count/k);
        return noofbloom>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int low=min(bloomDay);
        int high=max(bloomDay);

        if(bloomDay.length<((long)m*(long)k))
        {
            return -1;
        }
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(possible(bloomDay,mid,m,k))
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