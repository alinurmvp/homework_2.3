public class BankAccount {
    private double amount;
    String message;

    public double getAmount() {
        return amount;
    }

    public void deposit(double sum){
        amount += sum;

    }

    public void withDraw(double sum) throws LimitException {
        if (amount < sum) {
            throw new LimitException(message, amount );
        }
        amount -= sum;
    }
}