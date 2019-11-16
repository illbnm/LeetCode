package 链表.合并两个有序链表21;


import 链表.ListNode;

import java.util.List;

/**
 *
 * 本题要点 :
 * 首先判断特殊情况 : 两个链表均为null   两个链表之间只有一个为null
 * 第一步: 先找出两个链表的头结点最小的作为返回的head
 * 第二步: 主次比较两个链表的各个节点
 * 第三步: 将剩余的链表节点添加到后面
 * @author mimo
 * @date 2019/11/16 15:36
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head;
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null && l2 != null) {
            return l2;
        }
        if (l1 != null && l2 == null) {
            return l1;
        }

        if (l1.val > l2.val) {
            head = l2;
            l2 = l2.next;
        } else {
            head = l1;
            l1 = l1.next;
        }
        ListNode p = head;
        while (l1 != null && l2 != null) {

            if (l1.val >= l2.val) {
                p.next = l2;
                p = p.next;
                l2 = l2.next;
            } else {
                p.next = l1;
                p = p.next;
                l1 = l1.next;
            }
        }
        if (l1 != null) {
            p.next = l1;
        }
        if (l2 != null) {
            p.next = l2;
        }

        return head;

    }
}
