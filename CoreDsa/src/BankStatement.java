class BankStatement {
    int[] prefixSum;

    // Constructor: We build the prefix sum array upfront
    public BankStatement(int[] deposits) {
        prefixSum = new int[deposits.length];

        // The first day's total is just the first deposit
        prefixSum[0] = deposits[0];

        // Build the rest of the running totals
        for (int i = 1; i < deposits.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + deposits[i];
        }
    }

    // Method to answer queries instantly in O(1) time
    public int getDepositsBetweenDays(int leftDay, int rightDay) {
        if (leftDay == 0) {
            return prefixSum[rightDay];
        }
        // Magic formula: Prefix[R] - Prefix[L-1]
        return prefixSum[rightDay] - prefixSum[leftDay - 1];
    }

    public static void main(String[] args) {
        int[] dailyDeposits = {100, 200, 50, 300, 150, 500, 100};

        // Initialize the bank app (Takes O(N) time once)
        BankStatement app = new BankStatement(dailyDeposits);

        // Customer queries (Takes O(1) time!)
        int tuesToFri = app.getDepositsBetweenDays(1, 4);
        System.out.println("Deposits from Tuesday to Friday: Rs " + tuesToFri); // Output: 700
    }
}