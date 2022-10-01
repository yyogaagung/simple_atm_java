package sampleatm;

import java.util.List;

public class SaldoView {
    void printSaldoCustomer(Customer cs){
            System.out.println("Nomor Rekening\t: "+ cs.getAcctNo());
            System.out.println("Saldo\t\t: " + cs.getBalance());
        System.out.println("");
     }
}
