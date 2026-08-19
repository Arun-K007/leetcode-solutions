class Solution {
    public int findLucky(int[] arr) {
        int [] freq=new int[501];
        int lucky=-1;
        for(int x:arr){
            freq[x]++;
        } 
        for(int i=0;i<freq.length;i++){
            if(freq[i]==i){
                lucky=freq[i];
            }
            if(lucky==0){
                lucky=-1;
            }
        }
        return lucky;
    }
}