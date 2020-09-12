package th.ac.ku.atm;

public class ATM {
    private Bank bank;
    private Customer loginCustomer;

    public ATM(Bank bank) {
        this.bank = bank;
        loginCustomer = null;
    }

    public String validateCustomer(int id, int pin){
        //check if such id exists in the bank or not
        Customer customer = bank.findCustomer(id);

        //check if pin is correct
        if(customer != null && customer.checkPin(pin)){
            loginCustomer = customer;
            return customer.getName();
        }
        return null;
    }

    //delegation
    public void deposit(double amount){
        loginCustomer.getAccount().deposit(amount);
    }

    public void withdraw(double amount){
        loginCustomer.getAccount().withdraw(amount);
    }

    public double getBalance(){
        return loginCustomer.getAccount().getBalance();
    }

    public void transfer(int receivingId, double amount){
        Customer receivingCustomer = bank.findCustomer(receivingId);
        loginCustomer.getAccount().withdraw(amount);
        receivingCustomer.getAccount().deposit(amount);
    }

    public void end(){
        loginCustomer = null;
    }


}
