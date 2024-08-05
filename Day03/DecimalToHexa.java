import java.util.Scanner;
class DecimalToHexa{

    public static String decimalToHexa(int decimal){
        String hexa = Integer.toHexString(decimal).toUpperCase();
        return hexa;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number : ");
        int n = sc.nextInt();
        System.out.println("\nThe value of "+n+" is in Hexadecimal = "+decimalToHexa(n));
    }

}