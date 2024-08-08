
//Write a Java program to get whole and fractional parts from a double value.

class WholeFractionalPart{

    public static void main(String[] args) {
        double value = 12.28;
        double f_part = value%1;
        double whole_part = value - f_part;
        System.out.println("Real value : "+value);
        System.out.println("Fractional part : "+f_part);
        System.out.println("Integer part : "+whole_part);
    }

}