import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Character");
        char ch = input.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println("Upper Case");
        }
        else{
            System.out.println("Lower Case");
        }

        
        input.close();
    }
}
