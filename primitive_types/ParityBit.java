class ParityBit{
    public static void main(String args[]){
        int num = 6;
        System.out.println(parityOne(num));
        System.out.println(parityTwo(num));
    }

    public static int parityOne(int x){
        int res = 0;
        while(x!=0){
            res ^=(x&1);
            x>>>=1;
        }
        return res;
    }

    public static int parityTwo(int x){
        int res = 0;
        while(x!=0){
            res ^=1;
            x &=(x-1);
        }
        return res;
    }
}