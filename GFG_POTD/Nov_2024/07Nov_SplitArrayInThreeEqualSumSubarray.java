/*----GFG----
------POTD----
----07-11-2024----
------java_SOLUTION---
-------Medium----
----Split Array In Three Equla Sum Sub Array-----
https://www.geeksforgeeks.org/problems/split-array-in-three-equal-sum-subarrays/1
*/



// User function Template for Java
class Solution {

    public List<Integer> findSplit(int[] arr) {
        // Return an array of possible answer, driver code will judge and return true or
        // false based on
          int totalSum = 0;
        for(int ele : arr){
            totalSum += ele;
        }
        
        List<Integer> res = new ArrayList<>(Arrays.asList(-1, -1));
        if(totalSum % 3 != 0){
            return res;
        }
        
        int targetSum = totalSum / 3;
        int currSum = 0;
        int firstIdx = -1;
        int secIdx = -1;
        for(int i = 0; i < arr.length; ++i){
            currSum += arr[i];
            if(currSum == targetSum && firstIdx == -1){
                firstIdx = i;
            }
            else if(currSum == 2 * targetSum && firstIdx != -1){
                secIdx = i;
                res.set(0, firstIdx);
                res.set(1, secIdx);
                return res;
            }
        }
        return res;
    }
}