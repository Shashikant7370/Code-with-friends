class CountChar{

    public static void count_Characters(String str){
        char[] charArr = str.toCharArray();
        int letters=0, spaces = 0,  numbers=0, other =0;
        for (int i = 0; i < charArr.length; i++) {
            if(Character.isLetter(charArr[i])){
               letters++;
            }
            else if(Character.isSpaceChar(charArr[i])){
                spaces++;
            }
            else if(Character.isDigit(charArr[i])){
                numbers++;
            }else{
                other++;
            }

            
        }

        System.out.println("Letters = "+letters);
        System.out.println("Spaces = "+spaces);
        System.out.println("Numbers = "+numbers);
        System.out.println("Other = "+other);
    }

    public static void main(String[] args) {
        count_Characters("shasi dfa , . 954f6 ");
    }
}