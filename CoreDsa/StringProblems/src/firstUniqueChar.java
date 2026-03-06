import java.util.Arrays;

public class firstUniqueChar {
    public static void main(String[] args) {
        String s = "abaca";
        System.out.println(firstUniqueCharacter(s));
        String s1="loveleetcode";
        System.out.println(firstUniqueCharacter(s1));
    }
    public static int firstUniqueCharacter(String s) {
        int[] frequency =new int[26];
        for (int i = 0; i < s.length(); i++) {
            char current=s.charAt(i);
            int bucketindex=current-'a';
            frequency[bucketindex]=frequency[bucketindex]+1;
        }
        for (int i = 0; i < s.length(); i++) {
            char current=s.charAt(i);
            int bucketindex=current-'a';
            if(frequency[bucketindex]==1){
                return i;
            }
        }
        return -1;

    }
}
