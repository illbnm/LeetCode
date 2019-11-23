package 动态规划.爬楼梯70;

/**
 * @author mimo
 * @date 2019/11/23 15:06
 */
public class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }

    public static void main(String[] args) {

    }
}
