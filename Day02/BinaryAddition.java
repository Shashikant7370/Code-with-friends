import java.util.Scanner;
class BinaryAddition{
    public static String binaryAddition(String b1,String b2){
            //convert binary string into number
            int num1 = Integer.parseInt(b1, 2);
            int num2 = Integer.parseInt(b2, 2);

            //add both number
            int sum = num1+num2;
            
            //convert number into binary format and return it
            return Integer.toBinaryString(sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("************* Please enter in binary Format ***************");
        System.out.print("Enter first binary number :");
        String b1 = sc.next();
        System.out.print("Enter second binary number :");
        String b2 = sc.next();
        System.out.println("The addition of "+ b1 +" and "+ b2 +" is " + binaryAddition(b1, b2));
    }
}