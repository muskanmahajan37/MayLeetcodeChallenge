/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

Example 1:

Input: [3,2,3]
Output: 3
Example 2:

Input: [2,2,1,1,1,2,2]
Output: 2
*/

class Solution {
    public int majorityElement(int[] nums) {
        int majIndex = 0;
        int count = 1;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] == nums[majIndex]) {
                count++;
            }
            else {
                count--;
            }
            
            if(count == 0) {
                i++;
                majIndex = i;
                count = 1;
            }
        }
        count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == nums[majIndex]) {
                count++;
            }
        }
        if(count > nums.length/2) {
            return nums[majIndex];
        }
        return -1;
        
    }
}
