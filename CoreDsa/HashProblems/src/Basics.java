import java.util.HashSet;

public class Basics {
    public static void main(String[] args) {
        HashSet<Integer> seennumber=new HashSet<>();
        seennumber.add(5);
        seennumber.add(10);
        System.out.println(seennumber);
        System.out.println("Contains 5:"+seennumber.contains(5));
        seennumber.remove(5);
        System.out.println(seennumber);
    }
}
