class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr =new int[k];
        int max=Integer.MIN_VALUE;
        int key=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int i=0;i<k;i++){
            for(int x:map.keySet()){
                if(map.get(x)>max){
                    max=map.get(x);
                    key=x;
                }
            }
            arr[i]=key;
            map.remove(key);
            max=Integer.MIN_VALUE;
        }
        return arr;
    }
}