/*---LEETCODE---DAILY CHALLENGE---
-------03-11-2024----
-----LEETCODE 796----
-----Easy----
---https://leetcode.com/problems/rotate-string/description/----

----JAVA SOLUTION-------
*/

class Solution {
    public boolean rotateString(String s, String goal) {
       int m  = s.length();
       int n = goal.length();

       if(m == n && (s + s).contains(goal)){
        return true;
       } 

       return false;
    }
}