
import java.util.Scanner;

/*Write a Java program to create a class called Point with instance variables x and y. Implement overloaded constructors:
One constructor takes int parameters.
Another constructor takes double parameters.
Print the values of the variables for each constructor.*/

class Point{

    double x,y;

    Point(int n1,int n2){
        x=n1;
        y=n2;
    }

    Point(double num1,double num2){
        this.x=num1;
        this.y=num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b;
        System.out.print("Enter the value of a :");
        a= sc.nextDouble();
        System.out.print("Enter the value of b :");
        b= sc.nextDouble();

        //two parameterise constructor for int datatype
        Point obj1 = new Point((int)a,(int)b);
        System.out.println(""+(int)obj1.x);
        System.out.println(""+(int)obj1.y);

        
        //two parameterise constructor for double datatype
        Point obj2 = new Point(a,b);
        System.out.println(""+obj2.x);
        System.out.println(""+obj2.y);
    }

}