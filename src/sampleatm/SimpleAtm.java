package sampleatm;

import java.util.Scanner;

public class SimpleAtm {
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SaldoView view = new SaldoView();
        CustomerController controller = new CustomerController(view);
        
        int chooseMenu = 0;        
        do{
            System.out.println("=======SIMPLE ATM=========");
            System.out.println("(1) Cek Saldo");
            System.out.println("(2) Tarik Tunai");
            System.out.println("(3) Setor Tunai");
            System.out.println("(0) Keluar");

            System.out.print("Pilih Menu: ");
            chooseMenu = input.nextInt();

            switch (chooseMenu) {
                case 1:                       
                    controller.saldoView("2", "123");
                    break;
                case 2:
                    controller.withdrawCash("2","123",50000);
                    break;
                case 3 :
                    controller.depositCash("2","123",50000);
                    break;
                case 0 :
                    System.out.println("Tarimakasih");
                    break;
                default:
                    System.out.println("Menu anda tidak tersedia");
            }      
           
            }while(chooseMenu !=0);   
    

}
  
}
