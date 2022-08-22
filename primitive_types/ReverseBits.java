class ReverseBits{
    public static void main(String args[]){
        int num = 0b00000010100101000001111010011100;
        System.out.println(reverseBits(num));
    }

    public static int reverseBits(int x){
        int res = 0;
        for(int i=0;i<32;i++){
            res<<=1;
            int temp = x&1;
            if(temp==1) res ++;
            x>>>=1;
        }
        return res;
    }
}