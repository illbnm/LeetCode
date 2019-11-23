package 数组.最小的k个数剑指offer;

import java.util.ArrayList;

/**
 * @author mimo
 * @date 2019/11/17 14:41
 */
public class Solution {
     public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if (input == null || input.length == 0) {
            return res;
        }
        quick_sort(input, 0, input.length);
        for (int x:input
             ) {
            res.add(x);
        }
        return  res;
    }

    private  void quick_sort(int[] input, int l, int h) {
        if (h <= l) {
            return;
        }
        int m = partition(input, l, h);
        quick_sort(input, l, m - 1);
        quick_sort(input, m + 1, h);
    }

    private  int partition(int[] input, int l, int h) {
        int i = l;
        int j = h ;
        int v = input[i];
        while (true) {
            while (v > input[i++] && i != h) {
            }
            while (v < input[j--] && j != l) {
            }
            if (i >= j) {
                break;
            }
            swap(input, i, j);
        }
        swap(input, l, j);
        return j;
    }

    private static void swap(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }

    public static void main(String[] args) {
        int [] input = {4,5,1,6,2,7,3,8};
        int k = 5 ;
        Solution s = new Solution() ;
        ArrayList list =s. GetLeastNumbers_Solution(input,k);
        System.out.println(list
        .toString());
    }
}
