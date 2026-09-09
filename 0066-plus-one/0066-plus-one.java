class Solution {
    public int[] plusOne(int[] arr) {
        int n=arr.length-1;
        if(arr[n]!=9){
            arr[n]+=1;
            return arr;
        }
        ArrayList<Integer> al =new ArrayList<>();
        int carry=1;
        al.add(0);
        for(int i=n-1;i>=0;i--){
            if(carry==1){
                if(arr[i]==9){
                    al.add(0,0);
                }
                else{
                    carry=0;
                    al.add(0,arr[i]+=1);
                }
                continue;
            }
            al.add(0,arr[i]);
        }
        if(carry==1){
            al.add(0,1);
        }
        int[] result =new int[al.size()];
        for(int i=0;i<result.length;i++){
            result[i]=al.get(i);
        }
        return result;
        }
    }