package Arthur.Lima.Bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<User> usuarios;
    private String ag;
    private int lastAccount = 1;
    private int id;
    

    public Bank(String ag){
       this.ag = ag;
       this.usuarios = new ArrayList<>(); 
    }
    public List<User> getUsers(){
        return usuarios;
    }
    public User createAccount(String nome, int id){
        
        User account = new User(ag, nome, " " + lastAccount, id);
        lastAccount++;
        account.setValor(id);
        System.out.println("O seu ID é: " + account.getValor());
        return account;

    }
    public void insertAccount(User account){
        usuarios.add(account);
    }
    public void randomId(int id){
        this.id = id;
        
    }
    public int getId(){
        return id;
    }
}
