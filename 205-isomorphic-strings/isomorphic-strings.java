import java.util.HashMap;

class Solution {

    String func(String str) {
        HashMap<Character, Integer> hm = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!hm.containsKey(ch)) {
                hm.put(ch, i);
            }
            sb.append(hm.get(ch)).append(" "); 
        }

        return sb.toString();
    }

    public boolean isIsomorphic(String s, String t) {
        return func(s).equals(func(t));
    }
}
