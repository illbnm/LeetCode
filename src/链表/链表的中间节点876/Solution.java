package 链表.链表的中间节点876;

import 链表.ListNode;

/**
 * 本题要点: 使用快慢指针  慢指针每次走一步[从头结点开始]  快指针每次走两步[从头结点的下个节点开始]  慢走到 2   快走到 4
 * 1. while循环结束的条件: 就是fast == null ,或者fast.next == null . 表示fast已经走到了终点或者终点+1的位置
 *
 * @author mimo
 * @date 2019/11/16 16:20
 */
public class Solution {
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode low = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            low = low.next;
            fast = low.next;
        }
        if (fast != null) {
            return low.next;
        }
        return low;
    }

}
