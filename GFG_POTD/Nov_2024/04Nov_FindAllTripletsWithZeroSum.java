/*----GFG----
------POTD----
----04-11-2024----
------java_SOLUTION---
-------Easy----
--

Find All Triplets with Zero Sum-----
https://www.geeksforgeeks.org/problems/find-all-triplets-with-zero-sum/1
*/

class Solution {
    public List<List<Integer>> findTriplets(int[] arr) {
        // Your code here
        Map<Integer, List<int[]>> map = new HashMap<>();
        int n = arr.length;
        for(int i = 0; i < n - 1; ++i){
            for(int j= i  +1; j < n; ++j){
                int sum = arr[i] + arr[j];
                if(!map.containsKey(sum)){
                    map.put(sum, new ArrayList<>());
                }
                map.get(sum).add(new int[]{i, j});
            }
        }
        
        Set<List<Integer>> resSet = new HashSet<>();
        for(int k = 0; k < n; ++k){
            int rem = -arr[k];
            if(map.containsKey(rem)){
                List<int[]> pairs = map.get(rem);
                for(int[] p : pairs){
                    if(p[0] != k && p[1] != k){
                        List<Integer> curr = Arrays.asList(k, p[0], p[1]);
                        Collections.sort(curr);
                        resSet.add(curr);
                    }
                }
            }
        }
        
        return new ArrayList<>(resSet);
    }
}