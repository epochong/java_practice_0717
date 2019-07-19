import java.util.Scanner;
import java.util.Stack;

/**
 * @author epochong
 * @date 2019/7/17 22:36
 * @email epochong@163.com
 * @blog epochong.github.io
 * @describe
 */
public class 回文串 {
    public static boolean isHuiWen(String str) {
        Stack<Character> stack = new Stack <>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        for (int i = 0; i < stack.size(); i++) {
            if (stack.pop() != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (input.hasNext()) {
            String str = input.next();
            boolean judge = false;
            for (int i = 0; i < str.length(); i++) {
                if (isHuiWen(str.replace(String.valueOf(str.charAt(i)),""))) {
                    judge = true;
                }
            }
            if (judge) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }
}
