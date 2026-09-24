class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int mid=0;
        int[] arr= new int[m+n];
        int i=0;
        int j=0;
        int index=0;
        while(i<nums1.length || j<nums2.length){
            if(i>=nums1.length ){
                arr[index]=nums2[j];
                j++;
            }
            else if(j>=nums2.length){
                arr[index] =nums1[i];
                i++;
            }
            else{
                if(nums1[i]>nums2[j]){
                    arr[index]=nums2[j];
                    j++;
                }
                else{
                    arr[index]=nums1[i];
                    i++;
                }
            }
            index++;
        }
        if(arr.length%2==0){
            int a=(arr.length/2);
            int b=a-1;
             return (double)(arr[a]+arr[b])/2;
            
        }
        else{
            int cal=(arr.length/2);
            mid=arr[cal];

        }

        return mid;
    }
}