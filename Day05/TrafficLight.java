import java.util.*;
class TrafficLight{
    static String colour; static Integer duration;

    TrafficLight(){
        this.colour = "Unknown Color";
        this.duration = null;
    }

    public static void setColor(String c){
        colour = c;
    }

    public static String getColor(){
        return colour;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TrafficLight color = new TrafficLight();
        System.out.print("Enter color name : ");
        String clr =  sc.nextLine();
        color.setColor(clr);

        String rs = getColor();
        if(rs.equals("red")||rs.equals("Red")){
            System.out.println("Colour is red.\n");
        }
        else if (rs.equals("green") || rs.equals("Green")) {
            System.out.println("Colour is green.\n");
        }else{
            System.out.println("Other colour.\n");
        }
    }
}