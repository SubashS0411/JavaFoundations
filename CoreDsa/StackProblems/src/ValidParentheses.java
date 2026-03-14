import java.util.Stack;
//Leetcode Problem:20. Valid Parentheses
//https://leetcode.com/problems/valid-parentheses/description/
public class ValidParentheses {
    public static void main(String[] args) {
        String s="()[]{}";
        System.out.println(isValid(s));
        String s1="()";
        System.out.println(isValid(s1));
        String s2="(]";
        System.out.println(isValid(s2));
        String s3 = "([])";
        System.out.println(isValid(s3));
    }
    public static boolean isValid(String s){
        Stack<Character> st=new Stack<>();
       for(char c:s.toCharArray()){
            if(c=='{'||c=='('||c=='['){
                st.push(c);
            }
            else{
                if(st.isEmpty()) {
                    return false;
                }
               char top=st.pop();
                if(c=='}'&& top!='{')return false;
                if(c==')'&& top!='(')return false;
                if(c==']'&& top!='[')return false;

            }
       }
       return st.isEmpty();
    }
}
