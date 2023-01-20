package Arthur.Lima.Bank;

import java.util.Scanner;

public class App {
    public static void main(String[] args){
        
       
        Scanner scannerA = new Scanner(System.in);
        Scanner scannerB = new Scanner(System.in);
       
            int opt = 0;
            int total = 10000;
            User.setTot(total);
            while(opt != 4){
            System.out.println("Qual o seu objetivo?");
            System.out.println("1 - Ver o saldo total da conta");
            System.out.println("2 - depositar um valor");
            System.out.println("3 - Sacar um valor");
            System.out.println("4 - Finalizar programa");
            opt = scannerA.nextInt();
                if(opt == 1){
                System.out.println("O valor total de sua conta é de R$" + User.tot + ",00 !" );
                opt = 0;
                }if(opt == 2){
                    System.out.println("Quanto você quer depositar?"); 
                    User.setEntry(scannerB.nextInt());
                    opt = 0;    
                }if(opt == 3){
                    System.out.println("Quanto você deseja sacar?");
                    User.setExit(scannerB.nextInt());
                    opt = 0;
                }if(opt == 4){
                    System.out.println("Programa finalizando em...");
                    System.out.println("3, 2, 1, 0");
                    System.out.println("FIM!");
                    scannerA.close();
                    scannerB.close();
                }if(opt > 4){
                    System.out.println("Deu merda pai!!!");
                    opt = 0;
                }
        
    }
    System.out.println("Acabou!");
}

}

