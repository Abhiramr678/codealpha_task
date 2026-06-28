import java.util.Scanner;

public class StockTradingPlatform {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String stockName = "TCS";
        double stockPrice = 3500.0;

        double balance = 100000.0;
        int sharesOwned = 0;

        int choice;

        do {
            System.out.println("\n===== STOCK TRADING PLATFORM =====");
            System.out.println("1. View Stock");
            System.out.println("2. Buy Stock");
            System.out.println("3. Sell Stock");
            System.out.println("4. View Portfolio");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("\nStock: " + stockName);
                    System.out.println("Price: ₹" + stockPrice);
                    break;

                case 2:
                    System.out.print("Enter quantity to buy: ");
                    int buyQty = sc.nextInt();

                    double buyCost = buyQty * stockPrice;

                    if (buyCost <= balance) {
                        balance -= buyCost;
                        sharesOwned += buyQty;
                        System.out.println("Stock purchased successfully!");
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;

                case 3:
                    System.out.print("Enter quantity to sell: ");
                    int sellQty = sc.nextInt();

                    if (sellQty <= sharesOwned) {
                        balance += sellQty * stockPrice;
                        sharesOwned -= sellQty;
                        System.out.println("Stock sold successfully!");
                    } else {
                        System.out.println("Not enough shares!");
                    }
                    break;

                case 4:
                    System.out.println("\n===== PORTFOLIO =====");
                    System.out.println("Balance: ₹" + balance);
                    System.out.println("Shares Owned: " + sharesOwned);
                    System.out.println("Portfolio Value: ₹" + (sharesOwned * stockPrice));
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}