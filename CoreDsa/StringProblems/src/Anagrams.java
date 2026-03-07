import java.util.ArrayList;
import java.util.List;
//leetcode problem 438. Find All Anagrams in a String
//https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
public class Anagrams {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String  p = "abc";
        System.out.println(findAnagrams(s,p));
        String s2="abab";
        String p2="ab";
        System.out.println(findAnagrams(s2,p2));
    }
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) {
            return result;
        }

        int[] target = new int[26];
        int[] window = new int[26];
        int k = p.length();

        // FIX #1: target uses 'p', window uses 's'
        for (int i = 0; i < k; i++) {
            target[p.charAt(i) - 'a']++;
            window[s.charAt(i) - 'a']++;
        }

        if (matches(target, window)) {
            result.add(0);
        }

        for (int i = k; i < s.length(); i++) {
            window[s.charAt(i) - 'a']++;
            window[s.charAt(i - k) - 'a']--;

            if (matches(target, window)) {
                result.add(i - k + 1);
            }
        }

        return result;
    }

    // FIX #2: Check for mismatches (!=) and return false
    public static boolean matches(int[] arr1, int[] arr2){
        for (int i = 0; i < 26; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}

