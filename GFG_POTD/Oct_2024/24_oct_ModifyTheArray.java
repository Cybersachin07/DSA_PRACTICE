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
     ArrayList<Integer> al = new ArrayList<>();
        int n = arr.length;
        int zero = 0;
        
        for(int i=0; i<n-1; i++)
        {
            if(arr[i]!=0 && arr[i]==arr[i+1])
            {
                al.add(arr[i]*2);
                arr[i+1] = 0;
            }
            else
            {
                if(arr[i]==0) zero++;
                else al.add(arr[i]);
            }
        }
        al.add(arr[n-1]);
        for(int i=0; i<zero; i++)
        {
            al.add(al.size(), 0);
        }
        return al;
    }
}