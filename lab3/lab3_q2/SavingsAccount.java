package lab3_q2;

public class SavingsAccount
{
    private int accNo;
    private static int nextAcc = 0;
    public static double annualInterestRate = 0.0;
    private double savingsBalance;

    //Constructor
    public SavingsAccount()
    {
        nextAcc++;
        setAccNo(nextAcc);
    }

    //Getters & Setters
    public int getAccNo()
    {
        return accNo;
    }
    public void setAccNo(int accNo)
    {
        this.accNo = accNo;
    }

    public static void modifyInterestRate(double annualInterestRate) {
        SavingsAccount.annualInterestRate = annualInterestRate;
    }
    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }

    public void setSavingsBalance(int savingsBalance)
    {
        this.savingsBalance = savingsBalance;
    }
    public double getSavingsBalance()
    {
        return savingsBalance;
    }
//Misc Methods
    public void calculateMonthlyInterest()
    {
        savingsBalance+=((getSavingsBalance()*getAnnualInterestRate())/12);
    }
//toString
public String toString()
{
    return "accNo = " + accNo + " savingsBalance = " + savingsBalance;
}
}
