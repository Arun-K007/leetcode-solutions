class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[26];
        for (int x:s.toCharArray()){
            arr[x-'a']++;
        }
        for(int x:t.toCharArray()){
            arr[x-'a']--;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}