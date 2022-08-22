class SwapBits{
    public static void main(String args[]){
        int num = 6;//110 -> 101
        System.out.println(swapBits(num,1,0));
    }

    public static int swapBits(int x, int i, int j){
        if(((x>>>i) & 1) != ((x>>>j) & 1)){
            long bitMask = 1L << i | 1L << j;
            x^=bitMask;
        }
        return x;
    }
}