/*----GFG----
------POTD----
----21-11-2024----
------java_SOLUTION---
------Easy----
----Stock Buy And Sell --MAx One Transaction allowed----
https://www.geeksforgeeks.org/problems/majority-vote/1
*/


class Solution {
    public:
      int maximumProfit(vector<int> &prices) {
          // code here
              int maxele=0,maxProfit=0;
          for(int i=prices.size()-1;i>=0;i--){
              maxele=max(maxele,prices[i]);
              maxProfit=max(maxProfit,maxele-prices[i]);
          }
          return maxProfit;
      }
  };