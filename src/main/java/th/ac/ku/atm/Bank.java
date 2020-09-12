package th.ac.ku.atm;

import java.util.Map;

public class Bank {
    private String name;
    private Map<Integer,Customer> customers;
    private DataSource dataSource;

    public Bank(String name, DataSource dataSource) {
        this.name = name;
        this.dataSource = dataSource;
        this.customers = dataSource.readCustomer();
    }

    public void registerCustomer(Customer customer){
        customers.put(customer.getId(), customer);
    }

    public Customer findCustomer(int id){
        return customers.get(id);
    }

    public String getName() {
        return name;
    }
}
