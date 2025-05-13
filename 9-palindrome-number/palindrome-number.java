class Solution {
    public boolean isPalindrome(int x) {
       int reverse=0;
       int dup=x;
       while(x>0)
       {
        int last=x%10;
        reverse=(reverse*10) + last;
        x=x/10;
       } 
       if(dup==reverse)
       {
            return true;
       }
       else{
        return false;
       }
    }
}