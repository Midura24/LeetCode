import java.util.HashSet;
class Solution {
    public int totalNumbers(int[] digits) {
        Set<Integer> uniqueNumbers = new HashSet<>();

        int n = digits.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) continue;
                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;

                    int d1 = digits[i];
                    int d2 = digits[j];
                    int d3 = digits[k];

                    if (d1 != 0 && d3 % 2 == 0) {
                        int number = d1 * 100 + d2 * 10 + d3;
                        uniqueNumbers.add(number);
                    }
                }
            }
        }
        return uniqueNumbers.size();
    }
}