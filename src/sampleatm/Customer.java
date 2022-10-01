package sampleatm;

public class Customer {
    private int acctNo;
    private  int PIN;
    private double balance;

    public Customer(int acctNo, int PIN, double balance) {
        this.acctNo = acctNo;
        this.PIN = PIN;
        this.balance = balance;
    }

    public int getAcctNo() {
        return acctNo;
    }
    public void setAcctNo(int acctNo) {
        this.acctNo = acctNo;
    }
    public int getPIN() {
        return PIN;
    }
    public void setPIN(int PIN) {
        this.PIN = PIN;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
