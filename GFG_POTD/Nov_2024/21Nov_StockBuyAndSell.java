/*----GFG----
------POTD----
----21-11-2024----
------java_SOLUTION---
------Medium----
----Stock Buy And Sell----
https://www.geeksforgeeks.org/problems/majority-vote/1
*/



class Solution {
    public:
      int maximumProfit(vector<int> &prices) {
          // code here
       int profit=0;
          for(int i=0;i<prices.size()-1;i++){
              if(prices[i+1]>prices[i]) profit+=prices[i+1]-prices[i];
          }
          return profit;
      }
  };