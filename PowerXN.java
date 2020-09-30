class Solution {
    
    public static double pow(double x, int n){
        if(n==0)return 1;
        if(n==1)return x;
        double m = pow(x,n/2);
        
        if(n%2 == 0)return m*m;
        else return x*m*m;
    }
    
    public double myPow(double x, int n) {
        if (n>0) {
            double calc = pow(x,n);
            return calc;
        }
        else{
            double calc = pow(x,n);
            return 1/calc;
        }
    }
}
