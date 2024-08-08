/*Write a Java program to create a class called Classroom with instance variables className and students (an array of strings). Implement a parameterized constructor that initializes these variables. Print the values of the variables.*/

class ClassRoom{
    String className;
    String [] students;
    ClassRoom(String cl_name,String []str){
        className = cl_name;
        students  = str;
    }

    public void printDetails(){
        System.out.println("ClassRoom Name : "+className);

        System.out.println("Students : ");
        for(String student :students){
            System.out.println("Name : "+student);
        }
    }
    public static void main(String[] args) {
        String []str = {"shashikant","ashutosh","Vikram","Sunni","Sukhnandan"};
        ClassRoom cl = new ClassRoom("B-2",str);

        cl.printDetails();

    }
}