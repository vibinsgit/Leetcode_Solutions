//[Build Array from Permutation](https://leetcode.com/problems/build-array-from-permutation/)

class Solution {
    public static void main(String[] args) {
        
    }
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}