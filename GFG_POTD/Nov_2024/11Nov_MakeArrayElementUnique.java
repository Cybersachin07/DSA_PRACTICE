/*----GFG----
------POTD----
----11-11-2024----
------java_SOLUTION---
-------Medium----
----MAke Array Elements Unique-----
https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-with-distinct-elements/1
*/


class Solution {
    public int minIncrements(int[] arr) {
         // Code here
         Arrays.sort(arr);
         int increments = 0;
         for(int i = 1; i < arr.length; ++i){
             if(arr[i] <= arr[i - 1]){
                 int incrementNeeded = arr[i - 1] - arr[i] + 1;
                 arr[i] += incrementNeeded;
                 increments += incrementNeeded;
             }
         }
         return increments;
     }
 }