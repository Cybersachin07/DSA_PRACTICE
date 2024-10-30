/*----GFG----
------POTD----
----30-10-2024----
------java_SOLUTION---
-------Easy----
---Pairs With Difference K------
----https://www.geeksforgeeks.org/problems/pairs-with-difference-k1713/1----

*/


// User function Template for Java
class Solution {
    int countPairsWithDiffK(int[] arr, int k) {
        // code here
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0) + 1);
        }
        for(int num:arr){
            if(map.containsKey(num +k)){
              count += map.get(num  + k );  
            }
        }
        return count;
    }
}