/*----GFG----
------POTD----
----26-10-2024----
------java_SOLUTION---
-------Easy----
---OCcurence Of A Integer In a Linked List---
----https://www.geeksforgeeks.org/problems/occurence-of-an-integer-in-a-linked-list/1----

*/

class Solution {
    public static int count(Node head, int key) {
         // code here
         int count = 0;
         
         Node current = head;
         
         while(current != null){
             if(current.data == key){
                 count++;
             }
             current = current.next;
         }
         
         return count;
     }
 }