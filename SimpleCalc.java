import java.util.Scanner;

class SimpleCalc{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float num1,num2;
        System.out.println("Enter the 2 numbers one by one");
        num1 = input.nextFloat();
        num2 = input.nextFloat();
        System.out.println("Choose the operator + , - , * , / , % ");
        String opr = input.next();
        if(opr.equals("+")){
            System.out.println("The result is " + (num1+num2));
        }
        else if(opr.equals("-")){
            System.out.println("The result is "+ (num1 - num2));
        }
        else if(opr.equals("*")){
            System.out.println("The result is "+ (num1 * num2));
        }
        else if(opr.equals("/")){
            System.out.println("The result is "+ (num1 / num2));
        }
        else if(opr.equals("%")){
            System.out.println("The result is "+ (num1 % num2));
        }
        else{
            System.out.println("Enter valid Arithmetic Operator");
        }

        
        input.close();
    }
}