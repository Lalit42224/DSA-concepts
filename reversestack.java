import java.util.Stack;

class Solution {

    static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int top = s.pop(); // better to use pop() directly
        reverse(s);
        insertbottom(s, top);
    }

    // This method must be static, since it's called from a static method
    static void insertbottom(Stack<Integer> s, int element) {
        if (s.isEmpty()) {
            s.push(element); // fixed variable name and stack reference
            return;
        }

        int top = s.pop();  // save top
        insertbottom(s, element); // recursive call with original element
        s.push(top); // restore top
    }
}
