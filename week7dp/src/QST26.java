import java.util.Scanner;

public class QST26 {
    /*Write a Java program to reverse a word.
Sample Output:
Input a word: dsaf
Reverse word: fasd*/
    public static void main(String[] args) {
        hj();
    }

        public static void hj(){

            Scanner input = new Scanner(System.in);
            System.out.println("Enter a word :");
            String word = input.next();
            String word2="";

            for(int i=0;i<word.length();i++) {

                word2= word.charAt(i)+word2;}

            System.out.println(word2);


    }}




