package 栈.有效的括号20;

import java.util.Stack;

/**
 * 解题要点: 利用了栈的特性 括号匹配问题在对字符串进行push的过程中进行判断,
 * 如果遇到匹配的括号就相互抵消(也就是将左边的括号pop)
 * 最后判断栈中元素的数量就行
 *
 * @author mimo
 * @date 2019/11/16 20:55
 */
public class Solution {

    public boolean isValid(String s) {
        char[] ctr = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (Character c :
                ctr) {
            if (stack.size() == 0) {
                stack.push(c);
            } else if (isoffset(stack.peek(), c)) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.size() == 0;
    }

    private boolean isoffset(Character c1, Character c2) {
        if ((c1 == '(' && c2 == ')') || (c1 == '{' && c2 == '}') || (c1 == '[' && c2 == ']')) {
            return true;
        } else {
            return false;
        }
    }
}
