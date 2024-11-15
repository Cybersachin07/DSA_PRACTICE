/*---LEETCODE---DAILY CHALLENGE---
--------15-11-2024----
-----LEETCODE 1574----
-----MEdium----
-------

----JAVA SOLUTION-------
*/



class Solution {
    public int findLengthOfShortestSubarray(int[] arr) {
        int n = arr.length;

        // Find the longest non-decreasing suffix starting from the right
        int j = n - 1;
        while (j > 0 && arr[j] >= arr[j - 1]) {
            j--;
        }

        // If the array is fully non-decreasing, return 0
        if (j == 0) return 0;

        int result = j;  // Initial result: remove everything before j
        int i = 0;

        // Extend the non-decreasing subarray from the left and check for minimal removal
        while (i < n && (i == 0 || arr[i] >= arr[i - 1])) {
            // Find the right boundary where arr[i] <= arr[j]
            while (j < n && arr[i] > arr[j]) {
                j++;
            }
            result = Math.min(result, j - i - 1);  // Calculate subarray removal length
            i++;
        }

        return result;
    }
}
