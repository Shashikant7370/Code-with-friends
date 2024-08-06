class HexaToOctal{
    public static int hexaToOctal(String hexa){
        String hexaDigits = "0123456789ABCDEF";
         hexa = hexa.toUpperCase();
        int val = 0;
        for (int i = 0; i < hexa.length(); i++) {
            char c = hexa.charAt(i);
            int s = hexaDigits.indexOf(c);
            val=16*val+s; 
        }
        return val;
    }
    public static void main(String[] args) {
        String h = "5F";
        int decimal = hexaToOctal(h);
        
        int [] octal_num = new int[50];
        int i=1;
        while(decimal!=0){
            octal_num[i] =decimal%8;
            i++;
            decimal = decimal/8;
        }

        for(int j=i-1;j!=0;j--){
            System.out.print(+octal_num[j]);
        }

    }
}