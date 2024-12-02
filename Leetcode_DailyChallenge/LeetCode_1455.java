/*---LEETCODE---DAILY CHALLENGE---
--------02-12-2024----
-----LEETCODE 1455----
-----Easy----
-------

----JAVA SOLUTION-------
*/



class Solution {

    public int isPrefixOfWord(String sentence, String searchWord) {
       
        String[] words = sentence.split(" ");
      
        for (int i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
               return i + 1;
            }
        }
       return -1;
    }
}