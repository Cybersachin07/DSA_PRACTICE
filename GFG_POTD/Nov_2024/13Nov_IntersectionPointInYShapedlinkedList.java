/*----GFG----
------POTD----
----12-11-2024----
------java_SOLUTION---
-------Medium----
----Intersection Point In Y shaped Linked List-----
https://www.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1
*/

class Intersect {
    // Function to find intersection point in Y shaped Linked Lists.
     static int findLength(Node head){
        Node temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        return len;
    }
   
    int intersectPoint(Node head1, Node head2) {
        // code here
        int len1=findLength(head1);
        int len2=findLength(head2);
        while(len1>len2){
            head1=head1.next;
            len1--;
        }
        while(len2>len1){
            head2=head2.next;
            len2--;
        }
        while(head1!=null && head2!=null){
            if(head1==head2)return head1.data;
            head1=head1.next;
            head2=head2.next;
        }
        return -1;
    }
}


/*-------------cpp solution=-------- */
class Solution {
    public:
      // Function to find intersection point in Y shaped Linked Lists.
      int intersectPoint(Node* head1, Node* head2) {
          // Your Code Here
          
           Node* temp1=head1;
          Node* temp2=head2;
          while(true){
              if(temp1==temp2) return temp1->data;
              temp1=temp1->next;
              temp2=temp2->next;
              if(temp1==NULL && temp2==NULL) return -1;
              if(temp1==NULL) temp1=head2;
              if(temp2==NULL) temp2=head1;
          }
          return -1;
      }
  };