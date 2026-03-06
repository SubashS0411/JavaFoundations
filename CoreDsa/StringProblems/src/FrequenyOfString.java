import java.util.Arrays;

public class FrequenyOfString {
    public static void main(String[] args) {
        String s = "abaca";
        System.out.println(Arrays.toString(frequency(s)));
    }
    public static int[] frequency(String s) {
        int[] frequency =new int[26];
        for (int i = 0; i < s.length(); i++) {
            char current=s.charAt(i);
            int bucketindex=current-'a';
            frequency[bucketindex]=frequency[bucketindex]+1;
        }

        return frequency;
    }
}
