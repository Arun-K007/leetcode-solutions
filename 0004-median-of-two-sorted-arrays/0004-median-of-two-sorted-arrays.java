class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int mid=0;
        int[] arr= new int[m+n];
        int index=0;
        for(int i=0;i<nums1.length;i++){
            arr[i]=nums1[i];
            index=i;
        }
        if(nums1.length>0)index+=1;
        
        for(int i=0;i<nums2.length;i++){

            arr[index]=nums2[i];
            if(index<arr.length-1){
                index++;
            }
        }
        Arrays.sort(arr);
        
        
        if(arr.length%2==0){
            int i=(arr.length/2);
            int j=i-1;
             return (double)(arr[i]+arr[j])/2;
            
        }
        else{
            int cal=(arr.length/2);
            mid=arr[cal];

        }

        return mid;
    }
}