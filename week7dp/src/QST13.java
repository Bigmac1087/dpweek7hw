import java.util.Scanner;

public class QST13 {
    /*Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
find addition, Subtraction, multiplication and division according to their symbol(using if else)*/

public static void av(){
    Scanner s = new Scanner(System.in);
    System.out.println("Enter any one number : ");
    double a = s.nextInt();
    System.out.println("Enter second number : ");
    double b = s.nextInt();
    System.out.println("Enter any Symbol : "); //+,-,/,*//
    String c = s.next();
    if (c.equals("+")){
        System.out.println("addition = "+ (a+b));
    }
    else if(c.equals("-")){
        System.out.println("Subtraction = "+ (a-b));
    }
    else if(c.equals("/")){
        System.out.println("Division= "+ (a/b));}
    else if(c.equals("*")){
        System.out.println("Multiplication= "+ (a*b));}


    else {
        System.out.println("Invalid entry");
    }
}

    public static void main(String[] args) {
    av();

    }}



