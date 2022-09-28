package sampleatm;

public class Customer {
    private String acctNo;
    private String PIN;
    private double balance;

    public Customer(String acctNo, String PIN, double balance) {
        this.acctNo = acctNo;
        this.PIN = PIN;
        this.balance = balance;
    }

    public String getAcctNo() {
        return acctNo;
    }
    public void setAcctNo(String acctNo) {
        this.acctNo = acctNo;
    }
    public String getPIN() {
        return PIN;
    }
    public void setPIN(String PIN) {
        this.PIN = PIN;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
