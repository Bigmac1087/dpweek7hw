import java.util.Scanner;

public class QST1 {
    //Write a java program that tells us that Input number is odd or even? HINT: use ternary
    //operator (? :)//

    public static void main(String[] args) {
        //To take input from the user
        //Create an object of scanner class
        Scanner input = new Scanner(System.in);
        int a; //Declare a variable
        System.out.println("Enter a number and will divide by 2 : ");
        a = input.nextInt();

        if (a % 2 == 0) {
            System.out.println("The answer is in even");
        } else {
            System.out.println(" The answer is in odd");
        }


    }}









