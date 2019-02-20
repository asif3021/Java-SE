package ATM;

public class CashWithdraw extends Booth{

    CashWithdraw(){

    }

    CashWithdraw(int amount){
        balance = amount;
    }

    void currentBalance(){
        System.out.println("Current balance: " + balance);
    }

    @Override
    void cashDeposit(int depositAmount) {
    }

    @Override
    void cashWithdraw(int withdrawAmount){
        balance = balance - withdrawAmount;
        this.currentBalance();
    }


}
