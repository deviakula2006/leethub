import java.util.*;

class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        long current = Long.MIN_VALUE;  // use long to prevent overflow
        int count = 0;

        for (int num : nums) {
            long left = (long) num - k;
            long right = (long) num + k;

            // move current to the start of this element's range if it's too small
            if (current < left) current = left;

            // assign a new distinct value if possible
            if (current <= right) {
                count++;
                current++;  // move to next distinct number
            }
        }

        return count;
    }
}
