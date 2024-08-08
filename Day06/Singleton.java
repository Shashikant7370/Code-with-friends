/*Write a Java program to create a class called Singleton that ensures only one instance of the class can be created. Implement a private constructor and a public static method to get the single instance of the class. Print a message indicating the creation of the instance.
*/

class Singleton{
    static int num;

    private Singleton(){
        num = 100;
    }

    public static int getSingleton(){
        return num;
    }

    public static void main(String[] args) {
        Singleton obj = new Singleton();
        System.out.println(obj.getSingleton());
    }
}