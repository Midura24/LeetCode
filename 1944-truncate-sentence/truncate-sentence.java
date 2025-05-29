class Solution {
    public String truncateSentence(String s, int k) {
        int len=s.length();
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");
        int index=0;
        while(k!=0)
        {
            sb.append(arr[index] + " ");
            index++;
            k--;
        } 
        return sb.toString().trim();
    }
}