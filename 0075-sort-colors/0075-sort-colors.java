class Solution {
    public void sortColors(int[] nums) {
        int[] count= new int[3];
        for(int x:nums){
            if(x==0){
                count[0]++;
            }
            else if(x==1){
                count[1]++;
            }
            else{
                count[2]++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(count[0]>0){
                nums[i]=0;
                count[0]--;
            }
            else if(count[1]>0){
                nums[i]=1;
                count[1]--;
            }
            else{
                nums[i]=2;
                count[2]--;
            }
        }
    }
}