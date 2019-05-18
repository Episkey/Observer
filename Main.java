public class Main {

    public static void main(String[] args) {

        Transactions.withdraw(1000, 100, new TransactionListener() {
            public void onComplete(Bank account) {
                System.out.printf("Your balance is: %d%n", account.getTotal());
            }
        });
    }
}
