public class Main {

    public static void main(String[] args){

        Account account = new Account();
        account.setAcctBalance(500);

        double withdrawAmt = 600;
        double depositAmt = 100;

        System.out.println("Account Number: " + account.getAcctNumber());
        System.out.println("Account Balance: $" + account.getAcctBalance());
        System.out.println("Customer Name: " + account.getCustName());
        System.out.println("Customer E-Mail: " + account.getCustEmail());
        System.out.println("Customer Phone: " + account.getCustPhone());
        System.out.println();

        account.withdrawal(withdrawAmt);

        System.out.println("Account Balance: $" + account.getAcctBalance());
        System.out.println();

        account.deposit(depositAmt);
        System.out.println("Account Balance: $" + account.getAcctBalance());
    }

}
