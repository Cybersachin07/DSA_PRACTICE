/*----GFG----
------POTD----
----03-11-2024----
------java_SOLUTION---
-------Easy----
--Is Linked LIst Length Even-----
----https://www.geeksforgeeks.org/problems/linked-list-length-even-or-odd/1----

*/

class Solution {
    public boolean isLengthEven(Node head) {
        // code here
        
        Node temp = head;
        int count = 0;
        while( temp != null){
            count ++;
            temp = temp.next;
            
        }
        if(count%2==0)return true;
        return false;
    }
}

