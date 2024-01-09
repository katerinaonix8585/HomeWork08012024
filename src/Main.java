public class Main {
    public static void main(String[] args) {
        Account account = new Account("3000 3000", 2500.56);
        System.out.println(account.getNumberAccount());
        System.out.println(account.getCurrentBalance());
        account.replenishBalance(155.44);
        System.out.println(account.getCurrentBalance());
        account.replenishBalance(255.44);
        System.out.println(account.getCurrentBalance());
        account.replenishBalance(355.44);
        System.out.println(account.getCurrentBalance());
        for (double elem: account.getDepositAmounts()) {
            System.out.println(elem);
        }
        account.clearHist();
        for (double elem: account.getDepositAmounts()) {
            System.out.println(elem);
        }
        account.replenishBalance(155.44);
        for (double elem: account.getDepositAmounts()) {
            System.out.println(elem);
        }
        System.out.println(account.getCurrentBalance());
        account.withdrawFunds(4000);
        System.out.println(account.getCurrentBalance());
        account.withdrawFunds(-400);
        System.out.println(account.getCurrentBalance());
        account.replenishBalance(255.44);
        System.out.println(account.getCurrentBalance());
        account.replenishBalance(355.44);
        System.out.println(account.getCurrentBalance());
        System.out.println(account.getMaxDeposit());
        System.out.println(account.getMinDeposit());



    }
}