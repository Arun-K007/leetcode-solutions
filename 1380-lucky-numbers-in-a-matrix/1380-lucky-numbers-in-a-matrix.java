class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){ 
                lucky(i,j,matrix,arr);
            }
        }
        
        return arr;
    }
    public static  void lucky(int i,int j,int[][] matrix,ArrayList<Integer> arr){
        boolean flag=true;
        for(int row=0;row<matrix[i].length;row++){
            if(matrix[i][j]>matrix[i][row]){
                flag=false;
            }
        }
        for(int col=0;col<matrix.length;col++){
            if(matrix[i][j]<matrix[col][j]){
                flag=false;
            }
        }
        if(flag){
            arr.add(matrix[i][j]);
        }
    }
}