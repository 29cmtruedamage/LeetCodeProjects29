public class hemmingway {

    public static void main(String[] args){
        int x = 11;
        int y = 213908932;
        int z = (int)Math.pow(2, 31) ;

        System.out.println(
                  "HW von " + x + " = " + hammingWeight(x) +
                "\nHW von " + y + " = " + hammingWeight(y) +
                "\nHM von " + z + " = " + hammingWeight(z)
        );

    }
    public static int hammingWeight(int n) {
        int counter = 0;
        int numberOfBitsInPositivInt = 31; //2-er Komplement int hat 32, aber most
                                           //sig bit ist für neg Zahlen
        for(int i = 1; i <= numberOfBitsInPositivInt; i++){
            if((n & 1) == 1){
                counter = counter + 1;
                n = n>>1;
            }else{
                n = n>>1;
            }
        }
        return counter;
    }
}
