
import java.util.ArrayList;
class BookCollection{
    String title,author,ISBN;
    static ArrayList<BookCollection> collection = new ArrayList<>();;

    BookCollection(String title,String author , String ISBN){
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getISBN(){
       return ISBN;
    }

    public static void addCollection(BookCollection book){
        collection.add(book);
    }

    public static void removeCollection(BookCollection book){
        if(collection.remove(book)){}
        else{
            System.out.println("Book not found");
        }
    }

    public static void displayCollection(){
        if(collection.isEmpty()){
            System.out.println("No books in the collections.");
        }else{
            for(BookCollection book:collection){
                System.out.println("\nTitle = "+book.author+" , "+"Author = "+book.author+" , "+"ISBN = "+book.ISBN);
            }
        }
    }

    public static void main(String [] args){

        BookCollection book1= new BookCollection("Java","shashikant","98344-394");
        BookCollection book2= new BookCollection("C++","chandan","983df-309");
        BookCollection.addCollection(book1);
        BookCollection.addCollection(book2);
        BookCollection.displayCollection(); 

        
    }
}