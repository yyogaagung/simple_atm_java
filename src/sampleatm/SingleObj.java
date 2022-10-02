package sampleatm;

public class SingleObj { 
   private static SingleObj session;
   private boolean status = false;
   
   private SingleObj(){}
   
   public static SingleObj getInstance() {
        if (session == null) {
            session = new SingleObj();
        }
        return session;
    }
   
   public void setStatus(){
       status = !status;
   }
   
   public boolean getStatus(){
       return status;
   }
}
