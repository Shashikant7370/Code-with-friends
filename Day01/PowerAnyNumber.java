import java.util.*;
class PowerAnyNumber{

    public static int findPower(int a,int b){
        return (int)(Math.pow(a, b));
    }

    public static void main(String[] str){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number :");
        int a = sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Power = "+findPower(a, b));
    }

}