package com.sahil.solid;

interface TransactionLogger{

    void withdraw(double amount);
    void deposit(double amount);

}

class TransactionLoggerImpl implements TransactionLogger {

    @Override
    public void withdraw(double amount) {
        System.out.println("Amount WithDraw = " + amount);
    }

    @Override
    public void deposit(double amount) {
        System.out.println("Amount Deposit = " + amount);
    }
}

class BankManager{

    private TransactionLogger transactionLogger;
    private double balance;

    public BankManager(TransactionLogger transactionLogger) {
        this.transactionLogger = transactionLogger;
    }

    void deposit(double amount) {
        balance = balance + amount;
        transactionLogger.deposit(amount);
    }

    void withdraw(double amount) {
        balance = balance - amount;
        transactionLogger.withdraw(amount);
    }

    double getBalance() {
        return balance;
    }

}

class BankManagerFactory {
    private static BankManager instance;

    public static BankManager newInstance() {
        TransactionLogger transactionLogger = new TransactionLoggerImpl();

        if (instance == null) {
            instance = new BankManager(transactionLogger);
        }

        return instance;
    }

}

public class BankMain {

    public static void main(String[] args) {
        BankManager bankManager = BankManagerFactory.newInstance();
        bankManager.deposit(500);
        bankManager.withdraw(100);
        System.out.println(bankManager.getBalance());

    }

}
