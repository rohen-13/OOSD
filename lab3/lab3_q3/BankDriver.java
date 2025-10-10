package lab3_q3;

import lab3_q2.SavingsAccount;

public class BankDriver
{
    public static void main(String[] args)
    {
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        saver1.setSavingsBalance(2000);
        saver2.setSavingsBalance(3000);

        SavingsAccount.modifyInterestRate(0.05);

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.println(saver1);
        System.out.println(saver2);

        BankCustomer bc = new BankCustomer("John","Carlow");
        bc.addAccount(saver1);
        bc.addAccount(saver2);

        System.out.println(bc);
        System.out.println("Savings Total: " + (saver1.getSavingsBalance() + saver2.getSavingsBalance()));
    }
}
