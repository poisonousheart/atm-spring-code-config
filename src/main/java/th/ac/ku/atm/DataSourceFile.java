package th.ac.ku.atm;

import java.util.HashMap;
import java.util.Map;

public class DataSourceFile implements DataSource{
    public Map<Integer, Customer> readCustomer(){
        Map<Integer, Customer> customers = new HashMap<>();

        customers.put(1, new Customer(1, "Kwan", 1234, 1000));
        customers.put(2, new Customer(2, "Ploy", 2345, 2000));
        customers.put(3, new Customer(3, "Fon", 3456, 3000));
        return customers;
    }
}
