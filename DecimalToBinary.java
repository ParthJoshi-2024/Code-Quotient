import java.util.Scanner;
public class DecimalToBinary {
        // print the binary equivalent of the given number 'n'
        static void decimalToBinary(int n) {
          // Write your Code here
            System.out.println(Integer.toBinaryString(n));
        }
        public static void main(String[] argrs){
          Scanner input = new Scanner(System.in);
          int n = input.nextInt();
          int num;
          for(int i = 1;i<=n;i++){
            num = input.nextInt();
            decimalToBinary(num);
          }
          input.close();
        }
}
