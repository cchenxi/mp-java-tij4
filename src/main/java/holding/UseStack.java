package holding;

import net.mindview.util.Stack;

/**
 * Date: 2018-05-05
 *
 * @author chenxi
 */
public class UseStack {

    /**
     * 栈在编程语言中经常用来对表达式求值。请使用net.mndview.util.Stack对下面的表达式求值，其中“+”表示“将后面的字母压进栈”，而“-”表示“弹出栈顶字母并打印它”：
     * "+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---"
     */
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<Character>();
        String str = "+U+n+c---+e+r+t---+a-+i-+n+t+y---+ -+r+u--+l+e+s---";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch (c) {
                case '+':
                    stack.push(str.charAt(i + 1));
                    break;
                case '-':
                    System.out.println("栈顶元素：" + stack.pop());
                    break;
                default:
                    break;
            }
        }

        System.out.println("final:" + stack);
    }
}
