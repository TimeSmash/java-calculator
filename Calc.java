import java.util.Scanner;

public class Calc {
    // instance fields
    int num1;
    int num2;
    
    // constructor method
    public Calc(int firstNum, int secondNum) {
      num1 = firstNum;
      num2 = secondNum;
    }

    //class methods

    //main
    public static void main(String[] args) {
      System.out.println("Type something!");
      Scanner sc = new Scanner(System.in);
      int i = sc.nextInt();
      System.out.println("You typed " + i +"!");
    }
}