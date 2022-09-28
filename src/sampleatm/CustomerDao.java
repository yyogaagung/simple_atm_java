
package sampleatm;

import java.util.List;

public interface CustomerDao {
    public List<Customer> getAllCustomer();
    public List<Customer> getCustomer(String accNo, String pin);
//    public void updateCustomer(Customer cus);
//    public void deleteCustomer(String accNo);
}
