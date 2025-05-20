class Solution {
    public int[] rearrangeArray(int[] nums) {
    //     int n=nums.length;
    //     ArrayList<Integer> positive=new ArrayList<>();
    //     ArrayList<Integer> negative=new ArrayList<>();
    //    for(int i=0;i<n;i++)
    //     {
    //         if(nums[i]>0)
    //         {
    //             positive.add(nums[i]);
    //         }
    //         else
    //         {
    //             negative.add(nums[i]);
    //         }
    //     }
    //     for(int i=0;i<n/2;i++)
    //     {
    //         nums[2*i]=positive.get(i);
    //         nums[2*i+1]=negative.get(i);
    //     }
    //     return nums;

    int n=nums.length;
    int[] arr=new int[n];
    int positive=0;
    int negative=1;
    
    for(int i=0;i<n;i++)
    {
        if(nums[i]<0)
        {
            arr[negative]=nums[i];
            negative+=2;
        }
        if(nums[i]>=0)
        {
            arr[positive]=nums[i];
            positive+=2;
        }
    }
    return arr;
    }
}