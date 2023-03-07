import java.util.Scanner;

public class Pattern6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        for(int i = 1; i<=num; i++){
            for(int j =i;j>=1;j--){
                System.out.print(j);
            }
            for(int k = 2;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
        input.close();
    }
}