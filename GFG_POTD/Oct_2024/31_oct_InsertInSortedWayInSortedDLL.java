/*----GFG----
------POTD----
----31-10-2024----
------java_SOLUTION---
-------Easy----
---Insert In Sorted Way In A Sorted DLL------
----https://www.geeksforgeeks.org/problems/insert-in-sorted-way-in-a-sorted-dll/1----

*/



/*class of the node of the DLL is as
/*
class Node {
    int data;
    Node prev, next;
    Node(int data) {
        this.data = data;
        this.prev = this.next = null;
    }
}
*/
class Solution {
    public Node sortedInsert(Node head, int x) {
        // add your code here
        Node root=head;
        Node prevv=head;
        int count=0;
        while(head!=null){
            if(head.data>=x){
                Node temp=new Node(x);
                temp.next=head;
                temp.prev=prevv;
                if(count==0){
                    return temp;
                }
                prevv.next=temp;
                return root;
            }else{
                count++;
                prevv=head;
                head=head.next;
            }
        }
        Node temp=new Node(x);
        prevv.next=temp;
        temp.prev=prevv;
        return root;
    }
}