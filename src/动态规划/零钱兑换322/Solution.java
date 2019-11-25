package 动态规划.零钱兑换322;

/**
 * 解题要点:
 * 本题未搞清楚,算法未能理解
 * @author mimo
 * @date 2019/11/24 9:45
 */
public class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        for (int i = 0; i <= amount; i++) {
            dp[i] = -1;
        }
        dp[0] = 0;// 金额0为最优解
        for (int i = 1; i < amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0 && dp[i - coins[j]] != -1) { // 这里是判断在dp[]范围之内 并且 dp[i-coins[j]]!=-1
                    if (dp[i] == -1 || dp[i] > dp[i - coins[j]] + 1) {
                        dp[i] = dp[i - coins[j]] + 1;
                    }
                }
            }
        }
        return dp[amount];
    }
}
