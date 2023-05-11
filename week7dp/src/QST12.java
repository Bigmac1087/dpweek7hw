import java.util.Scanner;

public class QST12 {

    public static void main(String[] args) {
        week();
    }


    /*Input any alphabet from “A" to “F” and print their city name accordingly (use Switch) ifany
other alphabet should be invalid entry.*/

    public static void week(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  any Capital Alphabet : ");

        String city = sc.next();

        switch (city){
            case "A":
                System.out.println("Ahemdabad");
                break;
            case "B":
                System.out.println("Banglore");
                break;
            case "C" :
                System.out.println("Chennai");
                break;
            case "D" :
                System.out.println("Delhi");
                break;
            case "E" :
                System.out.println("Ellora");
                break;
            case "F" :
                System.out.println("Ferozpur");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }

}





