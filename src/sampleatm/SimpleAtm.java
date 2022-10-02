package sampleatm;

import java.util.Scanner;

public class SimpleAtm {

   
   private SimpleAtm(){}
 
   
   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SaldoView view = new SaldoView();
        CustomerController controller = new CustomerController(view);
        int accNo, chooseMenu;        
        System.out.print("Masukan Kartu: ");
        accNo = input.nextInt();
        SingleObj singleObj = SingleObj.getInstance();
        singleObj.setStatus();
        
            do{
                System.out.println("=======SIMPLE ATM=========");
                if(!singleObj.getStatus()){                    
                System.out.println("(1) Masukan Kartu");
                }
                System.out.println("(2) Cek Saldo");
                System.out.println("(3) Tarik Tunai");
                System.out.println("(4) Setor Tunai");
                System.out.println("(5) Ambil Kartu");
                System.out.println("(0) Keluar Progran");

                System.out.print("Pilih Menu: ");
                chooseMenu = input.nextInt();

                switch (chooseMenu) {
                    case 1 : 
                        if(!singleObj.getStatus()){
                        System.out.print("Masukan Kartu: ");
                        accNo = input.nextInt();
                        singleObj.setStatus();
                        }else{
                            System.out.println("Menu tidak tersedia");
                        }
                        break;
                    case 2 : controller.saldoView(accNo); break;
                    case 3 : 
                        System.out.print("Nominal Tarik Tunai: ");
                        double chooseTarikTunai = input.nextDouble();
                        controller.withdrawCash(accNo,chooseTarikTunai);break;
                    case 4 : 
                        System.out.print("Nominal Setor Tunai: ");
                        double chooseSetorTunai = input.nextDouble();
                        controller.depositCash(accNo, chooseSetorTunai); break;
                    case 5 : singleObj.setStatus(); break;
                    case 0 : System.out.println("Terimakasi telah menggunakan layanan kami");
                    default : System.out.println("Menu tidak tersedia");break;
            }      
           
            }while(chooseMenu != 0);  
       }
               
 
    

}
  

