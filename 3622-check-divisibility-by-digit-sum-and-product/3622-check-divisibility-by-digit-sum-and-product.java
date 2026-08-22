class Solution {
    public boolean checkDivisibility(int num) {
        int sum=0;
        int product=1;
        int n=num;
        while(n>0){
           int  digit=n%10;
            sum+=digit;
            product *=digit;
            n/=10;
        }
        int result=sum+product;
            if(num%result==0) return true;
        return false;
    }
}