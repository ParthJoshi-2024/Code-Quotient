import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the year to check whether it is leap or not");
        int year = input.nextInt();
        if(year % 100 == 0){
            if(year % 400 == 0){
                System.out.println("Leap Year");
            }
            else{
                System.out.println("Not Leap");
            }
        }
        else if(year % 4 == 0 ){
            System.out.println("Leap Year");
        }
        
        else{
            System.out.println("Leap Year");
        }
        input.close();
    }
}
