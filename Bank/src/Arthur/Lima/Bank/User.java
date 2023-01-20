package Arthur.Lima.Bank;

public class User{;
public static int entry;
public static int exit;
public static int tot = 0;



 public static void setTot(int t){
        tot = tot + t;
    }   
    public static void setEntry(int entry){
        tot = tot + entry;
}
    public static void setExit(int exit){
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





}