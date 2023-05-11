import java.util.Arrays;

public class QST22 {
    //Write a Java program to calculate the average value of array elements//

    public static void main(String[] args) {
        average();
    }

    public static void average(){


        int a[] = new int[5];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=60;
        System.out.println("Average value of arrays is =" + Arrays.stream(a).sum()/5);

        }}
