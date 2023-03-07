import java.util.Scanner;
// Other imports go here
// Do NOT change the class name
public class Vowel{
    public static void main(String[] args)
    {
        // Write your code here
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the character");
      char ch = input.next().charAt(0);
      switch(ch){
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
        case 'A':
        case 'I':
        case 'O':
        case 'U':
          System.out.println("vowel");
          break;
        default:
          System.out.println("consonant");
      }
      input.close();
    }
}