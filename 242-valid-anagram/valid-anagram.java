class Solution {
    public boolean isAnagram(String a, String b) {
         a = a.toLowerCase();
        b = b.toLowerCase();
        char[] chr1 = a.toCharArray();
        char[] chr2 = b.toCharArray();
        java.util.Arrays.sort(chr1);
        java.util.Arrays.sort(chr2);
        String str1 = new String(chr1);
        String str2 = new String(chr2);
        if(str1.equals(str2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}