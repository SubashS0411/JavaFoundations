import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
//Leetcode problem 49. Group Anagrams
//https://leetcode.com/problems/group-anagrams/description/
public class GroupAnagrams {
    public static void main(String[] args) {
        String[] s={"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(s));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(String word:strs){
            char[] letters=word.toCharArray();
            Arrays.sort(letters);
            String sortedkey=new String(letters);
            if(!map.containsKey(sortedkey)){
                map.put(sortedkey,new ArrayList<>());
            }
            map.get(sortedkey).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
