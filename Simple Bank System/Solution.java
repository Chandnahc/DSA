class Bank {
    private long[] accounts;
    private int totalAccounts;
    public Bank(long[] balance) {
        this.totalAccounts = balance.length;
        this.accounts = new long[this.totalAccounts];
        for(int i=0;i<totalAccounts;i++){
            this.accounts[i] = balance[i];
        }
    }
    
    public boolean transfer(int account1, int account2, long money) {
        if(account1>totalAccounts || account1<=0 || account2>totalAccounts || account2<=0){
            return false;
        }
        long balance = this.accounts[account1-1];
        if(balance<money){
            return false;
        }else{
            this.accounts[account1-1] -= money;
            this.accounts[account2-1] += money;
            return true;
        }
    }
    
    public boolean deposit(int account, long money) {
        if(account>totalAccounts || account<=0){
            return false;
        }
        this.accounts[account-1] += money;
        return true;
    }
    
    public boolean withdraw(int account, long money) {
        if(account>totalAccounts || account<=0){
            return false;
        }
        long balance = this.accounts[account-1];
        if(balance<money){
            return false;
        }else{
            this.accounts[account-1] -= money;
            return true;
        }
    }
}

/**
 * Your Bank object will be instantiated and called as such:
 * Bank obj = new Bank(balance);
 * boolean param_1 = obj.transfer(account1,account2,money);
 * boolean param_2 = obj.deposit(account,money);
 * boolean param_3 = obj.withdraw(account,money);
 */