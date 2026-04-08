import java.util.Arrays;
//Solved the leetcode problem 455.Assign Cookies
//https://leetcode.com/problems/assign-cookies/description/
public class AssignCookies {
    public static void main(String[] args) {
        int[] kid = {1, 2};
        int[] cookiee = {1, 2, 3};
        System.out.println(findContentChildren(kid, cookiee));
        int[] kid1 = {1, 2,3};
        int[] cookiee1 = {1, 3};
//        Custom inputs
        System.out.println(findContentChildren(kid1, cookiee1));

    }
    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int kid =0;
                int cookie=0;
        while (kid < g.length  && cookie< s.length){
            if(s[cookie]>=g[kid]){
                kid++;
            }
            cookie++;
        }
        return kid;
    }
}
