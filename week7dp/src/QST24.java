import java.util.Scanner;

public class QST24 {
    // Write java program using for loop and print surname 9 times.//

    public static void main(String[] args) {
        week();
    }

        public static void week(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your surname");
            String Surname = sc.next();

            for(int b =1; b<9; b++){

                System.out.println(Surname);

            }
    }
}
