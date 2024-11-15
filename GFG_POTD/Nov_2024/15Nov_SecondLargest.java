/*----GFG----
------POTD----
----15-11-2024----
------java_SOLUTION---
-------Easy----
----Second Largest-----
https://www.geeksforgeeks.org/problems/second-largest3735/1
*/


class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
         int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
        for(int x:arr){
            if(x>max1){
                max2=max1;
                max1=x;
            }
            else if(x>max2 && x!=max1)max2=x;
        }
        return max2!=Integer.MIN_VALUE?max2:-1;
    }
}