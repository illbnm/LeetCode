package 动态规划.三角形120;

import java.util.List;

/**
 * @author mimo
 * @date 2019/11/24 18:36
 */
public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {

        int[][] dp = new int[triangle.size()][triangle.size()];
        // 初始化最后一行的dp
        for (int i = 0; i < triangle.size(); i++) {
            dp[triangle.size() - 1][i] = triangle.get(triangle.size() - 1).get(i);
        }
        //从倒数第二行开始生成dp[][]
        for (int i = triangle.size() - 2; i >= 0; i--) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + triangle.get(i).get(j);
            }
        }

        return triangle.get(0).get(0);
    }
}
