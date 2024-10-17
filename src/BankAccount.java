public class BankAccount
{
    private int accountNumber;
    private float balance;

    BankAccount(int accountNumber, float balance)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void addMoney(float money)
    {
        balance += money;
        System.out.println("Баланс: " + balance);
    }

    public void takeMoney(float money)
    {
        if(balance >= money)
        {
            balance -= money;
            System.out.println("Баланс: " + balance);
        }
        else
        {
            System.out.println("Недостаточно средств!");
        }
    }
}
