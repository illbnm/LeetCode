package 动态规划.最大子段和53;

/**
 * 解题思路 :
 *
 * @author mimo
 * @date 2019/11/23 16:02
 */
public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for (int i = 1; i <nums.length ; i++) {
            dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
            if(dp[i] > dp[0]){
                dp[0] = dp[i] ;
            }
        }
        return dp[0];
    }
}
