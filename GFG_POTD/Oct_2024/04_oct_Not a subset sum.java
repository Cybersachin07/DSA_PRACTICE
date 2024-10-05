/*----GFG----
------POTD----
----05-10-2024----
------JAVA_SOLUTION---
-------Medium----
----Not asubset sum-----
----https://www.geeksforgeeks.org/problems/smallest-number-subset1220/1--

---
*/


class Solution {
    public long findSmallest(int[] arr) {
        // Your code goes here
        long ans = 1;
        for(int x:arr){
            if(x>ans)return ans;
            ans+=x;
        }
        return ans;
    }

}