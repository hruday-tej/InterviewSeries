class Solution {
    public int reverse(int x) {
        // int m = x;
        // int n = 0;
        // if (x<0){
        //     x = -x;
        // }
        // while(x>0){
        //     if(n>=Math.pow(2,30)-1){
        //         return 0;
        //     }
        //     int f = x%10;
        //     n = n*10 + f;
        //     x=x/10;
        // }
        // if(n>=Math.pow(2,30)-1){
        //         return 0;
        //     }
        // if(m<0 ){
        //     return -n;
        // }
        // return n;
        int result = 0;

        while (x != 0)
        {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result)
            { return 0; }
            result = newResult;
            x = x / 10;
        }

        return result;
    }
}
