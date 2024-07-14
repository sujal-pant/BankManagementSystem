// Here the Bankcard class is the primary class between the three different classes
public class BankCard
{
    /* Here we are using the private attributes for the 
    follwing instance variable as it can be accessed through 
    only this class*/  
     
    
    private int card_id; //here we used int as datatype as id is an integer                          
    private String client_name;  //here we used String as datatype as client name  is an string
    private String issuer_bank;    //here we used String as datatype as issuer bank is an string                        
    private String bank_account; //here we used String as datatype as bank_account is an string  
    private int balance_amount;   //here we used Int as datatype as balance amount is an int                          
                               
   
    
   /*Here we created an constructor named as Bankcard
       that initialized the class variables by using
       the parameters values passed */ 
    public BankCard(int balance_amount,int card_id, String bank_account, String issuer_bank)      // Constructor
    {
        // Using this keyword
        this.issuer_bank=issuer_bank;
        this.client_name="";
        this.balance_amount=balance_amount;
        this.bank_account=bank_account;  
        this.card_id=card_id;
         
    }
     /*Here we are creating Getter method for the private variable to return a value.
       The sub classes are able to access the vlaues of the private attributes by 
       a public getter method
       examples can be given as :
       "getPIN_Number" */  

    public String getbank_account()                 // getter
    {
        return this.bank_account;
    }
   
    public int getcard_id()                         // getter
    {
        return this.card_id;
    }
    
    public int getbalance_amount()                   // getter
    {
      return this.balance_amount;  
    }
    
    public String getissuer_bank()                  // getter 
    {
        return this.issuer_bank;
    }
    public String getclient_name()                  // getter
    {
        return this.client_name;
    }
    
     /*Here we are using setter method. This method help us by allowing 
     other class to change the values of the private attributes*/
    
   
      
    public void setclient_name(String client_name)               // setter
    {
        this.client_name=client_name;
    }
    public void setbalance_amount(int balance_amount)               // setter
    {
        this.balance_amount=balance_amount;
    }
    
    
     /*Here a public method is created which help us to pritn the values of the attributes 
       only if the client name is not empty else the method will display an error saying"No cliemt found*/
     
    public void display()
    {
        if(this.client_name.equals(""))
        {
            System.out.println("Client name is not assigned ,please assign it!");           
        }

        else
        {
            System.out.println("Card_Id: " + card_id);
            System.out.println("Bank Account: " + getbank_account());
            System.out.println("Balance Amount: " + balance_amount);
            System.out.println("Client Name: " + client_name);
            System.out.println("Issuer Bank: " + issuer_bank);  
        }
    }    
}                                    