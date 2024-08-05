import java.util.*;
class NumberInWord{

    public static void convetNumberToWord(int n){
        StringBuilder  words = new StringBuilder(); 

        String [] ones = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String [] tenTo20 = {"Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen"};
        String []  tens = {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninty"};

       
       if(n<0){
        System.out.println("Invalid input & Out of Range.");
       }
       if(n==0){
        System.out.println("Zero");
       }
        if(n/1000>0){
            words.append(ones[n/1000]+" Thousand ");
            n=n%1000;
        }
        if(n/100>0){
            words.append(ones[n/100]+" Hundred ");
            n=n%100;
        }
        if(n>0){
            if(n<10){
                words.append(ones[n]+" ");
            }else if(n<20){
                words.append(tenTo20[n%10]+" ");
            }else{
                words.append(tens[n/10]+" ");
                if(n%10>0){
                    words.append(ones[n%10]+" ");
                }
            }
        }


        System.out.println(words);
 }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number between (0 - 999) :");
        int n = sc.nextInt();
        convetNumberToWord(n);
    }
}