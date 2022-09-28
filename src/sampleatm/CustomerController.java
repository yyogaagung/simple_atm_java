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
   
    public void saldoView(String accNo, String pin){
           view.printSaldoCustomer(model.getCustomer(accNo, pin));              
    }
   
    public void withdrawCash(String accNo, String pin, int amount){ 
        List<Customer> cs = model.getCustomer(accNo, pin);
        for(Customer i : cs){
            if(amount % 50000 != 0){
                System.out.println("ATM hanya melayani Tarik Tunai Kelipatan 50.000");
            }else if (i.getBalance() >= amount && i.getBalance() >= 100000 && amount % 50000 == 0){
                i.setBalance(i.getBalance()- amount); 
                System.out.println("Tarik Tunai berhasil.");
            }else {
                System.out.println("Tarik Tunai Gagal, Saldo anda sudah 100.000"); 
            }
        }

    }
        
    public void depositCash(String accNo, String pin, int amount){
        List<Customer> cs = model.getCustomer(accNo, pin);
        for(Customer i : cs){
            if (amount > 0 && amount % 50000 == 0){ 
            i.setBalance(i.getBalance()+ amount); 
            System.out.println("Setor Tunai Berhasil. Saldo Kamu: ");
            }else{
            System.out.println("Setor Tunai Gagal, ATM hanya melayani Setor Tunai Kelipatan 50.000"); 
            }
        }

    }
}
