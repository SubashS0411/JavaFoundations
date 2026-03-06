public class MaximumNumberofVowels {
//    1456. Maximum Number of Vowels in a Substring of Given Length
//    https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description/
    public static void main(String[] args) {
        String a = "abciiidef";
        int window = 3;
        String b="aeiou";
        int window2=2;
        System.out.println(maxVowels(a, window));
        System.out.println(maxVowels(b, window2));
    }

    public static int maxVowels(String s, int k) {
        int count = 0;
        int maxvowels=0;
        for (int i = 0; i < s.length(); i++) {
            if (isvowel(s.charAt(i))) count++;
            if (i >= k) {
                if (isvowel(s.charAt(i - k))) {
                    count--;
                }
            }
            if (i >= k - 1) {
                 maxvowels= Math.max(maxvowels,count);
            }

        }
        return maxvowels;
    }

    public static boolean isvowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';


    }
    }

