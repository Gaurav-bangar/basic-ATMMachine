import java.util.Scanner;
class Account{
Scanner sc =new Scanner(System.in);

  private String name;
  private int accountNo;
  private int password;
  private double balance;
 
  public Account(String name, int accountNo,int password, double balance){
    this.name= name;
    this.accountNo = accountNo;
    this.password =password;
    this.balance=balance;

  }
  void showBalance(){
   System.out.println("Your current balance is Rs."+ balance);
  }
  
  void deposit(){
    System.out.print("Enter amount to deposit :Rs.");
    double amount = sc.nextDouble();
    if (amount<0){
    balance +=amount;
    System.out.println("Deposit Successful!!");
    showBalance();
    }else{
     System.out.println("Enter valid amount");
    }
    }
  void withdraw(){
    System.out.print("Enter Your amount to withdraw:Rs.");
    double amount = sc.nextDouble();
   
    if (amount<=balance){
      balance-=amount;
      System.out.println("Withdrawal Successful!!");
      showBalance();
    }else{
      System.out.println("You dont have enough balance to withdraw your given amount ");
    }
  }
 
  boolean login(int accNo, int pass){
    if(accountNo== accNo && password==pass){
      return true;

    }else{
      return false;
    }
    
      
    }
  }

  
  

public class ATMMachine {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Account account1 = new Account("Akash",2125,6534,6000);
    System.out.print("Enter your Account Number:");
    int accNo= sc.nextInt();
   
    System.out.print("Enter Your Password:");
    int pass = sc.nextInt();
   
    int a ;
   if (account1.login(accNo,pass)) {
    System.out.println("Login Successful");
    
   
    do{ 
     System.out.println("1. Check Balance \n 2. Deposit \n 3.Withdraw \n 4. Exit");

     a = sc.nextInt();
    
   
      switch (a) {
        case 1:
          account1.showBalance();
          break;
        case 2:
          account1.deposit();
          break;
        case 3:
          account1.withdraw();
          break;
        case 4:
          System.out.println(" Thank You!!");
          break;
        default:
          System.out.println("Enter valid credentials")
          break;
      }

    }while(a!=4);
  }else{
 System.out.println("Enter valid credentials");
  }
   
  }
}
