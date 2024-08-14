import java.util.Scanner;
 class ATM {
        float balance;
        Scanner sc = new Scanner(System.in);
        int pswd = sc.nextInt();

        public  void Verify_PIN(){
            System.out.println("Enter your ATM PIN again");
            int PIN = sc.nextInt();
            if(pswd==PIN){
                menu();
            }
            else{
                System.out.println("You Entered the wrong PIN");
                Verify_PIN();
            }
        }
        public void menu(){
            System.out.println("Select your Option");
            System.out.println("1.Check Account Balance");
            System.out.println("2.deposit Money");
            System.out.println("3.Withdraw Money");
            System.out.println("4.Exit");

            Scanner x = new Scanner(System.in);
            System.out.println("Enter you choice from above options");
            int choice = x.nextInt();

            if(choice==1){
                checkBalance();
            }
            else if(choice==2){
                  depositMoney();
            }
            else if(choice==3){
                withdrawlMoney();
            }
            else if(choice==4){
                System.out.println("EXIT");
                return;
            }
            else{
                System.out.println("Try entering correct choice");
            }
           
        }

        public void checkBalance(){
            System.out.println("Your balance is: " +balance);
            menu();
        }
        public void withdrawlMoney(){
            System.out.println("Enter the amount you want to withdraw");
            int Amount = sc.nextInt();
            if(Amount>balance){
                System.out.println("Balance is insufficient");
                menu();
            }
            else{
                balance=balance-Amount;
                System.out.println(+Amount+ " Debited Successfully ");
                menu();
            }
        }
        public void depositMoney(){
            System.out.println("Enter the amount you want to deposit");
            int amount = sc.nextInt();
            balance = balance+amount;
            System.out.println(amount+ " deposited successfully ");
        }
    }
         public class ATM_Interface{
            public static void main(String[] args) {
                ATM object = new ATM();
                object.Verify_PIN();
            }
        }
    

