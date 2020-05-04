class Solution {
    public int numJewelsInStones(String J, String S) {
        int count=0;
            for(int j=0; j<S.length(); j++)
            {
                char c = S.charAt(j);
                if(J.indexOf(c)>-1)
                count++;
            }     
        return count;
    }
}