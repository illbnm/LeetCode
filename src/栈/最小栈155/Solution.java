package 栈.最小栈155;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Stack;

/**
 * @author mimo
 * @date 2019/11/16 21:30
 */
public class Solution {
    static class MinStack {
        Stack<Integer> dataStack = new Stack<Integer>();
        Stack<Integer> miniStack = new Stack<Integer>();
        // 用temp和之后的push的值作比较
        int temp = 0;

        public MinStack() {

        }

//        public void push(int x) {
//            dataStack.push(x);
//            if (miniStack.isEmpty()) {
//                miniStack.push(x);
//            } else {
//                temp = miniStack.peek(); // 不能使用pop的原因是,会破坏之前的栈的最小值
//                if (x < temp) {
//                    miniStack.push(x);
//                }
//            }
//        }
public void push(int x) {
    dataStack.push(x);
    if (!miniStack.isEmpty()) {
        int top = miniStack.peek();
        //小于的时候才入栈
        if (x <= top) {
            miniStack.push(x);
        }
    }else{
        miniStack.push(x);
    }
}


        public void pop() {
            int temp = dataStack.pop();
            if (temp == miniStack.peek()) {
                miniStack.pop();
            }
        }

        public int top() {
            return dataStack.peek();
        }

        public int getMin() {
            if (miniStack.isEmpty()) {
                return Integer.MAX_VALUE;
            } else {
                return miniStack.peek();
            }
        }
    }

    public static void main(String[] args) {
        MinStack m = new MinStack();
        // ["MinStack","push","push","push","push","getMin","pop","getMin","pop","getMin","pop","getMin"]
        //[[],[2],[0],[3],[0],[],[],[],[],[],[],[]]
        m.push(2);
        m.push(0);
        m.push(3);
        m.push(0);
        System.out.println(m.getMin());
        m.pop();
        System.out.println(m.getMin());
        m.pop();
        System.out.println(m.getMin());
        m.pop();
        System.out.println(m.getMin());
    }
}
