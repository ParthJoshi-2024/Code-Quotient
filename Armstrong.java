import java.util.Scanner;

public class Armstrong {
    static void isArmstrong(int num, int digit){
        int sum = 0;
        int copy = num;
        while(num!=0){
            sum = (int) (sum + Math.pow((num%10),digit));
            num = num/10;
        }
        if(copy == sum){
            System.err.println("Armstrong");
            return;
        }
        else{
            System.out.println("Not Armstrong");
            return;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int digit = 0;
        int copy = num;
        while(num!=0){
            num = num/10;
            digit = digit + 1;
        }
      isArmstrong(copy,digit);
        input.close();
    }
}
