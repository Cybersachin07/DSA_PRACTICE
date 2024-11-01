/*----GFG----
------POTD----
----01-11-2024----
------java_SOLUTION---
-------Easy----
--swap and Maximize-----
----https://www.geeksforgeeks.org/problems/swap-and-maximize5859/1----

*/

class Solution {
    public long maxSum(Long[] arr) {
        // code here
        int i=0, l=arr.length-1;
        long sum=0;
        Arrays.sort(arr);
        while(i<l)
        {
            sum=sum+arr[l]-arr[i];
            sum=sum+arr[l]-arr[i+1];
            i++;
            l--;
        }
        sum=sum+arr[i]-arr[0];
        return sum;
    }
}