package Arthur.Lima.Bank;

import java.util.Random;

public class User{;
public String firstName;
public String lastName;
public int entry;
public int exit;
public int tot = 0;
public int pass;
public int conta;



public User(String firstName, String lastName, int tot,int pass){
    this.firstName = firstName;
    this.lastName = lastName;
    this.tot = tot;
    this.pass = pass;
    this.conta = new Random().nextInt(1000, 9999);

    
}
 
public  String nomeCompleto(){
    return firstName + " " + lastName;
}
public  void setTot(int t){
        tot = tot + t;
    }   
    public  void setEntry(int entry){
        tot = tot + entry;
}
    public  void setExit(int exit){
        tot = tot - exit;
}
    public int getEntry(){
        return entry;
}
    public int getExit(){
        return exit;
}
    public int getTot(){
        return tot;
    }
    public  String getfirstName(){
        return firstName.toUpperCase();
    }
    public  String getlastName(){
        return lastName.toUpperCase();
    }

    public Integer getPass() {
        return pass;
    }

    public void setPass(Integer pass) {
        this.pass = pass;
    }

    public Integer getConta() {
        return conta;
    }

    public void setConta(Integer conta) {
        this.conta = conta;
    };
    



}
