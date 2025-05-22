class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        // List<Integer> spiral = new ArrayList<Integer>();

        // int left=0;
        // int right=matrix.length-1;
        // int top=0;
        // int down=matrix[0].length-1;

        // while(top<=down && left<=right)
        // {
        //     for(int i=left;i<=right;i++)
        //     {
        //         spiral.add(matrix[top][i]);
        //     }
        //     top++;

        //     for(int i=top;i<=down;i++)
        //     {
        //         spiral.add(matrix[i][right]);
        //     }
        //     right--;

        //     if(top<=down)
        //     {
        //         for(int i=right;i>=left;i--)
        //         {
        //             spiral.add(matrix[down][i]);
        //         }
        //         down--;
        //     }
            

        //     if(left<=right)
        //     {
        //         for(int i=down;i>=top;i--)
        //         {
        //             spiral.add(matrix[i][left]);
        //         }
        //         left++;
        //     }
            
        // }
        // return spiral;

        List<Integer> ans = new ArrayList<>();
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        int top = 0, left = 0, bottom = n - 1, right = m - 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++)
                ans.add(matrix[top][i]);

            top++;

            for (int i = top; i <= bottom; i++)
                ans.add(matrix[i][right]);

            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--)
                    ans.add(matrix[bottom][i]);

                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--)
                    ans.add(matrix[i][left]);

                left++;
            }
        }
        return ans;
    }
}