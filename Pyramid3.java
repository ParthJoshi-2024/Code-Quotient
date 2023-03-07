import java.util.Scanner;

public class Pyramid3 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter no. of rows");
        int num = input.nextInt();
        for(int i = 1; i<=num;i++){
            for(int j = 1;j<=num-i;j++){
                System.out.print("*");
            }
            for(int k = 1;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
        input.close();
    }
}
