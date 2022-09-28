package sampleatm;

import java.util.ArrayList;
import java.util.List;

public class CustomerDaoimpl implements CustomerDao{
    List<Customer> customers  = null;
    List<Customer> cus  = null;
    
    public CustomerDaoimpl() {
        customers = new ArrayList<Customer>();
        customers.add(new Customer("1", "123", 500000));
        customers.add(new Customer("2", "123", 600000));
        customers.add(new Customer("3", "123", 500000));
    } 

    @Override
    public List<Customer> getAllCustomer() {
        return customers;
    }

    @Override
    public List<Customer> getCustomer(String accNo, String pin) {
        cus = new ArrayList<Customer>();
        for(Customer i : customers){
            if(i.getAcctNo() == accNo && i.getPIN() == pin){
                cus.add(i);
            }
        }
        return cus;
    }

 


  


   

}
