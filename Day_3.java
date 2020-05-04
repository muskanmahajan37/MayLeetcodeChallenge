class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Stack<Character> stack = new Stack<>();
        
        if(ransomNote.length()==0 && magazine.length()==0)  {
            return true;
        }
        
        if(ransomNote.isEmpty() && magazine.length()>1)  {
            return true;
        } 
        
        if(magazine.isEmpty())   {
            return false;
        }
        
        for(int i=0; i<magazine.length(); i++) {
            stack.push(magazine.charAt(i));
        }
        
        int j=0;
        
        for(j=0; j<ransomNote.length() && !stack.isEmpty(); j++) {
            if(stack.contains(ransomNote.charAt(j))) {
                int k = stack.indexOf(ransomNote.charAt(j));
                stack.remove(k);
            }
            else
                return false;
        }
        return true;
    }
}