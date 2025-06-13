import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        Arrays.sort(strs); 

        StringBuilder sb = new StringBuilder();
        char[] arr1 = strs[0].toCharArray();
        char[] arr2 = strs[strs.length - 1].toCharArray();

        int minLength = Math.min(arr1.length, arr2.length);

        for (int i = 0; i < minLength; i++) {
            if (arr1[i] != arr2[i])
                break;
            sb.append(arr1[i]);
        }

        return sb.toString();
    }
}
