public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int first = 1;
        int last = n;
        int middle;
        while(first < last) {
            middle = ((last-first)>>1) + first;
            if(isBadVersion(middle)) 
                last = middle;
            else
                first = middle + 1;
        }
        
        return first;
        
        
           
    }
}