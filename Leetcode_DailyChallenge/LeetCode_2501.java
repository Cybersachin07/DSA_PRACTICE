/*---LEETCODE---DAILY CHALLENGE---
--------27-10-2024----
-----LEETCODE 2501----
-----Hard----
---https://leetcode.com/problems/longest-square-streak-in-an-array/description/----

----JAVA SOLUTION-------
*/

class Solution {
    public int longestSquareStreak(int[] nums) {
        Set<Integer> st = new HashSet<>();
        for (int num : nums) {
            st.add(num);
        }

        int maxStreak = 0;

        for (int num : nums) {
            int streak = 0;
            long curr = num;

            while (st.contains((int) curr)) {
                streak++;

                if (curr * curr > 1e5) {
                    break;
                }

                curr = curr * curr; // square
            }

            maxStreak = Math.max(maxStreak, streak);
        }

        return maxStreak < 2 ? -1 : maxStreak;
    }
}