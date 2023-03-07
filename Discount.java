import java.util.Scanner;

public class Discount {
   
    public static void main(String[] args)
    {
        // Write your code here
      Scanner input = new Scanner(System.in);
      int amount = input.nextInt();
      if(amount < 1000){
        System.out.format("%.2f",(amount-0.0));
      }
      else if(amount>1000 && amount<5000){
        System.out.format("%.2f",(amount-0.05*amount));
      }
      else if(amount>5000 && amount<10000){
        System.out.format("%.2f",(amount-0.1*amount));
      }
      else if(amount>10000){
        if(amount>30000){
          System.out.format("%.2f",(amount-0.3*amount));
        }
        else{
        System.out.format("%.2f",(amount-0.15*amount));
        }
      }
      else{
        System.out.println("");
      }
        input.close();
      
    }
}
