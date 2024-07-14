// Here the Creditcard is the sub class of primary class Bankcard
public class CreditCard extends BankCard 
{
    /* Here we are using the private attributes for the 
    follwing instance variable as it can be accessed through 
    only this class*/   
    private int CVC_Number;  //here we used int as datatype as CVC_Number is an integer                              
    private double Credit_Limit;//here we used int as datatype as Credit_Limit is an integer               
    private double Interest_Rate; //here we used int as datatype as Intrest_Rate is an integer   
    private String Expiration_Date; //here we used int as datatype as Expiration_Date is an integer                 
    private int Grace_Period;   //here we used int as datatype as Grace_Period is an integer  
    private boolean Is_Granted;  //here we used int as datatype as Is_Granted is an integer             
    
    /*Here we created an constructor named as creditcard
       that initialized the class variables by using
       the parameters values passed */
    
    public CreditCard(int Card_Id, String Client_Name, String Issuer_Bank, String Bank_Account, int Balance_Amount, int CVC_Number, 
    double Interest_Rate, String Expiration_Date)                           
    {
        // Using super keyword
        super(Balance_Amount, Card_Id, Issuer_Bank, Bank_Account);
        
        // Using this keyword
        this.CVC_Number = CVC_Number;
        this.Interest_Rate = Interest_Rate;
        this.Expiration_Date = Expiration_Date;
        setclient_name(Client_Name);
        this.Is_Granted = false;
    }

     /*Here we are creating Getter method for the private variable to return a value.
       The sub classes are able to access the vlaues of the private attributes by 
       a public getter method
       examples can be given as :
       "getPIN_Number" */     
    public int getCVC_Number()        // getter                                                   // getter
    {
        return this.CVC_Number;
    }

    public double getCredit_Limit()      // getter                                                // getter
    {
        return this.Credit_Limit;
    }

    public double getInterest_Rate()  // getter                                                   // getter
    {
        return this.Interest_Rate;
    }

    public String getExpiration_Date()   // getter                                                 // getter
    {
        return this.Expiration_Date;
    }

    public int getGrace_Period()     // getter                                                    // getter
    {
        return this.Grace_Period;
    }

    public boolean getIs_Granted()       // getter                                                // getter
    {
        return this.Is_Granted;
    }

    /*Here we are using setter method. This method help us by allowing 
     other class to change the values of the private attributes*/
    public void setCredit_Limit(double Credit_Limit, int Grace_Period)
    {
        
           
        if(Credit_Limit <= (2.5 * this.getbalance_amount()))
        {
            this.Credit_Limit = Credit_Limit;
            this.Grace_Period = Grace_Period;
            this.Is_Granted = true;
        } 
        
        else 
        {
            System.out.println("Credit cannot be issued. Please check your account and try again.");
        }
    }

    
    
       /*   This public method called "cancelCreditCard" that
        allows the user to cancel their credit card. */
    public void cancelCreditCard()
    {
     
        if(this.Is_Granted)
        {
            this.CVC_Number = 0;
            this.Credit_Limit = 0;
            this.Grace_Period = 0;
            this.Is_Granted = false;
        } 
        
        else 
        {
            System.out.println("Credit card is not active.");
        }
    }

    public void display()
    {
        super.display();
        if(this.Is_Granted)
        {
            System.out.println("CVC Number: " + CVC_Number);
            System.out.println("Credit Limit: " + Credit_Limit);
            System.out.println("Interest Rate: " + Interest_Rate);
            System.out.println("Expiration Date: " + Expiration_Date);
            System.out.println("Grace Period: " + Grace_Period);
        } 
        
        else 
        {
            System.out.println("Credit card is not granted.");
        }
    }
}