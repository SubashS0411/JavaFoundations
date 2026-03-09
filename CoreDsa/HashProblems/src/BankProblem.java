import java.util.HashMap;

public class BankProblem {
    public static void main(String[] args) {
        HashMap<String, Integer> bankBalance = new HashMap<>();

// Put data in:
        bankBalance.put("John", 5000);

// Get data out (O(1) time):
        int money = bankBalance.get("John"); // Returns 5000
        System.out.println(money);
// The "Lifesaver" Method (getOrDefault):
// "Give me Alice's balance. If Alice doesn't exist, return 0."
        int aliceMoney = bankBalance.getOrDefault("Alice", 0);
        System.out.println(bankBalance);
        System.out.println(aliceMoney);
    }
}
