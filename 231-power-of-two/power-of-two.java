class Solution {

    boolean power(int n)
    {
        if(n<=0)
        {
            return false;
        }
        else
        {
            return (n & (n - 1)) == 0;
        }
    }
    public boolean isPowerOfTwo(int n) {
        return power(n);
    }
}