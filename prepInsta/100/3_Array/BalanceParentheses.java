import java.util.Stack;

public class BalanceParentheses {
    public static void main(String[] args) {
        String str = "()(())";
        if (balancedParenthesis(str))
            System.out.println("True");
        else
            System.out.println("False");
    }

    private static boolean balancedParenthesis(String str) {
        Stack<Character> st = new Stack<>();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '(') {
                st.push('(');
            } else if (str.charAt(i) == ')') {
                if (st.isEmpty()) {
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
}
