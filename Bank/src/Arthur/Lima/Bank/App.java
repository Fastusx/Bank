package Arthur.Lima.Bank;

import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class App {
    public static void main(String[] args){
        Scanner scannerA = new Scanner(System.in);
        Scanner scannerB = new Scanner(System.in);
        Scanner scannerC = new Scanner(System.in);
        Bank santander = new Bank("0001");

        while(true){
            System.out.println("I - Entrar em uma conta");
            System.out.println("C - Criar uma conta");
            System.out.println("E - Sair");
            String opc = scannerA.nextLine().toUpperCase();
            if(opc.equals("I")){
                List<User> accountList = santander.getUsers();
                System.out.println("Escolha com base no número da conta: ");
                for(User cc :accountList ){
                    System.out.println(cc);
                    }    
                    int opt = scannerB.nextInt() - 1;
                    
                        int i = opt;
                        if(opt <= accountList.size()){
                            if(accountList.contains(accountList.get(i))){
                                System.out.println("Usuário encontrado!");
                                System.out.print("ID: ");
                                int pass = scannerC.nextInt();
                                if (pass == accountList.get(i).getValor()){
                                    System.out.println("Acesso concedido");  
                                    operate(accountList.get(i));
                                }else{
                                    System.out.println("Senha inválida!");
                                }
                            }
                        
                        }else{
                            System.out.println("Essa conta não existe!");
                        }   
                    
        }            
           else if(opc.equals("C")){
                System.out.println("Digite o seu nome:");
                String nome = scannerA.nextLine();
                if(nome.trim().isEmpty()){
                    System.out.println("Nada foi informado, tente de novo!");
                    }else{
                        Random num = new Random();
                        int valor = num.nextInt(1000,9999);
                        santander.randomId(valor);
                        User account = santander.createAccount(nome, valor);
                        santander.insertAccount(account);
                        operate(account);
                }
            
            }else if(opc.equals("E")){
                break;
            
            }else{
                System.out.println("Opção Inválida, tente novamente! ");
        }
        }
}
          
        public static void operate(User accountList){
        Scanner scannerD = new Scanner(System.in);
        while(true){
            System.out.println("Escolha uma ação: ");
            System.out.println("D - Depositar");
            System.out.println("S - Sacar");
            System.out.println("E - Sair da conta atual");      
            String opc = scannerD.nextLine().toUpperCase();
        
        if(opc.equals("D")){
            System.out.println("Quanto você deseja depositar?");
            accountList.deposite(scannerD.nextDouble());
        }if(opc.equals("S")){
            System.out.println("Quanto você deseja sacar?");
            boolean certo = accountList.withDraw(scannerD.nextDouble());
            if(!certo){
                System.out.println("Você não possui esta quantia de saldo!");
            }
          
        }if(opc.equals("E")){
            break;
        }
        
      } 
    } 
}



