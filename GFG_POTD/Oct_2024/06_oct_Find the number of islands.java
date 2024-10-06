/*----GFG----
------POTD----
----06-10-2024----
------JAVA_SOLUTION---
-------Medium----
----find the number of islands-----
----https://www.geeksforgeeks.org/problems/find-the-number-of-islands/1--

---
*/

class Solution {
    // Function to find the number of islands.
    public int numIslands(char[][] grid) {
        // Code here
        int n = grid.length;
        int m = grid[0].length;
        int noOfIslands = 0;
        for(int i = 0; i < n ; ++i){
            for(int j = 0; j < m; ++j){
                if(grid[i][j] == '1'){
                    noOfIslands++;        
                    dfs(grid, i, j, n, m);
                }
            }
        }
        return noOfIslands;
    }
    
    void dfs(char[][] grid, int i, int j, int n, int m){
        if(i < 0 || j < 0 || i >= n || j >= m){
            return;
        }
        
        if(grid[i][j] == '0' || grid[i][j] == '2'){
            return;
        }
        
        grid[i][j] = '2';
        dfs(grid, i - 1, j, n, m);
        dfs(grid, i + 1, j, n, m);
        dfs(grid, i, j - 1, n, m);
        dfs(grid, i, j + 1, n, m);
        dfs(grid, i + 1, j + 1, n, m);
        dfs(grid, i - 1, j - 1, n, m);
        dfs(grid, i - 1, j + 1, n, m);
        dfs(grid, i + 1, j - 1, n, m);
    }
}