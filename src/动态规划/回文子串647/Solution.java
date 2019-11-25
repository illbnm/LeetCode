package 动态规划.回文子串647;

/**
 * @author mimo
 * @date 2019/11/25 20:13
 */
public class Solution {
    public int countSubstrings(String s) {
        char[] c = s.toCharArray();
        int dp[] = new int[s.length()]; // dp[j]表示从j位置到当前位置i是否为回文子串
        int count = 0;
        for (int i = 0; i < c.length; i++) {
            dp[i] = 1; // 单个字符为回文
            count++;
            for (int j = 0; j < i; j++) {
                if (c[i] == c[j] && dp  [j + 1] == 1) {
                    dp[j] = 1;
                    count += 1;
                } else {
                    dp[j] = 0;
                }
            }

        }
        return count;
    }
}
