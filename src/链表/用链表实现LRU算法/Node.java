package 链表.用链表实现LRU算法;

/**
 * @author mimo
 * @date 2019/11/16 14:15
 */
public class Node {
    String key ; // 存储真正的value值
    int val;// 保存的是下标值
    Node pre = null ;
    Node next = null ;

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public Node getPre() {
        return pre;
    }

    public void setPre(Node pre) {
        this.pre = pre;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
