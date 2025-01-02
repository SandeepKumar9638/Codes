package threads;

// Banking project demonstrating how Synchronized threads works 
public class SynchronizedExample {
    private static int balance = 0;

    // Synchronized method 
	/*
	 * class level lock as the method is static synchronized all other thread need to
	 * wait if they access different instances
	 */
    public static synchronized void deposit(int amount) {   
        int newBalance = balance + amount;
        try {
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        balance = newBalance;
        System.out.println("Deposited " + amount + ", New Balance: " + balance);
    }
    /*
     * Instance- level lock 
     */
    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            int newBalance = balance - amount;
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance = newBalance;
            System.out.println("Withdrew " + amount + ", New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrawal of " + amount);
        }
    }

    public int getBalance() {
        return balance;
    }

    public static void main(String[] args) {
    	SynchronizedExample account = new SynchronizedExample();

        //Threads for depositing and withdrawing money
        Thread depositThread1 = new BankAccountThread(account, "deposit", 100);
        Thread withdrawThread1 = new BankAccountThread(account, "withdraw", 50);
        Thread depositThread2 = new BankAccountThread(account, "deposit", 200);
        Thread withdrawThread2 = new BankAccountThread(account, "withdraw", 100);

      
        depositThread1.start();
        withdrawThread1.start();
        depositThread2.start();
        withdrawThread2.start();

    
        try {
            depositThread1.join();
            withdrawThread1.join();
            depositThread2.join();
            withdrawThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final Balance: " + account.getBalance());
    }
}

// Thread class for transactions
class BankAccountThread extends Thread {
    private SynchronizedExample account;
    private String operation;
    private int amount;

    public BankAccountThread(SynchronizedExample account, String operation, int amount) {
        this.account = account;
        this.operation = operation;
        this.amount = amount;
    }

    @Override
    public void run() {
        if ("deposit".equals(operation)) {
            account.deposit(amount);
        } else if ("withdraw".equals(operation)) {
            account.withdraw(amount);
        }
    }
}

