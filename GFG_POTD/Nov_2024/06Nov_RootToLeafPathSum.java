/*----GFG----
------POTD----
----06-11-2024----
------java_SOLUTION---
-------Medium----
----Root To LEaf Path Sum-----
https://www.geeksforgeeks.org/problems/root-to-leaf-paths-sum/1
*/


class Solution {
    public static int help(Node root,int num){
       if(root==null)return 0;
       num = num*10+root.data;
       if(root.left==null && root.right==null)return num;
       return help(root.left,num)+help(root.right,num);
   }
   public static int treePathsSum(Node root) {
       // add code here.
       return help(root,0);
   }
}