package sampleatm;

import java.util.List;

public class CustomerController {
    CustomerDao model;
    private SaldoView view ;
    List<Customer> customer;

    public CustomerController(SaldoView view) {
        model = new CustomerDaoimpl();
        this.view = view;
        customer = model.getAllCustomer();
    }
   
    public void saldoView(int accNo){
           view.printSaldoCustomer(model.getCustomer(accNo));              
    }
   
    public void withdrawCash(int accNo, double amount){ 
        Customer cs = model.getCustomer(accNo);
            if(amount % 50000 != 0){
                System.out.println("ATM hanya melayani Tarik Tunai Kelipatan 50.000");
            }else if (cs.getBalance() >= amount && cs.getBalance() >= 100000 && amount % 50000 == 0){
                cs.setBalance(cs.getBalance()- amount); 
                System.out.println("Tarik Tunai berhasil.");
            }else {
                System.out.println("Tarik Tunai Gagal, Saldo anda sudah 100.000"); 
            }

    }
        
    public void depositCash(int accNo, double amount){
        Customer cs = model.getCustomer(accNo);
            if (amount > 0 && amount % 50000 == 0){ 
            cs.setBalance(cs.getBalance()+ amount); 
            System.out.println("Setor Tunai Berhasil. Saldo Kamu: ");
            }else{
            System.out.println("Setor Tunai Gagal, ATM hanya melayani Setor Tunai Kelipatan 50.000"); 
            }
        

    }
}
