/*----GFG----
------POTD----
----10-11-2024----
------java_SOLUTION---
-------Easy----
----Union of Two sorted Array With Distinct Elements-----
https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-with-distinct-elements/1
*/



class Solution {
 
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        int i=0,j=0,n=a.length,m=b.length;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i<n || j<m){
            int num1 = i<n?a[i]:Integer.MAX_VALUE;
            int num2 = j<m?b[j]:Integer.MAX_VALUE;
            if(num1<num2){
                ans.add(num1);
                i++;
            }
            else if(num2<num1){
                ans.add(num2);
                j++;
            }
            else{
                ans.add(num1);
                i++;
                j++;
            }
        }
        return ans;
    }
}