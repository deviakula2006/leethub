class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int n = intervals.length;
        int count = n; // Start with all intervals present

        for (int i = 0; i < n; i++) {
            if (intervals[i] == null) continue; // Skip already removed intervals
            
            for (int j = 0; j < n; j++) {
                if (i == j || intervals[j] == null) continue;

                // Check if interval i is covered by interval j
                // Interval i is [a, b) and interval j is [c, d)
                // Covered if: c <= a AND b <= d
                if (intervals[j][0] <= intervals[i][0] && intervals[i][1] <= intervals[j][1]) {
                    intervals[i] = null; // Mark as removed
                    count--;
                    break; // Move to the next interval i
                }
            }
        }
        return count;
    }
}
