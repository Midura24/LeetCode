class Solution {
    public List<List<Integer>> generate(int numRows) {
                
        List<List<Integer>> lst=new ArrayList<>();
        for(int i=1;i<=numRows;i++)
        {
            lst.add(operation(i)); 
        }
        return lst;
    }

    List<Integer> operation(int row)
    {
        long num=1;
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        for(int col=1;col<row;col++)
        {
            num=num*(row-col);
            num=num/(col);
            int ans=(int)num;
            temp.add(ans);
        }
        return temp;
    }
 
}