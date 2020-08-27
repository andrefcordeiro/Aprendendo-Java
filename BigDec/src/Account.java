import java.math.BigDecimal;

public class Account {
	
   private String name; // instance variable 
   private BigDecimal balance; // instance variable 
   	

   // Account constructor that receives two parameters  
   public Account(String name, double balance) {
      this.name = name; 

      if (balance > 0.0) {  
    	
    	 BigDecimal b = BigDecimal.valueOf(balance);  
         this.balance = b; 
      }
   }

   
   public void deposit(double depositAmount) {   
	   
      if (depositAmount > 0.0) { 
    	 balance = balance.add(BigDecimal.valueOf(depositAmount));   
         
      }
   }

   // method returns the account balance
   public BigDecimal getBalance() { 
      return balance; 
   } 

   // method that sets the name
   public void setName(String name) {
      this.name = name; 
   } 

   // method that returns the name
   public String getName() {
      return name; 
   } 
}