package 数组.统计一个数字在排序数组中出现的次数剑指offer;

/**
 * @author mimo
 * @date 2019/11/17 20:28
 */
public class Solution {
    public int GetNumberOfK(int[] array, int k) {
        int first = GetFirst(array, 0, array.length - 1, k);
        int last = GetLast(array, 0, array.length - 1, k);

        if (first != -1 && last != -1) {

            return last - first - 1;
        } else {
            return -1;
        }
    }

    private int GetLast(int[] array, int l, int h, int k) {
        if (l > h) {
            return -1;
        }
        int mid = (l + h) / 2;
        if (array[mid] > k) {
            return GetLast(array, l, mid - 1, k);
        } else if (array[mid] < k) {
            return GetLast(array, mid + 1, h, k);
        } else if (mid + 1 < h && array[mid + 1] == k) {
            return GetLast(array, mid + 1, h, k);
        } else {
            return mid;
        }

    }

    private int GetFirst(int[] array, int l, int h, int k) {
        int mid = (l + h) / 2;
        while (l <= h) {
            if (array[mid] > k) {
                h = mid - 1;
            } else if (array[mid] < k) {
                l = mid + 1;
            } else if (mid - 1 > 0 && array[mid - 1] == k) {
                h = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }





}