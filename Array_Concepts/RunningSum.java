//[Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array/)

class Solution {
    public static void main(String[] args) {
        
    }
    public int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            nums[i] = nums[i-1] + nums[i];
        }
        return nums;
    }
}
