/*----GFG----
------POTD----
----24-10-2024----
------java_SOLUTION---
-------Easy----
----Modify The Array---
----https://www.geeksforgeeks.org/problems/ease-the-array0633/1----

*/



class Solution {
    static ArrayList<Integer> modifyAndRearrangeArr(int arr[]) {
        // Complete the function
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i+1] && arr[i]!=0){
                arr[i]*=2;
                arr[i+1]=0;
                i++;
            }
        }
        int i=0;
        for(int j=0;j<n;j++){
            if(arr[j]!=0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int x:arr)ans.add(x);
        return ans;
    }
}