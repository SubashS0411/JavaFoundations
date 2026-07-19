public class ValidPalidromeString {
    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw?";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome("tab a cat"));
    }
    public static boolean isPalindrome(String s){
        StringBuilder str=new StringBuilder();
       for(char c:s.toCharArray()){
           if(Character.isLetterOrDigit(c)){
               str.append(Character.toLowerCase(c));
           }
       }
       return str.toString().equals(str.reverse().toString());
    }
}

