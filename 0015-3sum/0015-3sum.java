class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res =  new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            Set<Integer> set = new HashSet<>();
            for(int j=i+1;j<nums.length;j++){
                int third= -(nums[i]+nums[j]);
                if(set.contains(third)){
                    List<Integer> arr = new ArrayList<>();
                    arr.add(nums[i]);
                    arr.add(nums[j]);
                    arr.add(third);
                    Collections.sort(arr);
                    boolean isadded=res.add(arr);
                    if(isadded){
                        result.add(arr);
                    }
                }
                set.add(nums[j]);
            }
        }
        return result;
    }
}