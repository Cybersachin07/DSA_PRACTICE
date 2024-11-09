/*---LEETCODE---DAILY CHALLENGE---
--------09-11-2024----
-----LEETCODE 3133----
-----Medium----
https://leetcode.com/problems/minimum-array-end/
----JAVA SOLUTION-------
*/


class Solution {
    public long minEnd(int n, int x) {
        long num = x;

        for (int i = 1; i < n; i++) {
            // Increment num and perform bitwise OR with x
            num = (num + 1) | x;
        }

        return num;
    }
}