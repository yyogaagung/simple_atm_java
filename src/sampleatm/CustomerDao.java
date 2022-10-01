
package sampleatm;

import java.util.List;

public interface CustomerDao {
    public List<Customer> getAllCustomer();
    public Customer getCustomer(int accNo);
//    public void updateCustomer(Customer cus);
//    public void deleteCustomer(String accNo);
}
