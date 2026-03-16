import java.util.Stack;
//Leetcode problem150. Evaluate Reverse Polish Notation
// https://leetcode.com/problems/evaluate-reverse-polish-notation/description/:
public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String[] s={"2","1","+","3","*"};
        System.out.println(evalRPN(s));
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String token:tokens){
            if(token.equals("+")||token.equals("-")||token.equals("*")||token.equals("/")){
                int right=stack.pop();
                int left=stack.pop();
                switch (token){
                    case "+":
                        stack.push(left+right);
                        break;
                    case "-":
                        stack.push(left-right);
                        break;
                    case "*":
                        stack.push(right*left);
                        break;
                    case "/":
                        stack.push(left/right);
                        break;
                }

            }
            else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
    }
