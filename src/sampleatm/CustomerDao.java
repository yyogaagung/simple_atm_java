
package sampleatm;

import java.util.List;

public interface CustomerDao {
    public List<Customer> getAllCustomer();
    public Customer getCustomer(int accNo);
}
