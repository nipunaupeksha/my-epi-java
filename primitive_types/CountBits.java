class CountBits{
    public static void main(String args[]){
        int num = 6;
        System.out.println(countBits(num));
    }

    public static short countBits(int x){
        short numBits = 0;
        while(x!=0){
            numBits+=1;
            x >>>= 1;
        }
        return numBits;
    }
}