/*----GFG----
------POTD----
----05-11-2024----
------java_SOLUTION---
-------Medium----
--

Rotate By 90 degree-----
https://www.geeksforgeeks.org/problems/rotate-by-90-degree0356/1
*/


class GFG {
    static void rotate(int matrix[][]) {
        // Code Here
        int n = matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1] = temp;
            }
        }
    }
}