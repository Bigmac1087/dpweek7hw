import java.util.Scanner;

public class QST11 {
    /*Input any alphabet from “A" to “F” and print their city name accordingly (use if else) ifany
other alphabet should be invalid entry.*/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter any alphabet :");

        String city = input.next();
        if(city.equalsIgnoreCase("a")){
            System.out.println("Ahemdabad");
        } else if (city.equalsIgnoreCase("b")){
            System.out.println("Bhopal");}
        else if (city.equalsIgnoreCase("c")){
            System.out.println("Chennai");}
        else if (city.equalsIgnoreCase("d")){
            System.out.println("Delhi");}
        else if (city.equalsIgnoreCase("e")){
            System.out.println("Ellora");}
        else if (city.equalsIgnoreCase("f")){
            System.out.println("Faridabad");}
        else {
            System.out.println("invalid entry");
        }
    }
}

