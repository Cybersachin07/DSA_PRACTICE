/*----GFG----
------POTD----
----18-11-2024----
------java_SOLUTION---
------Medium----
----Rotate  An Array----
https://www.geeksforgeeks.org/problems/reverse-an-array/1
*/



class Solution {
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rev(int arr[],int i,int j){
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        // add your code here
        int n = arr.length;
        d = d%n;
        rev(arr,0,d-1);
        rev(arr,d,n-1);
        rev(arr,0,n-1);
    }
}