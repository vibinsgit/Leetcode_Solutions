//[Concatenation of Array](https://leetcode.com/problems/concatenation-of-array/)

class Solution {
    public static void main(String[] args) {
        
    }
    public int[] getConcatenation(int[] nums) {
        int arrayLength = nums.length;
        int[] ans = new int[2 * arrayLength];
        for(int i = 0; i < arrayLength; i++){
            ans[i] = nums[i];
            ans[i + arrayLength] = nums[i];
        }
        return ans;
    }
}
