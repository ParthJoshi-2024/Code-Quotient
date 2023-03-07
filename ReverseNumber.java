import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
class ReverseNumber{
    public static void main(String[] args)
    {
        // Write your code here
     Scanner input = new Scanner(System.in);
      int num = input.nextInt();
      int copy = num;
      int reverse = 0;
      while(num!=0){
        reverse = reverse*10 + num%10;
        num = num/10;
      }
      if(reverse == copy){
        System.out.println("Equal");
      }
      else{
        System.out.println("Not Equal");
      }
      input.close();
    }
}