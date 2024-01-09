public class Account {
   private String numberAccount;
   private double currentBalance;

   private double[] depositAmounts;

    public Account(String numberAccount, double currentBalance) {
        this.numberAccount = numberAccount;
        this.currentBalance = currentBalance;
        this.depositAmounts = new double[0];
    }

    public String getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(String numberAccount) {
        this.numberAccount = numberAccount;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public double[] getDepositAmounts() {
        return depositAmounts;
    }

    public void setDepositAmounts(double[] depositAmounts) {
        this.depositAmounts = depositAmounts;
    }

    public void replenishBalance(double summa){
       this.currentBalance += summa;
       double[] newArray = new double[this.depositAmounts.length + 1];
          for (int i = 0; i < this.depositAmounts.length; i++) {
             newArray[i] = this.depositAmounts[i];
          }
          newArray[this.depositAmounts.length] = summa;
          this.depositAmounts = newArray;

    }

    public void withdrawFunds(double summa){
        if (summa > this.currentBalance) {
            System.out.println("Сумма списания превышает баланс счета");
        }else{this.currentBalance -= summa;}
    }

    public void clearHist(){
        if (this.depositAmounts.length > 0) {
            double[] newArray = new double[0];
            this.depositAmounts = newArray;
        }
    }

    public double getMaxDeposit(){
        if (this.depositAmounts.length > 0) {
           double result = depositAmounts[0];
           for (int i=0; i < depositAmounts.length; i++){
              if (depositAmounts[i] > result) {
                  result = depositAmounts[i];
              }
           }
            return result;
        }else {return -1;}
    }

    public double getMinDeposit(){
        if (this.depositAmounts.length > 0) {
            double result = depositAmounts[0];
            for (int i=0; i < depositAmounts.length; i++){
                if (depositAmounts[i] < result) {
                    result = depositAmounts[i];
                }
            }
            return result;
        }else {return -1;}
    }

}
