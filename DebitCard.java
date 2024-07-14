// Here the Debit class is the sub class of primary class Bankcard

 

public class DebitCard extends BankCard

{

      /* Here we are using the private attributes for the

    follwing instance variable as it can be accessed through

    only this class*/

    private String Date_Of_Withdrawal;    //here we used int as datatype Date_Of_Withdrawal is an String

    private int Withdrawal_Amount;    //here we used int as datatype as Withdrawal_Amount is an integer

    private boolean Has_Withdrawn;  //here we used int as datatype as has_Withdrawan is an boolean                               

    private int PIN_Number; //here we used int as datatype as PIN_Number is an integer                 

                         

   

    /*Here we created an constructor named as Debitcard

       that initialized the class variables by using

       the parameters values passed */

 

    public DebitCard(int balance_amount,int card_id, String bank_account, String issuer_bank, String client_name,int PIN_Number)

    {

        // Using super keyword

        super(balance_amount, card_id, bank_account, issuer_bank);

         // Using this keyword

        setclient_name(client_name);

        this.PIN_Number=PIN_Number;

        this.Has_Withdrawn=false;

    }  

     /*Here we are creating Getter method for the private variable to return a value.

       The sub classes are able to access the vlaues of the private attributes by

       a public getter method

       examples can be given as :

       "getPIN_Number" */         

    

      public int getWithdrawal_Amount()// getter

    {                                      

        return this.Withdrawal_Amount;

    }

    public int getPIN_Number()             // getter                                

    {

        return this.PIN_Number;

    }

 

   public boolean getHas_Withdrawn()// getter                                      

    {

        return this.Has_Withdrawn;

    }

 

    public String getDate_Of_Withdrawal()   // getter                             

    {

        return this.Date_Of_Withdrawal;

    }

 

   

 

    /*Here we are using setter method. This method help us by allowing

     other class to change the values the private attributes*/

   

   

    public void setWithdrawal_Amount(int Withdrawal_Amount)                             

    {

        this.Withdrawal_Amount = Withdrawal_Amount;

    }

   

     

    /*The "withdraw" method allows the user to remove funds from their bank account by checking that the entered PIN is correct and that there are enough funds available. If the withdrawal is successful,

     it updates the account balance, withdrawal amount, and date, otherwise it displays an error message. */

         public void withdraw(int Withdrawal_Amount, String Date_Of_Withdrawal, int PIN_Number)

    {

        if (this.PIN_Number == PIN_Number)

        {

            if (Withdrawal_Amount <= getbalance_amount())

            {

                this.Withdrawal_Amount = Withdrawal_Amount;

                this.Date_Of_Withdrawal = Date_Of_Withdrawal;

                Has_Withdrawn = true;

                setbalance_amount(getbalance_amount()-Withdrawal_Amount);

            }

            

            else

            {

                System.out.println("Sorry not sufficient funds!");

            }

        }

        

        else

        {

            System.out.println("You have entered the wrong pin !");

        }

    }

    //here a display method is created to display the following

 

    public void display()

    {

        super.display();

        System.out.println("PIN Number: " + getPIN_Number());

       

        if(Has_Withdrawn)

        {

            System.out.println("Withdrawal Amount: " + getWithdrawal_Amount());

            System.out.println("Date of Withdrawal: " + getDate_Of_Withdrawal());

        }

        

        else

        {

            //System.out.println("BalanceAmount: " +getbalance_amount());

            System.out.println("Pending Transaction.");

        }

    }

 

}