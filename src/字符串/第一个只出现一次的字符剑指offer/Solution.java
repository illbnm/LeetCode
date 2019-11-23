package 字符串.第一个只出现一次的字符剑指offer;

/**
 * @author mimo
 * @date 2019/11/17 20:15
 */
public class Solution {
    public int FirstNotRepeatingChar(String str) {
        char[] ctr = str.toCharArray();

        int[] num = new int[150];

        for (char c :
                ctr) {
            num[(int) c] += 1;
        }
        for (int i = 0 ;i < ctr.length;i++){
            if (num[ ((int)ctr[i])] == 1 ){
                return i ;
            }
        }


        return -1;
    }
}
