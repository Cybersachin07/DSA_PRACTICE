/*----GFG----
------POTD----
----17-11-2024----
------java_SOLUTION---
-------Easy----
----Reverse  An Array----
https://www.geeksforgeeks.org/problems/reverse-an-array/1
*/


class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int n = arr.length;
        for(int i = 0; i < n/ 2; ++i){
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }
    
}