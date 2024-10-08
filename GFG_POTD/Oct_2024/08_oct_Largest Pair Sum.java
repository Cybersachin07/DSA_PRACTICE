/*----GFG----
------POTD----
----08-10-2024----
------java_SOLUTION---
-------easy----
----Largset Pair Sum-----
----https://www.geeksforgeeks.org/problems/pair-sum--120604/1--

---
*/

class Solution {
    public static int pairsum(int[] arr) {
        // code here
         Arrays.sort(arr);
        return arr[arr.length - 1] + arr[arr.length - 2];
    }
}




/* ---java soultion---*/

class Solution {
    public static int pairsum(int[] arr) {
        // code here
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for(int x:arr){
            if(x>largest){
                secondLargest=largest;
                largest=x;
            }
            else if(x>secondLargest)secondLargest=x;
        }
        return largest+secondLargest;
    
    }
}