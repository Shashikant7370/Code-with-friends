class CatDetails{

    String name;
    int age;

    CatDetails() {
        name="Unknown";
        age=0;
    }

    public static void main(String[] args) {
        CatDetails cat = new CatDetails();
        System.out.println("Cat Name : "+cat.name);
        System.out.println("Cat age : "+cat.age);
    }
}