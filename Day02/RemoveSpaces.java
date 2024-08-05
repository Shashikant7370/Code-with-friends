import java.util.*;
class RemoveSpaces{

    public static String removeWhiteSpaces(String str){
        StringBuilder sb = new StringBuilder();
        char[] charArray = str.toCharArray();

        for(char c:charArray){
            if(!Character.isWhitespace(c)){
                sb.append(c);
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string with white spaces :");
        String str = sc.nextLine();
        System.out.println("\nString without white spaces : "+removeWhiteSpaces(str)+"\n");
    }
}