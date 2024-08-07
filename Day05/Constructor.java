class Constructor{
    static int num;
    
    Constructor(int n){
        this.num=n;
    }

    Constructor(){
        Constructor con = new Constructor(58);
    }

    public static void main(String[] args) {
        Constructor obj=new Constructor();
        System.out.println(obj.num);
    }
}