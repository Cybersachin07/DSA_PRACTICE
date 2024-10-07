/*----GFG----
------POTD----
----07-10-2024----
------cpp_SOLUTION---
-------Medium----
----XOR linked List-----
----https://www.geeksforgeeks.org/problems/find-the-number-of-islands/1--

---
*/



/*
Structure of linked list is as
struct Node
{
    int data;
    struct Node* npx;

    Node(int x){
        data = x;
        npx = NULL;
    }
};

Utility function to get XOR of two Struct Node pointer
use this function to get XOR of two pointers
struct Node* XOR (struct Node *a, struct Node *b)
{
    return (struct Node*) ((uintptr_t) (a) ^ (uintptr_t) (b));
}
*/

// function should insert the data to the front of the list
struct Node *insert(struct Node *head, int data) {
    // Code here
    Node *temp = new Node(data);
    temp->npx = head;
    if(head)head->npx = XOR(temp,head->npx);
    return temp;
}

vector<int> getList(struct Node *head) {
    // Code here
    vector<int> ans;
    Node *curr=head,*prev=NULL,*nxt=NULL;
    while(curr){
        ans.push_back(curr->data);
        nxt = XOR(prev,curr->npx);
        prev=curr;
        curr=nxt;
    }
    return ans;
}

