/*----GFG----
------POTD----
----25-10-2024----
------java_SOLUTION---
-------basic----
---Alternative Sorting---
----https://www.geeksforgeeks.org/problems/alternative-sorting1311/1----

*/


class Solution {
    public static ArrayList<Integer> alternateSort(int[] arr) {

        // Your code goes here
        
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        Arrays.sort(arr);
        int i=0,j=n-1;
        for(int k=0;k<n;k++){
            if(k%2==1)ans.add(arr[i++]);
            else ans.add(arr[j--]);
        }
        return ans;
    }

}
