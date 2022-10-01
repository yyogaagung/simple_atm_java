package sampleatm;

import java.util.Scanner;

public class SimpleAtm {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SaldoView view = new SaldoView();
        CustomerController controller = new CustomerController(view);
        SingleObj obj = SingleObj.getInstance();
        
        System.out.print("Masukan norek: ");
        int accNo = input.nextInt();

        
        
        int chooseMenu;        
        do{
            System.out.println("=======SIMPLE ATM=========");
            System.out.println("(1) Cek Saldo");
            System.out.println("(2) Tarik Tunai");
            System.out.println("(3) Setor Tunai");
            System.out.println("(0) Keluar");

            System.out.print("Pilih Menu: ");
            chooseMenu = input.nextInt();

            switch (chooseMenu) {
                case 1 -> controller.saldoView(accNo);
                case 2 -> controller.withdrawCash(accNo,50000);
                case 3 -> controller.depositCash(accNo,50000);
                case 0 -> System.out.println("Tarimakasih");
                default -> System.out.println("Menu anda tidak tersedia");
            }      
           
            }while(chooseMenu !=0);   
    

}
  
}
