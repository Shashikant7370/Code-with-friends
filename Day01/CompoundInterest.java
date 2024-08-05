import java.util.*;
class CompoundInterest{

    public static double  compoundInterest(double p,double  r,double  t){
        double amount = p*Math.pow((1+r/100),t);
        return amount-p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle amount:");
        double p = sc.nextDouble();
        System.out.print("Enter rate:");
        double r = sc.nextDouble();
        System.out.print("Enter time");
        double t = sc.nextDouble();
        double result = compoundInterest(p, r, t);
        System.out.print("Compound Interest = "+result);
    }
}