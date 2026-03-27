public class App {

    // Reward calculation logic
    public static double calculateReward(double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Invalid transaction");
        }

        if (amount >= 100) {
            return amount * 0.10; // 10% reward
        } else {
            return amount * 0.02; // 2% reward
        }
    }

    public static void main(String[] args) {
        System.out.println("Digital Wallet Reward System Running...");
    }
}