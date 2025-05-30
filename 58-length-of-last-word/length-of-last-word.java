class Solution {
    public int lengthOfLastWord(String s) {
        String[] str =s.split(" ");
        String s1 = str[str.length-1];
        int len = s1.length();
        return len;
    }
}