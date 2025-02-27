/*----GFG----
------POTD----
----24-11-2024----
------java_SOLUTION---
------Medium----
----MAximum Product Subarray----
https://www.geeksforgeeks.org/problems/maximum-product-subarray3604/1

*/



class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
         int ans=Integer.MIN_VALUE,productStart=1,productEnd=1,n=arr.length;
        for(int i=0;i<n;i++){
            productStart*=arr[i];
            productEnd*=arr[n-1-i];
            ans=Math.max(ans,Math.max(productStart,productEnd));
            if(productStart==0)productStart=1;
            if(productEnd==0)productEnd=1;
        }
        return ans;
    }


}