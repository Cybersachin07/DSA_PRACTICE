/*---LEETCODE---DAILY CHALLENGE---
--------05-11-2024----
-----LEETCODE 2914----
-----Medium----
https://leetcode.com/problems/minimum-number-of-changes-to-make-binary-string-beautiful/description/
----JAVA SOLUTION-------
*/



class Solution {
    public int minChanges(String s) {
        int changes = 0;
        int n = s.length();

        for (int i = 0; i < n - 1; i += 2) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                changes++;
            }
        }

        return changes;
    }
}