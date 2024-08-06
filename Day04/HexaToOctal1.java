import java.util.*;
class HexaToOctal1{

    public static void hexaToOctal(String hexa){

        int decimal = Integer.parseInt(hexa,16);
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal number = "+octal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hexadecimal value :");
        String hexa = sc.next();
        hexaToOctal(hexa);
    }
}