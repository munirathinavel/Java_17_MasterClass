package oops.inheritance.constructoroverloading;

import java.util.HashMap;
import java.util.Map;

class BankAccount {

    private long accountNo;
    private String name;
    private String email;
    private double balance;

    public long getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class Bank {
    Map<Long, BankAccount> accounts = new HashMap<>();

    public void newAccount(BankAccount bankAccount) {
        long accountNo = System.currentTimeMillis();
        bankAccount.setAccountNo(accountNo);
        accounts.put(accountNo, bankAccount);
    }

    public BankAccount deleteAccount(long accountId) {
        BankAccount account = accounts.get(accountId);
        System.out.println(account.getName() + " account with Id " + accountId + " has been deleted");
        return accounts.remove(accountId);
    }

    public boolean deposit(long accountId, double amount) {
        if (amount < 0) {
            System.out.println("Invalid Amount");
            return false;
        }
        BankAccount bankAccount = accounts.get(accountId);
        bankAccount.setBalance(bankAccount.getBalance() + amount);
        System.out.println("Amount:" + amount + " deposited successfully");
        System.out.println("Current Balance is:" + bankAccount.getBalance());
        return true;
    }

    public boolean withdraw(long accountId, double amount) {
        if (amount < 0) {
            System.out.println("Invalid Amount");
            return false;
        }
        BankAccount bankAccount = accounts.get(accountId);
        if (bankAccount.getBalance() - amount < 0) {
            System.out.println("Insufficient Amount");
            return false;
        }
        bankAccount.setBalance(bankAccount.getBalance() - amount);
        System.out.println("Amount:" + amount + " withdrawn successfully");
        System.out.println("Current Balance is:" + bankAccount.getBalance());
        return true;
    }
}

public class ClassChallenge {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setEmail("vell@cool.com");
        bankAccount.setName("Vel");

        Bank bank = new Bank();
        bank.newAccount(bankAccount);

        bank.deposit(bankAccount.getAccountNo(), 50.00);
        bank.deposit(bankAccount.getAccountNo(), 5000000.00);

        bank.withdraw(bankAccount.getAccountNo(), 2000.00);
        bank.withdraw(bankAccount.getAccountNo(), 567000.00);

        bank.deleteAccount(bankAccount.getAccountNo());

    }
}
