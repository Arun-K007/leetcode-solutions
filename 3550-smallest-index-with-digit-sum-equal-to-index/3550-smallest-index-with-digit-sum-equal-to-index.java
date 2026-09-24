class Solution {
    public int smallestIndex(int[] nums) {
        int result=-1;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            int sum=0;
            while(n>0){
                int digit=n%10;
                sum+=digit;
                n/=10;
            }
            if(i==sum){
                return i;
            }
        }

        return result;
    }
}