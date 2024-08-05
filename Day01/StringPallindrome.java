import java.util.*;
class StringPallindrome{

    public static Boolean pallindrome(String str){
        int j=str.length()-1;
        for(int i=0;i<j;i++,j--){
            if(!(str.charAt(i)==str.charAt(j))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any text:");
        String str = sc.nextLine();
        Boolean re= pallindrome(str);
        if(re==true){
            System.out.println("Pallindrome");
        }else{
            System.out.println("Not Pallindrome");
        }
    }
}