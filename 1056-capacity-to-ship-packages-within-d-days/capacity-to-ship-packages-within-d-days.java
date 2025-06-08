class Solution {
    int func(int arr[], int capacity)
{
    int days=1;
    int load=0;
    for(int i=0;i<arr.length;i++)
    {	
	if(load+arr[i]>capacity)
	{
	    days+=1;
 	    load=arr[i];
	}
	else
	{
	    load+=arr[i];
	}
    }
    return days;
}
int max(int arr[])
{
    int maxi=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++)
    {
	maxi=Math.max(maxi,arr[i]);
    }
    return maxi;
}
int sum(int arr[])
{
    int sum=0;
    for(int i=0;i<arr.length;i++)
    {
	sum+=arr[i];
    }
    return sum;
}

public int shipWithinDays(int[] weights,int days)
{
    int low=max(weights);
    int high=sum(weights);
    while(low<=high)
    {
	int mid=(low+high)/2;
	int method=func(weights,mid);
	if(method<=days)
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