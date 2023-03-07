import java.util.Scanner;
public class Lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int gcd = 1;
       for(int i=1; i<=x && i<=y; i++){
         if(x%i==0 && y%i == 0){
           gcd = i;
         }
         
       }
       int lcm = (x*y)/gcd;
         System.out.println("Lcm is " + lcm);
        input.close();
    }
}
