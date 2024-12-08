/*----GFG----
------POTD----
----27-11-2024----
------java_SOLUTION---
------Medium----
----Implement A To i----
https://www.geeksforgeeks.org/problems/implement-atoi/1

*/



class Solution {
    public int myAtoi(String s) {
        // Your code here
       int n = s.length();
        int i = 0;
        while(i < n && s.charAt(i) == ' '){
            ++i;
        }
        
        int sign = 1;
        if(i < n && (s.charAt(i) == '-' || s.charAt(i) == '+' )){
            if(s.charAt(i) == '-'){
                sign = -1;
            }
            ++i;
        }
        
        long res = 0;
        while(i < n && Character.isDigit(s.charAt(i))){
            res = res * 10 + s.charAt(i) - '0';
            if(res * sign > Integer.MAX_VALUE){
                return Integer.MAX_VALUE;
            }
            if(res * sign < Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
            ++i;
        }
        
        return (int)(res * sign);
    }
    
}