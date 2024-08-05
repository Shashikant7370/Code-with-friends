import java.util.Arrays;
class FindThirdLarNum{

    public static void main(String[] args) {
        int [] numArr = {8,55,6};
        int thirdLargest;

        //remove duplicate value from array
        int [] distinctArr = Arrays.stream(numArr).distinct().toArray();

        
        if(distinctArr.length<3){
            thirdLargest=Integer.MIN_VALUE;
        }
        else{
            Arrays.sort(distinctArr);
            thirdLargest = distinctArr[distinctArr.length-3];
        }
        if(thirdLargest!=Integer.MIN_VALUE){
            System.out.println("Third Largest Number is = "+thirdLargest);
        }else{
            System.out.println("Array has no third largest number.");
        }
    }
}