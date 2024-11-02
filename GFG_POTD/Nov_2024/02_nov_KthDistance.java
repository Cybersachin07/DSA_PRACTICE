/*----GFG----
------POTD----
----02-11-2024----
------cpp_SOLUTION---
-------Easy----
--Kth Distance-----
----https://www.geeksforgeeks.org/problems/kth-distance3757/1----

*/

class Solution {
    public:
  
      bool checkDuplicatesWithinK(vector<int>& arr, int k) {
          // your code
          
          unordered_map<int,int>mp;
          for(int i=0;i<arr.size();i++){
              if(mp.find(arr[i])!=mp.end()){
                  if(i-mp[arr[i]]<=k) return true;
                  else mp[arr[i]]=i;
              }
              mp[arr[i]]=i;
          }
          return false;
      }
  };