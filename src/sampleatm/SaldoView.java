package sampleatm;

import java.util.List;

public class SaldoView {
    void printSaldoCustomer(List<Customer> cs){
        for(Customer i : cs){
            System.out.println(i.getAcctNo());
            System.out.println(i.getBalance());
        }
     }
}
