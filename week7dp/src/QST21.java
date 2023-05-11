import java.util.Arrays;

public class QST21 {
    //Write a Java program to sum values of an array.//

    public static void main(String[] args) {
        int a[] = new int[5];
        a[0]=15;
        a[1]=25;
        a[2]=35;
        a[3]=45;
        a[4]=55;
        System.out.println(Arrays.stream(a).sum());

    }}
