class Fibonacci{
    //This is first way to find fabonacci series
    static int a=0,b=1,c;
    void fabo(int t){
        if(t>=1){
            c=a+b;
            System.out.print(c +" ");
            a=b;
            b=c;
            fabo(t-1);
        }
    }



    //This is the second way to print the fibonacci series

    public static int fibonacci(int t){
        if(t<=1) return t;
        return fibonacci(t-1)+fibonacci(t-2);
    }


    public static void main(String[] args) {
        System.out.print(a+" "+b+" ");
        Fibonacci obj = new Fibonacci();
        obj.fabo(10);


        System.out.println();
        int term = 6;
        for(int i=0;i<term;i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
}