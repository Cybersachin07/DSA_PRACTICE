/*----GFG----
------POTD----
----09-10-2024----
------cpp_SOLUTION---
-------easy----
----Linked List Matrix-----
----https://www.geeksforgeeks.org/problems/linked-list-matrix/1--

---
*/

class Solution {
    public:
      Node* constructLinkedMatrix(vector<vector<int>>& mat) {
          // code Here
          int n=mat.size();
          if(n==0) return NULL;
          vector<vector<Node*>>Nodemat(n,vector<Node*>(n,NULL));
          
          for(int i=0;i<n;i++){
              for(int j=0;j<n;j++){
                  Nodemat[i][j]=new Node(mat[i][j]);
              }
          }
          for(int i=0;i<n;i++){
              for(int j=0;j<n;j++){
                 if(j<n-1) Nodemat[i][j]->right=Nodemat[i][j+1];
                 if(i<n-1)  Nodemat[i][j]->down=Nodemat[i+1][j];
      }}
      return Nodemat[0][0];
      }
  };