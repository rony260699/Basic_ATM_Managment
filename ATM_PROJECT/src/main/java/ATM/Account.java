package ATM;


import java.text.DecimalFormat;
import java.util.Scanner;

public class Account {
    Scanner input = new Scanner(System.in);
    DecimalFormat moneyFormat = new DecimalFormat("'$'###,##0.00");
    
    //set the customer number
    
    public int setCustomerNumber(int customerNumber){
        this.customerNumber = customerNumber;
        return customerNumber;
    }
    
    //get the customer number
    
    public int getCustomerNumber(){
        return customerNumber;
    }
    
    //set pin number
    
    public int setPinNumber(int pinNumber){
        this.pinNumber = pinNumber;
        return pinNumber;
    }
    
    //get pin number
    public int getPinNumber(){
        return pinNumber;
    }
    
    // get Checking Account balance
    
    public double getCheckingBalance() {
        return checkingBalance;
    }
    
    //get Saving Account Balance
    
    public double getSavingBalance(){
        return savingBalance;
    }
    
    //calculate Checking Account withdrawal
    
    public double calcCheckingWithdraw(double amount){
        checkingBalance = (checkingBalance - amount);
        return checkingBalance;
    }
    //calculate Saving account withdrawal
    
    public double calcSavingWithdraw(double amount){
        savingBalance = (savingBalance - amount);
        return savingBalance;
    }
    // calculate checking account deposit
    
    public double calcCheckingDeposit(double amount){
        checkingBalance = (checkingBalance + amount);
        return checkingBalance;
    }
    
    // calculate saving account deposit
    
    public double calcSavingDeposit(double amount){
        savingBalance = (savingBalance  + amount);
        return savingBalance;
    }
    // customer cheking account withdraw input 
    
    public void getCheckingWithdrawInput(){
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to withdraw from Checking Account: ");
        double amount = input.nextDouble();
        
        if ((checkingBalance - amount) >= 0) {
            calcCheckingWithdraw(amount);
            System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
            
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }
    
    //customer saving Account withdraw input
    
    public void getSavingWithdrawInput(){
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to withdraw from Saving Account: ");
        double amount = input.nextDouble();
        
        if ((savingBalance - amount) >= 0){
            calcSavingWithdraw(amount);
            System.out.println("New Saving Account Balance: " + savingBalance + "\n");
            
        } 
        else {
            System.out.println("Balance cannot be negative." + "\n");
        }
    }
    
    //customer checking account deposit input
    
    public void getCheckingDepositInput(){
        System.out.println("Checking Account Balance: " + moneyFormat.format(checkingBalance));
        System.out.println("Amount you want to deposit from Checking Account: ");
        double amount = input.nextDouble();
        
        if ((checkingBalance + amount) >= 0) {
            calcCheckingDeposit(amount);
            System.out.println("New Checking Account Balance: " + moneyFormat.format(checkingBalance));
            
        } else {
            System.out.println("Balance cannot be negative" + "\n");
        }
        
    }
    //Customer Saving Account Deposit input
    
    public void getSavingDepositInput(){
        System.out.println("Saving Account Balance: " + moneyFormat.format(savingBalance));
        System.out.println("Amount you want to deposit from Saving Acount: ");
        double amount = input.nextDouble();
        
        if((savingBalance + amount) >= 0){
            calcSavingDeposit(amount);
            System.out.println("New Saving Account Balance: " + moneyFormat.format(savingBalance));
        } else{
          System.out.println("Balance cannot be negative" + "\n");
        }
    }
    private int customerNumber;
    private int pinNumber;
    private double checkingBalance = 0;
    private double savingBalance = 0;

}