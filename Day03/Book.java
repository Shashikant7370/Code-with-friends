class Book{
    String title,author;
    Float price;

    Book(){
        this.title="Book(Default)";
        this.author = "Shashikant(Default)";
        this.price = 100.5f;
    }

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    Book(String title, String author, Float price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {        
        Book obj =new Book();
        Book b1 =new Book("Bhagavad Gita","Veda-Vyasa");
        Book b2 = new Book("Ramayan","Valmiki",1000.50f);

        System.out.println("********* This is come from object obj (default Constructor) **********");
        System.out.println("Title : "+obj.title);
        System.out.println("Author : "+obj.author);
        System.out.println("Price : "+obj.price);

        System.out.println("\n********* This is come from object b1 **********");
        System.out.println("Title : "+b1.title);
        System.out.println("Author : "+b1.author);

        System.out.println("\n********* This is come from object b2 **********");
        System.out.println("Title : "+b2.title);
        System.out.println("Author : "+b2.author);
        System.out.println("Price : "+b2.price);
    }

}