class SwapNumber{
    //Using Arithmetic operator
    public static void swapTwoNum(int a,int b){
        System.out.println("************Before swapping*********");
        System.out.println("a = " + a + "\n" + "b = " + b);;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("************After swapping*********");
        System.out.println("a = "+a+"\n"+"b = "+b);
    }
    

    //Using XOR operator
    public static void swap2Number(int a,int b){
        System.out.println("************Before swapping*********");
        System.out.println("a = " + a + "\n" + "b = " + b);
            a=a^b;
            b=a^b;
            a=a^b;
        System.out.println("************After swapping*********");
        System.out.println("a = " + a + "\n" + "b = " + b);
    }
    public static void main(String[] args) {
        int a=10,b=20;
        swapTwoNum(a, b);
        swap2Number(a, b);
    }
}
