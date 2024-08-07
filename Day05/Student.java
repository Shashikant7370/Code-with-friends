
import java.util.Scanner;

class Student{
    static String name,grade;


    Student(String name){
        this.name = name;
    }

    public static void setGrade(String ch){
        grade = ch;
    }

    public static String getGrade(){
        return grade;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String n = sc.nextLine();
        Student student = new Student(n);

        System.out.print("Enter your grade : ");
        String ch = sc.next();

        //set grade
        setGrade(ch);

        System.out.println("Name : "+ student.name);
        //get grade
        System.out.println("Grade : "+ getGrade());
    }
}