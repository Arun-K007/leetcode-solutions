class Solution {
    public int reverse(int x) {
        int n=x;
        if(x<0){
            n=(-1)*x;
        }
       
        long num =0;
        while(n>0){
            int digit =n%10;
            num =(num*10)+digit;
            n/=10;
        }
        if( num >Integer.MAX_VALUE-1){
            return 0;
        }
 
        if(x<0){
            num *=-1;
        }

        return (int)num;
        
    }
}