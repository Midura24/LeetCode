class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalTank = 0;     // Tracks total gas - cost over the whole journey
        int currentTank = 0;   // Tracks current net gas starting from candidate station
        int start = 0;         // Candidate start station index
        
        for (int i = 0; i < gas.length; i++) {
            int gain = gas[i] - cost[i];
            totalTank += gain;
            currentTank += gain;

            // If we can't reach the next station, reset start position
            if (currentTank < 0) {
                currentTank = 0;
                start = i + 1; // Try starting from the next station
            }
        }
        
        // If totalTank is negative, there's no solution
        return totalTank >= 0 ? start : -1;
    }
}
