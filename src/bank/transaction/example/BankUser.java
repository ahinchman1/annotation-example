package bank.transaction.example;

public class BankUser {
    private String userName;
    private int userId;
    private double accountBalance;

    public BankUser(String userName, int userId, double accountBalance) {
        this.userName = userName;
        this.userId = userId;
        this.accountBalance = accountBalance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String name) {
        userName = name;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int id) {
      userId = id;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public double setAccountBalance(String transaction, double amount) throws UnsupportedOperationException{
        try {
            if (transaction == "Withdrawal") {
                accountBalance -= amount;
            }
            if (transaction == "Deposit") {
                accountBalance += amount;
            }
        } catch (UnsupportedOperationException e) {
            System.out.println("Transaction type not recognized: " + transaction);
        }
        return accountBalance;
    }


}
