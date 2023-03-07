import java.util.Scanner;
public class NumIsSquare {

  static void isSquare(int n){
    for(int i =2;i<=n;i++){
      if((i*i) == n){
        System.out.println("yes");
        return;
      }
    }
    System.out.println("no");
    return;
  }
    public static void main(String[] args)
    {
        // Write your code here
      Scanner input = new Scanner(System.in);
      int n = input.nextInt();
      isSquare(n);
      
      input.close();    
    }
}