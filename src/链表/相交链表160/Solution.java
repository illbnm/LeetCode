package 链表.相交链表160;

import 链表.ListNode;

/**
 * @author mimo
 * @date 2019/11/21 15:32
 */
public class    Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null && headB == null) {
            return null;
        }
        ListNode pa = headA;
        ListNode pb = headB;
        while (pa != pb) {
            pa = (pa != null) ? pa.next : headB;
            pb = (pb != null) ? pb.next : headA;
        }
        return pa;
    }
}
