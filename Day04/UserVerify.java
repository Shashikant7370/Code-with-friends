import java.util.Scanner;
class UserVerify{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String correctEmail="sashikantkumarbth00@gmail.com";
        String correctPassword  = "password123";

        String email=null,password=null;
        
        while(email==null || password==null){
            if(email==null){
                System.out.print("Enter your email : ");
                email = sc.next();
            }

            if(password==null){
                System.out.print("Enter your password : ");
                password = sc.next();

            }


            if((email.equals(correctEmail)) && (password.equals(correctPassword))){
                System.out.println("Successfully Login.");
            }else{
                System.out.println("Invalid email or password");
            }
            
        }
    }      
}