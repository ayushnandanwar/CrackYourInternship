package Strings;

import java.util.Stack;

public class q1_valid_parenthesis {
    public static void main(String[] args) {
        System.out.println(isValid("("));
    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' ||s.charAt(i) == '{'){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')' || s.charAt(i) == ']' ||s.charAt(i) == '}'){
                if(st.isEmpty()) return false;
                if(s.charAt(i) == ')'){
                    if(st.peek() != '(')
                        return false;
                }
                else if(s.charAt(i) == ']'){
                    if(st.peek() != '[')
                        return false;
                }
                else if(s.charAt(i) == '}'){
                    if(st.peek() != '{')
                        return false;
                }
                st.pop();
            }
        }
        if(st.isEmpty())
            return true;
        return false;
    }
}
