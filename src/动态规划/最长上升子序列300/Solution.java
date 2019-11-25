package 动态规划.最长上升子序列300;

/**
 * 一直未排序的数组,求这个数组的最长上升子序列的长度
 *
 * @author mimo
 * @date 2019/11/25 16:27
 */
public class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        // dp表示最长子序列的长度
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int LIS = 1;
        for (int i = 0; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && dp[i] < dp[j] + 1) { // 遍历nums[i]之前的每个数,如果小于dp[i]就,将其
                    dp[i] = dp[j] + 1;
                }
            }
            if (LIS < dp[i]) {
                LIS = dp[i];
            }
        }
        return LIS;
    }
}
