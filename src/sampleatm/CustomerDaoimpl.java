package sampleatm;

import java.util.ArrayList;
import java.util.List;

public class CustomerDaoimpl implements CustomerDao{
    List<Customer> customers;
    Customer cs;
    
    public CustomerDaoimpl() {
        customers = new ArrayList<Customer>();
        customers.add(new Customer(0, 500000));
        customers.add(new Customer(1, 600000));
        customers.add(new Customer(2, 500000));
    } 

    @Override
    public List<Customer> getAllCustomer() {
        return customers;
    }

    @Override
    public Customer getCustomer(int accNo) {
        return customers.get(accNo);
    }



 


  


   

}
