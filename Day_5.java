/*Given a string, find the first non-repeating character in it and return it's index. If it doesn't exist, return -1.

Examples:

s = "leetcode"
return 0.

s = "loveleetcode",
return 2.
Note: You may assume the string contain only lowercase letters.
*/

class Solution {
    static final int MAX_COUNT = 256;
    public int firstUniqChar(String s) {
       
        int[] count = new int[MAX_COUNT];
        
        for(int i=0; i<s.length(); i++) {
            count[s.charAt(i)]++;
        }
            
        int index = -1;
            for(int j=0; j<s.length(); j++) {
                if(count[s.charAt(j)] == 1) {
                    index = j;
                    break;
            }
            }
            
           return index;    
    }
}