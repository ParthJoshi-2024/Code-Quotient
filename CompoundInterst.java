import java.util.Scanner;
public class CompoundInterst{
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter principle rate and time one by one");
    double principle,rate,time;
    principle = input.nextFloat();
    rate = input.nextFloat();
    time = input.nextFloat();
    double amount  = principle * Math.pow((1 + rate/100),time);
    System.out.format("%.1f" , amount);

    input.close();
}
}


// Other imports go here
// Do NOT change the class name