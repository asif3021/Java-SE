package ATM;

public class CashDeposit extends Booth {

    CashDeposit(){

    }

    CashDeposit(int amount){
        balance = amount;
    }

    private void currentBalance(){
        System.out.println("Current balance: " + balance);
    }

    @Override
    void cashDeposit(int depositAmount) {
        balance = balance + depositAmount;
        currentBalance();
    }

    @Override
    void cashWithdraw(int amount) {
    }
}
