class ParityBit{
    public static void main(String args[]){
        int num = 7;
        System.out.println(parityOne(num));
        System.out.println(parityTwo(num));
        System.out.println(parityThree(num));
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

    public static int parityThree(int x){
        x ^= x >>> 16;
        x ^= x >>> 8;
        x ^= x >>> 4;
        x ^= x >>> 2;
        x ^= x >>> 1;
        return x & 0x1;
    }
}