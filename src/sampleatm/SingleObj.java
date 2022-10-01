package sampleatm;

import java.util.ArrayList;
import java.util.List;

public class SingleObj {
        private static SingleObj instance = new SingleObj();
        CustomerDao model = new CustomerDaoimpl();
        
        private SingleObj(){}
            
        public static SingleObj getInstance(){
            return instance;
        }
        
    public Customer customer(int accNo){ 
        Customer cs = model.getCustomer(accNo);
        return cs;
    }
}
