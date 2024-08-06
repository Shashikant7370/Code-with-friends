
import java.util.Scanner;

class Hexagon{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the side of hexagon : ");
        int s = sc.nextInt();

        //Area of a hexagon = (6 * s^2)/(4*tan(π/6))

        float area = (float)((6*Math.pow(s, 2))/(4*Math.tan(Math.PI/6)));
        System.out.println("Area of Hexagon = " + area);
    }
}