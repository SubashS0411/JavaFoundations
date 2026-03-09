public class ForensicDetective {
//    leetcode problem 383 Ransom Note
//    https://leetcode.com/problems/ransom-note/description/
    public static void main(String[] args) {
        String ransomeNote="aa";
        String magazine = "aab";
        System.out.println(canConstruc(ransomeNote,magazine));
        String r2="a";
        String m2="b";
        System.out.println(canConstruc(r2,m2));
    }
    public static boolean canConstruc(String ransomeNote,String magazine){
        int[] inventory=new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            char current=magazine.charAt(i);
            inventory[current-'a']++;
        }
        for (int i = 0; i < ransomeNote.length(); i++) {
            char current=ransomeNote.charAt(i);
            inventory[current-'a']--;
            if(inventory[current-'a']<0){
                return false;
            }

        }
        return true;
    }
}
