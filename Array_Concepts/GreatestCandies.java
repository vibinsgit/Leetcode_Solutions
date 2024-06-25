//[Kids With the Greatest Number of Candies](https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/)

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        
    }
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandy = 0;
        for(int candy : candies){
            maxCandy = Math.max(maxCandy, candy);
        }
        List<Boolean> result = new ArrayList<>();
        for(int candy : candies){
            if(candy + extraCandies >= maxCandy){
                result.add(true);
            }else{
                result.add(false);
            }
        }
        return result;
    }
}
