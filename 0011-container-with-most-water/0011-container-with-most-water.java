class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j =height.length-1;
        int product=0;
        while(i<j){
                int a=Math.min(height[i],height[j]);
                int b=j-i;
                product=Math.max(product,a * b);
            if(height[i]<height[j]){
                 i++;
            }
            else{
                j--;
            }
        }
        return product;
    }
}