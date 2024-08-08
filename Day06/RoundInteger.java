
import java.util.Scanner;

//Write a Java program to round up integer division results.

class RoundInteger{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b,c;
        System.out.print("Enter three number :");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        float avg = (a+b+c)/3;
        int round = Math.round(avg);
        System.out.println("Rounded value : "+round);
    }
}