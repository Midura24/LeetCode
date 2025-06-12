class Solution {

    int findIndex(int[][]arr, int n, int m, int col)
    {
        int maxval=-1;
        int index=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i][col]>maxval)
            {
                maxval=arr[i][col];
                index=i;
            }
        }
        return index;
    }

    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;

        int[] arr=new int[2];

        int low=0;
        int high=m-1;

        int max=Integer.MIN_VALUE;

        while(low<=high)
        {
            int mid=(low+high)/2;
            int method=findIndex(mat,n,m,mid);

            int left=Integer.MAX_VALUE;
            int right=Integer.MIN_VALUE;

            if(mid-1>0)
            {
                left=mat[method][mid-1];
            }
            else
            {
                left=-1;
            }

            if(mid+1<m)
            {
                right=mat[method][mid+1];
            }
            else
            {
                right=-1;
            }

            if(mat[method][mid]>left && mat[method][mid]>right)
            { 
                arr[0]=method;
                arr[1]=mid;
                
                return arr;
            }
            else if(mat[method][mid]>left)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        arr[0]=-1;
        arr[1]=-1;

        return arr;
    }
}