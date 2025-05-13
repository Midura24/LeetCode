class Solution {
    public int reverse(int x) {
        int reverse =0;
        while(x!=0)
        {
            int last=x%10;
              if (reverse > 214748364 || (reverse == 214748364 && last > 7)) return 0;
            if (reverse < -214748364 || (reverse == -214748364 && last < -8)) return 0;
            reverse=(reverse*10)+last;
            x/=10;
        }
         return reverse;
    }
}