class Solution {
    public int smallestIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (digitSum(nums[i]) == i) {
                return i;
            }
        }
        return -1;
    }

    private int digitSum(int num) {
        String s = Integer.toString(num);
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += c - '0'; // convert char digit to int
        }
        return sum;
    }
}