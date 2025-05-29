class Solution implements Comparator<int[]>{
    
   @Override
    public int compare(int[] a, int[] b) {
        int diff = Integer.compare(a[0], b[0]);
        return (diff == 0) ? Integer.compare(a[1], b[1]) : diff;
    }

    public int[][] merge(int[][] intervals) {
        if (intervals.length <= 1) return intervals;

        Arrays.sort(intervals, new Solution());

        int n = intervals.length;
        int[][] arr = new int[n][2];
        int index = 0;

        for (int i = 0; i < n; i++) {
            int start = intervals[i][0];
            int end = intervals[i][1];

            if (index == 0 || arr[index - 1][1] < start) {
                arr[index][0] = start;
                arr[index][1] = end;
                index++;
            } else {
                arr[index - 1][1] = Math.max(arr[index - 1][1], end);
            }
        }

        return Arrays.copyOf(arr, index);
    }
}