class Solution {
    boolean fourth(int n)
    {
        if(n==1)
        {
            return true;
        }
        if(n<=0 || n%4!=0)
        {
            return false;
        }
        return fourth(n/4);
    }
    public boolean isPowerOfFour(int n) {
          return fourth(n);
    }
}