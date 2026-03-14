import java.util.Stack;
//Leetcode Problem:1047 Remove All Adjacent Duplicates In String
//https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/
public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        String s="abbaca";
        System.out.println(removeDuplicates(s));
    }
    public static String removeDuplicates(String s){
        Stack<Character> st=new Stack<>();
        for (char c:s.toCharArray()){
            if(!st.isEmpty() && st.peek()==c){
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        StringBuilder result=new StringBuilder();
        while(!st.isEmpty()){
            result.append(st.pop());
        }
        return result.reverse().toString();
    }
}
