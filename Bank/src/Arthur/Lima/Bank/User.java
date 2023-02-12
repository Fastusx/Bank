package Arthur.Lima.Bank;

import java.util.List;
import java.util.Random;


public class User{;
private static final int MAX_LENGTH = 12;

List<User> users;
private String name;
private double balance;
private String cc;
private String ag;
private Random id = new Random();
private int valor = id.nextInt(1000,9999);

private Status rep; 

public User(String ag,String name, String cc, int valor){
this.ag = ag;
this.cc = cc;    
this.valor = valor;
setName(name);

rep = new Status(); 
  
}

    public void setName(String name){
    if(name.length() > MAX_LENGTH){
        this.name = name.substring(0, MAX_LENGTH); 
    }else{
        this.name = name;
    }   System.out.println(this.name);    
}
    public String getName(){
    return name;
        }
    public Boolean withDraw(Double value){
        if(balance < value){
            return false;
        }
            balance -= value;
            rep.inf("Houve um saque de " + value + ", agora a sua conta contém R$" + balance);
            return true;
        
        
    }
    public void deposite(Double value){
        balance += value;
        rep.inf("Houve um depósito de " + value + ", agora a sua conta contém R$" + balance);
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getAg() {
        return ag;
    }

    public void setAg(String ag) {
        this.ag = ag;
    }
    
    
    @Override
    public String toString() {
        String result = "A conta " + this.name + " " + this.ag + " / " + this.cc + " possui: R$" + balance;
        return result;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    
    }
}


    


