import java.util.Scanner;

public class AccountTest {
   public static void main(String[] args) {
      Account account1 = new Account("Jane Green", 50.00);

      System.out.println(account1.getBalance());
      System.out.println(account1.getName());


      System.out.println("\nApós depositos\n");
      
      account1.deposit(100.50); 
      
      System.out.println(account1.getBalance());
      System.out.println(account1.getName());
     
     
   }  
} 