class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
          if (s1.equals(s2)) return true;

        int firstDiff = -1, secondDiff = -1;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (firstDiff == -1) {
                    firstDiff = i;
                } else if (secondDiff == -1) {
                    secondDiff = i;
                } else {
                    return false;
                }
            }
        }
        return secondDiff != -1 &&
               s1.charAt(firstDiff) == s2.charAt(secondDiff) &&
               s1.charAt(secondDiff) == s2.charAt(firstDiff);
    }
}