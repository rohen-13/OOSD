package lab3_q3;

import lab3_q2.SavingsAccount;

import java.util.Arrays;

public class BankCustomer
{
    //Variables
    private String name;
    private String address;
    private SavingsAccount[] savaccs = new SavingsAccount[3];
    private int amountOfAcc = 0;

    //Constructor
    public BankCustomer(String name, String address)
    {
        setName(name);
        setAddress(address);
    }
    //Getters & Setters
    public String getName()
    {
        return name;
    }
    public String getAddress()
    {
        return address;
    }
    public SavingsAccount[] getSavaccs()
    {
        return savaccs;
    }
    public void  setName(String name)
    {
        this.name = name;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public void setSavaccs(SavingsAccount[] savaccs)
    {
        this.savaccs = savaccs;
    }
    public int  getAmountOfAcc()
    {
        return amountOfAcc;
    }
    public void  setAmountOfAcc(int amount)
    {
        this.amountOfAcc = amount;
    }
    //Misc Methods
    public void addAccount(SavingsAccount sav)
    {
        if (getAmountOfAcc()<=2)
        {
            savaccs[getAmountOfAcc()]=sav;
            amountOfAcc++;
            setAmountOfAcc(getAmountOfAcc()+1);
        }
        else
        {
            System.out.println("You can't add more than 3 accounts");
        }
    }

    public double balanace(SavingsAccount[] savaccs)
    {
        double balance = 0.0;
        for(SavingsAccount sav : savaccs)
        {
            if(sav != null)
            {
                balance+= sav.getSavingsBalance();
            }
        }
        return balance;
    }

    //toString
    public String toString()
    {
        return "Name: " + name + ", Address: " + address + ", Savaccs: " + Arrays.toString(savaccs);
    }
}
