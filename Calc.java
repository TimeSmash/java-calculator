import java.util.Scanner;
//necessary for the exponentiate function, as Java does not have a natural exponent operator


public class Calc {
    // instance fields
    double num1;
    double num2;
    
    // constructor method
    public Calc(double firstNum, double secondNum) {
      num1 = firstNum;
      num2 = secondNum;
    }

    //class methods
    public double add(double firstNum, double secondNum){
      return firstNum + secondNum;
    }

    public double subtract(double firstNum, double secondNum){
      return firstNum - secondNum;
    }

    public double multiply(double firstNum, double secondNum){
      return firstNum * secondNum;
    }

    public long expontentiate(double firstNum, double secondNum){
      // Math.pow returns a double, so use typecasting to account for large numbers
      
      long exponentProd = (long) Math.pow(firstNum, secondNum);
      
      return exponentProd;
    }

    public double divide(double firstNum,double secondNum){
      return firstNum / secondNum;
    }

    public static void mainMenuMessage(){
      System.out.println("Returning to main menu...");
    }
    public static void wholeThing(){
      System.out.println("Welcome to the Java CLI Calculator! \n This calculator performs operations on two numbers. \n Please type your first number \n Type 'exit' to exit at anytime! \n");
          Scanner sc1 = new Scanner(System.in);
          String firstInput = sc1.next();
          double firstNum = 0.0; 
          
          if(firstInput.equals("exit")){
            System.exit(0);
          } else{
            firstNum = Double.parseDouble(firstInput);
          }

          // double firstNum = sc1.nextInt();
      
          System.out.println("\nGreat! Now input your second number.\n");
          Scanner sc2 = new Scanner(System.in);
          String secondInput = sc2.next();
          double secondNum = 0.0;

          if(secondInput.equals("exit")){
            System.exit(0);
          } else{
            secondNum = Double.parseDouble(secondInput);
          }

          Calc calc1 = new Calc(firstNum, secondNum);

          System.out.println("\nAwesome! Now, choose the operation you want.\n Type + for addition\n Type - for subtraction\n Type * for multiplication\n Type ** to raise the first number to the power of the second\n Type / to divide");

          Scanner sc3 = new Scanner(System.in);
          String operator = sc3.next();
          
           switch (operator){
             case "+":
                System.out.println(calc1.num1 + " plus " + calc1.num2 + " equals "+ calc1.num1 + " plus " + calc1.num2 + " equals "+calc1.add(firstNum, secondNum));
                mainMenuMessage();
                wholeThing();
                break;
              case "-":
                System.out.println(calc1.num1 + " minus " + calc1.num2 + " equals "+calc1.subtract(firstNum, secondNum));
                mainMenuMessage();
                wholeThing();
                break;
              case "*":
                System.out.println(calc1.num1 + " multiplied by " + calc1.num2 + " equals "+calc1.multiply(firstNum, secondNum));
                mainMenuMessage();
                wholeThing();
                break;
              case "**":
                System.out.println(calc1.num1 + " raised to the power of " + calc1.num2 + " equals "+calc1.expontentiate(firstNum, secondNum));
                mainMenuMessage();
                wholeThing();
                break;
              case "/":
                System.out.println(calc1.num1 + " divided by " + calc1.num2 + " equals "+calc1.divide(firstNum, secondNum));
                mainMenuMessage();
                wholeThing();
                break;
              default:
                System.out.println("Input not recognized. Returning to main menu...");
                wholeThing();
                break;
           }
          //  System.out("Press A to return to main menu.")
    }
    //main
    public static void main(String[] args) {
      // System.out.println("Type something!");
      // Scanner sc = new Scanner(System.in);
      // double i = sc.nextInt();
      // System.out.println("You typed " + i +"!");

      wholeThing();
  }
}