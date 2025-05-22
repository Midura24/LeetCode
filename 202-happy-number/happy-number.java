class Solution {
    public boolean isHappy(int n) {
        // ArrayList<Integer> numbers=new ArrayList<>();
        // int number=n;
        
        // while(n>10)
        // {
        //     int digit = number % 10;
        //     totalSum += digit * digit;
        //     number /= 10;
        // }

        // if(sum==1)
        // {
        //     return true;
        // }
        // return false;

        Set<Integer> seen = new HashSet<>();
        
        while (!seen.contains(n)) {
            seen.add(n);
            n = getNext(n);
        }
        
        return n==1;
    }

    private int getNext(int number) {
        int totalSum = 0;
        while (number > 0) {
            int digit = number % 10;
            totalSum += digit * digit;
            number /= 10;
        }
        return totalSum;
    }
}
