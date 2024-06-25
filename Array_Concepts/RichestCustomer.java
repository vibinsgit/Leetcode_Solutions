//[Richest Customer Wealth](https://leetcode.com/problems/richest-customer-wealth/)

class Solution {
    public static void main(String[] args) {
        
    }
    public int maximumWealth(int[][] accounts) {
        int wealth = 0;
        for(int i = 0; i < accounts.length; i++){
            int maxWealth = 0;
            for(int j = 0; j < accounts[i].length; j++){
                maxWealth += accounts[i][j];
            }
            wealth = Math.max(wealth, maxWealth);
        }
        return wealth;
    }
}
