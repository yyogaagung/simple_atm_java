package sampleatm;

public class Customer {
    private int acctNo;
    private double balance;

    public Customer(int acctNo, double balance) {
        this.acctNo = acctNo;
        this.balance = balance;
    }

    public int getAcctNo() {
        return acctNo;
    }
    public void setAcctNo(int acctNo) {
        this.acctNo = acctNo;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
