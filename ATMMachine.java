import java.util.Scanner;
class Account{
  Scanner sc = new Scanner(System.in);
  

  public void UserAccount(String name,int accountno ,int password,double balance){
   
    System.out.println("Enter your bank account last digit");
   int d =sc.nextInt();

   System.out.println("Enter your Password");
    int e= sc.nextInt();
    int a;
  if(d==accountno && e==password){
   do{
    System.out.println("1.Check Balance\n 2.Deposit \n 3.Withdraw \n 4.Exit ");
   a= sc.nextInt();
   
   switch (a) {
    case 1:
      System.out.println("Your Balance is Rs."+balance);
  break;

    case 2:

      System.out.println("Enter amount to deposit:");
      double b = sc.nextDouble();
      balance= balance+b;
      System.out.println("your balance is Rs.:"+balance);
      break;
    
    case 3:

      System.out.println("Enter anout to withdraw");
      double c = sc.nextDouble();
      if(c<+balance){
        balance=balance-c;
        System.out.println("Withdraw successful, total remaining amount is Rs.:" + balance);
      }else{
        System.out.println("The amount you entered is not valid try again");
      }
      break;
    case 4:
    
      System.out.println("Thank you!! ");
      ;break;
     
      default:
      System.out.println("Enter a valid choice");
      break;  
     }
    }while (a!= 4);
   
  
  }else{System.out.println("Enter a valid account no or the password");}
}


public class ATMMachine{
  public static void main(String[] args) { 
    Account account1 = new Account();
    account1.UserAccount("Akash", 2354, 1265, 6000);
    
  }
}}