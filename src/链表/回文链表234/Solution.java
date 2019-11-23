package 链表.回文链表234;

import 链表.ListNode;

import java.util.Stack;

/**
 * @author mimo
 * @date 2019/11/21 13:38
 */
public class Solution {
    /**
     * 错误的思考方向 : 使用栈的话不能考虑到 1 0 1这种特俗情况
     * [即链表节点为奇数,不能抵消的特点,这种情况需要判断链表的中点],
     * 所以不能使用栈
     *
     * @param head
     * @return
     */
    public boolean isPalindromeStack(ListNode head) {
        boolean res = false;

        ListNode cur = head;
        int preval;
        if (cur.next == null) {
            return true;
        }
        if (cur == null || cur.next.next == null) {
            return res;
        }
        Stack<Integer> S = new Stack<>();
        while (cur != null) {

            if (S.isEmpty()) {
                S.push(cur.val);
            } else {
                if (cur.val == S.peek()) {
                    S.pop();
                }
            }
            cur = cur.next;
        }
        return S.size() == 0;
    }

    public boolean isPalindrome(ListNode head) {
        boolean res = false;
        if (head == null || head.next == null) {
            return res = true;
        }
        // 首先使用快慢指针找到链表的中点
        // 此处的fast的初始值会影响low值[也就是中点值的位置]
        //奇数不影响,偶数的fast = head 找的是中值前一个位置 ,fast = head.next 找的是中值后一个位置
        // fast == null 时说明链表节点个数为奇数反之为偶数
        ListNode low = head;
        ListNode fast = head;
        ListNode temp = head; // 每次循环的当前节点
        ListNode pre = null;//
        while (fast == null || fast.next == null) {
            temp = low;
            low = low.next;
            fast = fast.next.next;
            temp.next = pre;
            pre = temp;
        }
        if (fast != null) {// 奇数
            low = low.next;
        }
        while (temp != null && low != null) {
            if (temp.val != low.val) {
                return res;
            }
            temp = temp.next;
            low = low.next;
        }
        return res = true;
    }
}
