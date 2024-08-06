import java.util.*;
class CountEvenOdd{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even=0,odd=0;

        System.out.print("Enter number to give the size of array : ");
        int n = sc.nextInt();
        Integer [] arr = new  Integer[n];

        System.out.println("Enter the array elements :");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }else{
                odd++;
            }
        }

        System.out.println("Even number = "+even);
        System.out.println("Odd number = "+odd);
    }
}