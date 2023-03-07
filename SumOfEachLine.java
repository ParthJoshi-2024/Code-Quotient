import java.util.Scanner;
public class SumOfEachLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int num;
        for(int i = 1;i<=n;i++){
            int sum = 0;
            num = input.nextInt();
            while(num!=0){
                sum = sum + num%10;
                num = num/10;
            }
            System.out.println(sum);
        }
        input.close();
    }
}
