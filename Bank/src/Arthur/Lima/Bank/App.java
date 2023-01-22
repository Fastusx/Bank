package Arthur.Lima.Bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App {
    public static void main(String[] args){
        
        User usuarioLogado = null;
        Scanner scannerA = new Scanner(System.in);
        Scanner scannerB = new Scanner(System.in);
        Scanner scannerC = new Scanner(System.in);
        
        int opt = 0;
        int total = 10000;
           
         List<User> usuarios = new ArrayList<>();
            
            while(opt != 4)
            {
            System.out.println("Qual o seu objetivo?");
            System.out.println("1 - Ver o saldo total da conta");
            System.out.println("2 - depositar um valor");
            System.out.println("3 - Sacar um valor");
            System.out.println("4 - Finalizar programa");
            System.out.println("5 - Novo Usuário");
            System.out.println("6 - Trocar usuário");
            
            opt = scannerA.nextInt();
                if(opt == 1){
                System.out.println("O valor total de sua conta é de R$" + usuarioLogado.getTot() );
                opt = 0;
                }if(opt == 2){
                    System.out.println("Quanto você quer depositar?"); 
                    usuarioLogado.setEntry(scannerB.nextInt());
                       opt = 0;    
                }if(opt == 3){
                    System.out.println("Quanto você deseja sacar?");
                    usuarioLogado.setExit(scannerB.nextInt());
                    opt = 0;
                }if(opt == 4){
                    System.out.println("Programa finalizando em...");
                    System.out.println("3, 2, 1, 0...");
                    System.out.println("FIM!");
                    scannerA.close();
                    scannerB.close();
                    scannerC.close();
                    break;
                    
                }if(opt > 7){
                    System.out.println("Deu merda pai!!!");
                    opt = 0;
                }if(opt == 5){
                System.out.println("Qual o seu nome? "); 
                String nome = scannerC.nextLine();
                System.out.println("Qual o seu sobrenome? "); 
                String sobrenome = scannerC.nextLine();
                System.out.println("Digite uma senha"); 
                int pass = scannerC.nextInt();
                User usuarioCriacao = new User(nome, sobrenome, total, pass);
                usuarios.add(usuarioCriacao);
                System.out.println("Bem vindo(a) " + usuarioCriacao.nomeCompleto());
                usuarioLogado = usuarioCriacao;
                opt = 0;
                }if(opt == 6){
                    for (User userfor : usuarios) {
                        System.out.println("Nome: " + userfor.nomeCompleto() + " | Conta: " + userfor.conta);
                    }

                    System.out.println("Digite o numero da sua conta: "); 
                    int contaInfomada = scannerC.nextInt();
                    System.out.println("Digite sua Senha: "); 
                    int senhaInfomada = scannerC.nextInt();

                    for (User userfor : usuarios) {
                       if(userfor.getConta() == contaInfomada && userfor.pass == senhaInfomada){
                        usuarioLogado = userfor;
                       }else{
                        usuarioLogado = null;
                        
                       }
                    }
                        
            }   
           
            
        }
            
            

}
}
