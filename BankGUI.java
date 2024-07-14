//importing various pacakage which is requried for program
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class BankGUI implements ActionListener
 /*Here BankGUI class implemnts the "ActionListener" interface.*/
{
    //Here We are adding the Componets for GUI in Global Variable 
    private JFrame frame;
    private JLabel  E1,E2,card_id,client_name,bank_account,issuer_bank,balance_amount,pin_number,card_id_WITH,withdrawal_amount,withdrawal_date,pin_number_WITH,E4,E3,card_id_credit,client_name_credit,balance_amount_credit,bank_account_credit,issuer_bank_credit,intrest_rate,cvc_number,experiation_date,card_id_credit_lim,grace_period,credit_limit;
    private JTextField T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,T23,T24,T25,T26,T27,T28,T29 ;
    private JButton B1,B2,B3,B4,B5,B6,B7,B8,B9,B10,B11,B12,B13,B14;
    private JComboBox<String> C1,C2,C3,C1_credit,C2_credit,C3_credit;
    //Here we are creating Java TabbedPane 
    private JTabbedPane Z1,Z2;
    //Here we are declaring and Initilizing the array List
    private ArrayList<BankCard> cardList = new ArrayList<BankCard>();
    
    
    public  BankGUI() //This is a a constructor which contain all the GUI component
    
    {
        
        //declearing the frame of GUI
        frame = new JFrame ("BankGUI");
        
        //Adding Tabs by using java JTabbedPane
        Z1= new JTabbedPane();
        frame.add(Z1);
        Z1.setBounds(0,0,1234,845);
        JPanel panel1= new JPanel ();
        panel1.setLayout(null);
        //HEADING OF THE FILE
        E1= new JLabel("Bank Management System");
        E1.setBounds(311,32,336,36);
        E1.setFont(new Font("SANS-SERIF",Font.BOLD,25));
        E2 = new JLabel("Debit Card");
        E2.setBounds(403,84,147,36);
        E2.setFont(new Font("SANS-SERIF",Font.BOLD,25));  
        //HEADING CLOSE
        //CLIENT NAME
        client_name = new JLabel("Client Name :");
        client_name.setBounds(90,230,103,32);
        T1 = new JTextField();
        T1.setBounds(238,230,180,32);
        //client name ends here
        //CARD ID START HERE
        card_id= new JLabel ("Card ID:");
        card_id.setBounds(95,168,107,32);
        T2= new JTextField();
        T2.setBounds(240,168,180,32);
        //CARD ID END HERE
      //PIN NUMBER
        pin_number = new JLabel("PIN Number:");
        pin_number.setBounds(540,295,107,32);
        T3 = new JTextField();
        T3.setBounds(678,294,153,32);
        //PIN NUMBER ENDS HERE
        //BALANCE ID START HERE
        balance_amount = new JLabel("Balance Amount:");
        balance_amount.setBounds(535,240,107,32);
        T4= new JTextField();
        T4.setBounds(670,240,160,32);
        //BALANCE  ID END HERE
       
        //ISSUER  START HERE
        issuer_bank= new JLabel ("Issuer Bank:");
        issuer_bank.setBounds(530,157,80,32);
        T5= new JTextField();
        T5.setBounds(670,156,160,32);
        //ISSUER  ID END HERE
       
        //bank amount start here
        bank_account = new JLabel("Bank Account :");
        bank_account.setBounds(90,310,107,32);
        T6 = new JTextField();
        T6.setBounds(246,310,168,32);
        //BANK AMOUNT ENDS HERE
       
        //WITHDRAWAAL DATE
        withdrawal_date = new JLabel("Withdrawal Date");
        withdrawal_date.setBounds(444,459,107,32);
       
       //COMBO BOX START HERE FOR THE DATES
            String[] day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        C1 = new JComboBox<String>(day);
        C1.setBounds(565,459,77,32);
       
        String[] month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        C2 = new JComboBox<String>(month);
        C2.setBounds(637,459,84,32);
       
        String[] year = {"2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024"};
        C3 = new JComboBox<String>(year);
        C3.setBounds(720,459,92,32);

       
        //WITHDRAWAL AMOUNT
        withdrawal_amount = new JLabel ("Withdrawal Amount");
        withdrawal_amount.setBounds(127,560,120,32);
        T7 = new JTextField();
        T7.setBounds(274,560,114,32);
       
        //CARD ID START HERE
        card_id_WITH= new JLabel ("Card ID:");
        card_id_WITH.setBounds(145,498,60,32);
        T16= new JTextField();
        T16.setBounds(282,498,107,32);
        //CARD ID END HERE
       
        //PIN NUMBER
        pin_number_WITH = new JLabel("PIN Number:");
        pin_number_WITH.setBounds(494,541,107,32);
        T18 = new JTextField();
        T18.setBounds(638,540,114,32);
        //PIN NUMBER ENDS HERE   
       
   
       
        //BUTTONS ON GUI 1 STARTS HERE
       
        B1 = new JButton ("Add to debit card");
        B1.setBounds(287,371,315,38);
        B1.setBackground(Color.GREEN);
       
       
        B2= new JButton ("Display");
        B2.setBounds(602,724,178,47);
        B2.setBackground(Color.GREEN);
       
        B3 = new JButton ("Cancle ");
        B3.setBounds(77,724,179,47);
        B3.setBackground(Color.RED);
       
       
        B4 = new JButton ("Withdrawal From Debit Card");
        B4.setBounds(300,637,253,32);
         B4.setBackground(Color.GREEN);
       
        //ADDING COMPONENTS TO THE PANEL
        panel1.add(card_id);
        panel1.add(T2);
        panel1.add(client_name);
        panel1.add(T1);
        panel1.add(bank_account);
        panel1.add(T6);
        panel1.add(issuer_bank);
        panel1.add(T5);
        panel1.add(balance_amount);
        panel1.add(T4);
        panel1.add(pin_number);
        panel1.add(T3);
        panel1.add(card_id_WITH);
        panel1.add(T16);
        panel1.add(withdrawal_amount);
        panel1.add(T7);
        panel1.add(withdrawal_date);
        panel1.add(C1);
        panel1.add(C2);
        panel1.add(C3);
        panel1.add(pin_number_WITH);
        panel1.add(T18);
        panel1.add(B1);
        panel1.add(B2);
        panel1.add(B3);
        panel1.add(B4);
        panel1.add(E1);
        panel1.add(E2);
       
       
        panel1.setBackground(Color.WHITE);
       
       
       
        //GUI PART 2 START HERE
        JPanel panel2 = new JPanel();
        panel2.setLayout(null);
        //HEADING OF THE FILE
        E3= new JLabel("Bank Management System");
        E3.setBounds(311,32,336,36);
        E3.setFont(new Font("SANS-SERIF",Font.BOLD,25));
       
        E4 = new JLabel("Credit Card");
        E4.setBounds(403,84,147,36);
        E4.setFont(new Font("SANS-SERIF",Font.BOLD,25));
       
        //HEADING CLOSE
       
          //CLIENT NAME
        client_name_credit = new JLabel("Client Name :");
        client_name_credit.setBounds(66,226,103,32);
        T19 = new JTextField();
        T19.setBounds(216,226,180,32);
       
        //client name ends here
       
        //CARD ID START HERE
        card_id_credit= new JLabel ("Card ID:");
        card_id_credit.setBounds(73,172,107,32);
        T20= new JTextField();
        T20.setBounds(216,172,180,32);
        //CARD ID END HERE
       
        //
        //
        
        
        //CARD ID START HERE
        card_id_credit_lim= new JLabel ("Card ID:");
        card_id_credit_lim.setBounds(148,491,107,32);
        T28= new JTextField();
        T28.setBounds(288,500,168,32);
        //CARD ID END HERE
       
        //bank amount start here
        bank_account_credit = new JLabel("Bank Account :");
        bank_account_credit.setBounds(51,378,122,32);
        T21 = new JTextField();
        T21.setBounds(216,378,168,32);
        //BANK AMOUNT ENDS HERE
       
       
        //BALANCE ID START HERE
        balance_amount_credit = new JLabel("Balance Amount:");
        balance_amount_credit.setBounds(66,310,107,32);
        T22= new JTextField();
        T22.setBounds(216,310,168,32);
        //BALANCE  ID END HERE
       
        //ISSUER  START HERE
        issuer_bank_credit= new JLabel ("Issuer Bank:");
        issuer_bank_credit.setBounds(500,168,99,32);
        T23= new JTextField();
        T23.setBounds(642,168,180,32);
        //ISSUER  ID END HERE
       
        //CVC NUMBER START HERE
       
        cvc_number = new JLabel ("CVC Number:");
        cvc_number.setBounds(500,294,90,32);
        T24 = new JTextField();
        T24.setBounds(660,294,180,32);
        //CVC NUMBER ENDS HERE
       
        //CREDIT LIMIT START HERE
        credit_limit = new JLabel ("Credit Limit");
        credit_limit.setBounds(148,607,90,32);
        T25 = new JTextField();
        T25.setBounds(288,609,168,32);
        //CVC NUMBER ENDS HERE
       
        intrest_rate = new JLabel("Intrest Rate");
        intrest_rate.setBounds(490,236,80,32);
        T26 = new JTextField();
        T26.setBounds(650,236,160,32);
       
       
        grace_period = new JLabel("Grace Period");
        grace_period.setBounds(148,549,107,32);
        T27 = new JTextField();
        T27.setBounds(288,550,168,32);
       
       
         //EXP DATE
        experiation_date = new JLabel("Experiation Date");
        experiation_date.setBounds(447,373,122,32);
       
        //COMBO BOX START HERE FOR THE DATES
       
       
       
            String[] Day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        C1_credit = new JComboBox<String>(Day);
        C1_credit.setBounds(578,372,107,32);
       
        String[] Month = {"January","February","March","April","May","June","July","August","September","October","November","December"};
        C2_credit = new JComboBox<String>(Month);
        C2_credit.setBounds(691,373,82,32);
       
        String[] Year = {"2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024"};
        C3_credit = new JComboBox<String>(Year);
        C3_credit.setBounds(780,373,100,32);
     
       
        //BUTTONS
        B8= new JButton ("Display");
        B8.setBounds(678,727,178,47);
       // B2.setBackground(Color.GREEN);
       
        B9 = new JButton ("Cancle ");
        B9.setBounds(58,733,179,47);
        B9.setBackground(Color.RED);
       
        B10= new JButton ("Add to Credit Card");
        B10.setBounds(265,432,284,32);
       // B5.setBackground(Color.GREEN);
       
        B6 = new JButton ("Set the Credit Limit");
        B6.setBounds(300,677,170,32);
        B6.setBackground(Color.RED);
       
        B7= new JButton ("Cancle Credit Card");
        B7.setBounds(491,677,155,32);
      //  B7.setBackground(Color.GREEN);
       
        panel2.add(card_id_credit);
        panel2.add(T20);
        panel2.add(client_name_credit);
        panel2.add(T19);
        panel2.add(balance_amount_credit);
        panel2.add(T22);
        panel2.add(bank_account_credit);
        panel2.add(T21);
        panel2.add(issuer_bank_credit);
        panel2.add(T23);
        panel2.add(intrest_rate);
        panel2.add(cvc_number);
        panel2.add(T24);
        panel2.add(experiation_date);
        panel2.add(C1_credit);
        panel2.add(C2_credit);
        panel2.add(C3_credit);
        panel2.add(card_id_credit_lim);
        panel2.add(grace_period);
        panel2.add(T28);
        panel2.add(T27);
        panel2.add(credit_limit);
        panel2.add(T25);
        panel2.add(B7);
        panel2.add(B8);
        panel2.add(B9);
        panel2.add(T26);
        panel2.add(B6);
        panel2.add(E4);
        panel2.add(E3);
        panel2.add(B10);
       
        panel2.setBackground(Color.WHITE);
       
     
        Z1.add("Debit Card",panel1);
       
        Z1.add("Credit Card",panel2);
       

         frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(930,850);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
   
       //Here we are adding the Action Listner 

       B1.addActionListener(this);
       B2.addActionListener(this);
       B3.addActionListener(this);
       B4.addActionListener(this);
       
       B6.addActionListener(this);
       B7.addActionListener(this);
       B8.addActionListener(this);
       B9.addActionListener(this);
       B10.addActionListener(this);

       
        // addActionListener
       
       
    }
    @Override
    public void actionPerformed(ActionEvent a)
    //
    
    {  
       // This section belongs to Add to DebitCard Button
        if(a.getSource() == B1){ 
            
            //Checking all the text field are empty or not 
            if(T2.getText().isEmpty() || T1.getText().isEmpty() || T6.getText().isEmpty() || T5.getText().isEmpty() || T4.getText().isEmpty() || T3.getText().isEmpty()){
        
                //Here we are displaying an error message if any of above field are empty
        
                JOptionPane.showMessageDialog(frame,"Please Fill all the information ","Alert",JOptionPane.WARNING_MESSAGE);
        return;
        }
            try
            //Here we are using TRY CATCH feature to check wheather the data entered by the user are valid or not 
            
            {
                //Taking  input values of respected feild of Debit Card
                int card_id = Integer.parseInt(T2.getText());
                int balance_amount = Integer.parseInt(T4.getText());
                int pin_number = Integer.parseInt(T3.getText());
                String client_name = T1.getText();
                String bank_account = T6.getText();
                String issuer_bank = T5.getText(); 
                    
    
                boolean card_id_exists_check = false;
                //Here we are checking the card id exist or not 
                //initial its set to false
                
                for(BankCard card_number : cardList)
                
                //Here the cardList is the name of the Array List 
                {
         
                    if(card_number.getcard_id() == card_id )
                    
                    //Comparing the card id 
                    {
                        JOptionPane.showMessageDialog(frame,"This CARDID is already Registered ","Alert",JOptionPane.WARNING_MESSAGE);
                        card_id_exists_check = true;
                        return;
                    }
                }
                    if(!card_id_exists_check){
                        
                        //here we are creating a new debit card object name debit_C
                        
                        DebitCard debit_Cd = new DebitCard(balance_amount,card_id,bank_account,issuer_bank,client_name,pin_number);
                        
                        //here we are adding the object of DebitCard to CardList Array list.
                        
                        cardList.add(debit_Cd);
                        JOptionPane.showMessageDialog(frame,"Debit Card is Added Successfully!","Information",JOptionPane.INFORMATION_MESSAGE);
                        
                        //CLEARING TEXT 
                        T1.setText("");
                        T2.setText("");
                        T3.setText("");
                        T4.setText("");
                        T5.setText("");
                        T6.setText("");
                    }
            }
            //This is an important section where if the user input string values in the integer place an error message is throw.
            
                catch(NumberFormatException n){
                    JOptionPane.showMessageDialog(frame,"Please enter the values in correct Format","Error",JOptionPane.WARNING_MESSAGE);
                }
        }    
        
        
        
            //This section belongs to WITHDRAW FROM THE DEBT CARD
            else if(a.getSource() == B4)
        {
            //Here we are checking wheather all flield are filled or not 
            
            if (T16.getText().isEmpty() || T7.getText().isEmpty() || T18.getText().isEmpty())
            {
                //if any of the field are not filled an error message is thrown,
                
                
                JOptionPane.showMessageDialog(frame, "Please Fill all the information.","Alert",JOptionPane.ERROR_MESSAGE);
            }  
            else
            {
                //Here we are using TRY CATCH feature to check wheather the data entered by the user are valid or not 
                try
                {
                    //Taking the input values from the text fields of Debit Card
                    int card_id_WITH = Integer.parseInt(T16.getText());
                    int Withdrawal_Amount = Integer.parseInt(T7.getText());
                    int pin_number_WITH = Integer.parseInt(T18.getText());
                    //Getting date  date from combobox
                    String day = (String) C1.getSelectedItem();
                    String month = (String) C2.getSelectedItem();
                    String year = (String) C3.getSelectedItem();
                    String dateofwithdrawal = day + "/" + month + "/" + year;
                   
                    
                    boolean DebitCard_id = false;


                    for (int i = 0; i < cardList.size(); i++)
                    
                    //This is an important loop which go through array list and finds the card id
                    
                    {
                      BankCard Debit_id = cardList.get(i);
                     
                    
                      if (Debit_id.getcard_id() == card_id_WITH && Debit_id instanceof DebitCard) {
                          
                        //Checking the card id 
                        
                        
                          DebitCard_id = true;
                          DebitCard cardList = (DebitCard) Debit_id;
                         
                          //Checking whether the pin number matches or not
                          if (cardList.getPIN_Number() == pin_number_WITH) {
                              
                              //checking the balance and withdraw amount for transaction process.
                              if (cardList.getbalance_amount() < cardList.getWithdrawal_Amount()) {
                                  JOptionPane.showMessageDialog(frame, "Sorry, You dont have Enough Fund For withdrawal ","Alert", JOptionPane.INFORMATION_MESSAGE);
                                 
                                  //Clearing TextFields
                                  T16.setText("");
                                  T7.setText("");
                                  T18.setText("");
                              } else {
                                  cardList.withdraw( Withdrawal_Amount, dateofwithdrawal,  pin_number_WITH);
                                 
                                  //when withdrawn is done displaying an sucess Message!
                                  JOptionPane.showMessageDialog(frame, " Your Amount was successfully withdrawn  ", "Alert", JOptionPane.INFORMATION_MESSAGE);
                                 
                                  //Clearing TextFields
                                  T16.setText("");
                                  T7.setText("");
                                  T18.setText("");
                                 
                                  break;
                              }
                              
                              //here an error message is shown if the pin number is not matched.
                          } else {
                              JOptionPane.showMessageDialog(frame, "You have entered Wrong PIN ! Please Enter it Again", "Alert", JOptionPane.ERROR_MESSAGE);
                          }
                      } else {
                          
                          //here an error message is thrown if card id is not matched 
                          JOptionPane.showMessageDialog(frame, " Debit Card does not exist. Please enter a valid Card ID!!.", "Alert", JOptionPane.ERROR_MESSAGE);
                      }
                  }}
                  
                  //here if the user enter an string values inplace of integer an error message is shown
                  catch(NumberFormatException n)
                {
                    JOptionPane.showMessageDialog(frame,"Please enter the values in correct Format","Alert",JOptionPane.ERROR_MESSAGE);
                }
                 
 
         

         
              }}
               //this section is for Displaying Debit Card
        else if (a.getSource() == B2)
        {
            for(BankCard detail : cardList)
            {
                if(detail instanceof DebitCard)
                {
                    DebitCard Debitcard = (DebitCard) detail;
                   
                    Debitcard.display();
                }
            }
        }
        //This section is for Clearing the text field.
        else if (a.getSource() == B3)
        {      
             T1.setText("");
             T2.setText("");
             T3.setText("");
             T4.setText("");
             T5.setText("");
             T6.setText("");
        }
        //This section belong to add credit card
         else if(a.getSource() == B10){
             
            if(T20.getText().isEmpty() || T19.getText().isEmpty() || T22.getText().isEmpty() || T21.getText().isEmpty() || T23.getText().isEmpty() ||T26.getText().isEmpty() || T24.getText().isEmpty() ){
            //Checking that all the requried field are filled or not
                
                JOptionPane.showMessageDialog(frame,"Please Fill all the information","Alert",JOptionPane.WARNING_MESSAGE);
                //error message is thrown if all the field are not filled properly
            return;   
        }
            try{
                
                //Taking the input values from the text fields of Credit Card
                int card_id_credit = Integer.parseInt(T20.getText());
                int balance_amount = Integer.parseInt(T22.getText());
                int cvc_number = Integer.parseInt(T24.getText());
                double interest_rate = Integer.parseInt(T26.getText());
                String client_name = T19.getText();
                String bank_account = T23.getText();
                String issuer_bank = T21.getText(); 
                String expiration_date = C1_credit.getSelectedItem().toString() + C2_credit.getSelectedItem().toString() + C3_credit.getSelectedItem().toString();
                
                boolean cardIdExists_check = false;
                //This is an important loop which go through array list and finds the card id
                for(BankCard card_number : cardList){
                    if(card_number.getcard_id() == card_id_credit){
                        JOptionPane.showMessageDialog(frame,"This CardId is Already Exists","Alert",JOptionPane.WARNING_MESSAGE);
                        cardIdExists_check = true;
                        return;
                    }
                }
               
                    if(!cardIdExists_check){
                        CreditCard credit_CL = new CreditCard(card_id_credit,client_name,issuer_bank,bank_account,balance_amount,cvc_number,interest_rate,expiration_date);   
                        cardList.add(credit_CL);
                        JOptionPane.showMessageDialog(frame,"Your Credit Card is Added Successfully!","Information",JOptionPane.INFORMATION_MESSAGE);
                    }   
            }
                catch(NumberFormatException e){
                    JOptionPane.showMessageDialog(frame,"Please enter the values in correct Format","Error",JOptionPane.WARNING_MESSAGE);
                }
            
        }   
       
      
      

      ///CREDIT CARD START HERE
    

            //SET CREDIT LIMIT
            else if (a.getSource() == B6)
{
    if (T28.getText().isEmpty() || T27.getText().isEmpty() || T25.getText().isEmpty())
    {
        //Displays Error message if the text field is empty 
        JOptionPane.showMessageDialog(frame, "Please Fill all the information","Alert",JOptionPane.ERROR_MESSAGE);
    }
    else
    {
      
        
            int card_id_credit_lim = Integer.parseInt(T28.getText());
            double credit_limit= Double.parseDouble(T25.getText()); 
            int grace_period = Integer.parseInt(T27.getText());  
            
           
            boolean CreditC_id = false;

             
            boolean creditC_id = false;
            for(int i=0; i<cardList.size(); i++) {
                BankCard Credit_id = cardList.get(i);
                try{

                    //Downcasting to so get SetCredit Limit Method and checking card id mathces or not
                    if(Credit_id.getcard_id() == card_id_credit_lim && Credit_id instanceof CreditCard ) {
                        //If the card exists 
                        CreditC_id = true;

                        CreditCard Creditcard = (CreditCard) Credit_id;
                        Creditcard.setCredit_Limit( credit_limit,  grace_period);

                        JOptionPane.showMessageDialog(frame, "Your Credit Limit is successfully set for Credit Card with card id " + card_id_credit_lim + ".", "Alert", JOptionPane.INFORMATION_MESSAGE);

                        break;
                    } else {
                        JOptionPane.showMessageDialog(frame, "The Credit Card with Card Id " + card_id_credit_lim + " dose not exist. Please enter a valid Card Id." , "Alert", JOptionPane.ERROR_MESSAGE); 
                    }

                    //Clearing TextFields
                   // T28.setText("");
                    //T27.setText("");
                    //T25.setText("");
                }
                
            
                
                catch(NumberFormatException n) {
                    JOptionPane.showMessageDialog(frame,"Please enter the values in correct Format","Alert",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        }
        
        

                        
                        //Display
        else if (a.getSource() == B8)
        {
            for(BankCard detail : cardList) 
            {
                if(detail instanceof CreditCard)
                {
                    CreditCard creditCard = (CreditCard) detail;
                    
                    creditCard.display();
                }
            }
        }
        //Remove Button
        else if (a.getSource() == B7)
        {
            for(BankCard cancell_CC : cardList) 
            {
                if(cancell_CC instanceof CreditCard)
                {               
                    cardList.remove(cancell_CC);
                    
                    JOptionPane.showMessageDialog(frame,"Credit Card Cancalled","Alert",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        }
        
        else
        {
             T20.setText("");
             T19.setText("");
             T22.setText("");
             T21.setText("");
             T23.setText("");
             T26.setText("");
             T24.setText("");
             T28.setText("");
             T27.setText("");
             T25.setText("");
        }   
    }
    
                        
                        


    public static void main (String [] args){
       
        new BankGUI();
    }
}