import java.util.*;

public class SBIAccont implements BankAccountInterface{
    private String name;
    private String accountNo;
    private String password;
    private double balance;
    final double rateOfInterest =7.2;
    final String IFSCCode = "SBI9318";

    public SBIAccont() {
    }

    public SBIAccont(String name, String password, double balance) {
        this.name = name;
        this.password = password;
        this.balance = balance;
        this.accountNo = String.valueOf(UUID.randomUUID());
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public String getIFSCCode() {
        return IFSCCode;
    }

    @Override
    public String fetchBalance(String password) {
        if(this.password.equals(password)){
            return "Your Balance is:" + balance;
        }
        return "Incorrect Password";
    }

    @Override
    public String addMoney(double amount) {
        this.balance += amount;
        return "Amount Added Succesfully. New Balance is: "+ balance;
    }

    @Override
    public String withdrawMoney(double amount, String password) {
        if(this.password.equals(password)){
            if(balance<amount){
                return "Insufficent Balance";
            }
            this.balance -= amount;
            return "Amount Deducted Sucessfull. New Balance is: "+ balance;
        }
        return "Incorrect Password";
    }

    @Override
    public String changePassword(String oldPassword, String newPassword) {
        if(this.password.equals(oldPassword)){
            this.setPassword(newPassword);
            return "Password changed succesfully";
        }
        return "Incorrect Password";
    }

    @Override
    public double calculateInterest(int year) {
        return (balance*year+rateOfInterest)/100.0;
    }

    @Override
    public String toString() {
        return "SBIAccont{" +
                "name='" + name + '\'' +
                ", accountNo='" + accountNo + '\'' +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                ", rateOfInterest=" + rateOfInterest +
                ", IFSCCode='" + IFSCCode + '\'' +
                '}';
    }
}
