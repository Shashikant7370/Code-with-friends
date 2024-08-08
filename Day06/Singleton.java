/*Write a Java program to create a class called Singleton that ensures only one instance of the class can be created. Implement a private constructor and a public static method to get the single instance of the class. Print a message indicating the creation of the instance.
*/

class Singleton{
    private static Singleton instance;

    private Singleton(){
        System.out.println("Instance is created");
    }

    public static Singleton getSingleton(){
        if(instance==null){
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton obj =  Singleton.getSingleton();
        Singleton obj1 = Singleton.getSingleton();
        if(obj==obj1){
            System.out.println("Both instances is Same");
        }else{
            System.out.println("Instances are different");
        }
    }
}