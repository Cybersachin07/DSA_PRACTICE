/*----GFG----
------POTD----
----26-11-2024----
------java_SOLUTION---
------Medium----
----MAx  Circular Subarray  Sum----
https://www.geeksforgeeks.org/problems/max-circular-subarray-sum-1587115620/

*/



class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {

        // Your code here
     int n = arr.length,mn=Integer.MAX_VALUE,mx=Integer.MIN_VALUE,sum1=0,sum2=0,total=0;
        for(int i=0;i<n;i++){
            total+=arr[i];
            sum2=Math.min(arr[i],sum2+arr[i]);
            mn=Math.min(mn,sum2);
            sum1=Math.max(arr[i],sum1+arr[i]);
            mx=Math.max(mx,sum1);
        }
        return Math.max(mx,total-mn);
          
    }
}