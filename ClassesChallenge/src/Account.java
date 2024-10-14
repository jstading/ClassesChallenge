public class Account {

    private int acctNumber = 1234567890;
    private double acctBalance = 420.69;
    private String custName = "John Smith";
    private String custEmail = "jsmith@devsquatch.com";
    private String custPhone = "402-333-4970";

    public int getAcctNumber() {
        return acctNumber;
    }

    public double getAcctBalance() {
        return acctBalance;
    }

    public String getCustName() {
        return custName;
    }

    public String getCustEmail() {
        return custEmail;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setAcctNumber(int acctNumber){
        this.acctNumber = acctNumber;
    }

    public void setAcctBalance(double acctBalance) {
        this.acctBalance = acctBalance;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setCustEmail(String custEmail) {
        this.custEmail = custEmail;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public void deposit(double depositAmt){
        this.acctBalance = acctBalance + depositAmt;
    }

    public void withdrawal(double withdrawAmt){
        if (acctBalance - withdrawAmt < 0){
            System.out.println("Cannot withdraw $" + withdrawAmt + ", Insufficient Funds");
        } else {
            this.acctBalance = acctBalance - withdrawAmt;
        }
    }

}
