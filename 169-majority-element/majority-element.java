class Solution {
    public int majorityElement(int[] nums) {
        // int n=nums.length;
        // int count=0;
        // int element=0;
        // for(int i=0;i<n;i++)
        // {
        //     if(count==0)
        //     {
        //         count=1;
        //         element=nums[i];
        //     }
        //     else if(nums[i]==element)
        //     {
        //         count++;
        //     }
        //     else
        //     {
        //         count--;
        //     }
        // }

        // int count1=0;
        // for(int i=0;i<n;i++)
        // {
        //     if(nums[i]==element)
        //     {
        //         count1++;
        //     }
        // }
        //  if(element>(n/2))
        //     {
        //         return element;
        //     }
        // else
        // {
        // return -1;
        // }

        int n = nums.length;
        int cnt = 0;
        int el = 0;

        for (int i = 0; i < n; i++) {
            if (cnt == 0) {
                cnt = 1;
                el = nums[i];
            } else if (el == nums[i]) cnt++;
            else cnt--;
        }

        int cnt1 = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == el) cnt1++;
        }

        if (cnt1 > (n / 2)) return el;
        return -1;
    }
}