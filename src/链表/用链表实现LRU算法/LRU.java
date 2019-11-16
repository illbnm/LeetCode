package 链表.用链表实现LRU算法;

import java.util.HashMap;

/**
 * @author mimo
 * @date 2019/11/16 14:15
 */
public class LRU<T> {
    private HashMap<String, Node> cache = new HashMap<String, Node>();
    Node head, tail;
    int size;
    int capacity;
    final int MaxCount = 10;

    public LRU(int capacity) {
        this.capacity = capacity;
        head = new Node();
        tail = new Node();
        head.next = tail;
        tail.pre = head;
    }

    public int get(String key) {
        Node node = cache.get(key);
        if (node == null) {
            return -1;
        }
        moveToHead(node);
        return node.val;
    }

    public void moveToHead(Node node) {
        this.remove(node);
        this.add(node);
    }

    /**
     * 将node节点添加到head节点的后面
     *
     * @param node
     */
    private void add(Node node) {
        node.pre = head;
        node.next = head.next;
        head.next.pre = node;
        head.next = node;
    }

    private void remove(Node node) {
        Node pre = node.pre;
        Node next = node.next;
        pre.next = next;
        next.pre = pre;
    }


}
