import java.util.Scanner;
class DogDetails{
    String name,color;

    DogDetails(String name,String color){
        this.name = name;
        this.color = color;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Dog name :");
        String dogName = sc.nextLine(); 
        System.out.print("Enter dog color :");
        String dogColor = sc.nextLine();
        DogDetails dog = new DogDetails(dogName, dogColor);

        //print dog name and color
        System.out.println("Dog name : "+dog.name);
        System.out.println("Dog colr : "+dog.color);
    }

}