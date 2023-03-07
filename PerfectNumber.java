import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum= 0;
        int copy = num;
        for(int i=1;i<=num/2;i++){
            if(num%i == 0){
                sum = sum + i;
            }
        }
        if(copy == sum){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not Perfect Number");
        }
        input.close();
    }
}
