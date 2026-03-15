public class RemoveAllAdjacentDuplicatesInString {
//    1047. Remove All Adjacent Duplicates In String
//    https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/description/
    public static void main(String[] args) {
        String s="abbaca";
        System.out.println(removeDuplicates(s));
    }
    public static String removeDuplicates(String s){
        StringBuilder stack=new StringBuilder();
        for(char c:s.toCharArray()) {
            int currentlength = stack.length();
            if (currentlength > 0 && stack.charAt(currentlength - 1) == c) {
                stack.deleteCharAt(currentlength - 1);

            } else {
                stack.append(c);
            }
        }
            return stack.toString();

    }
}
