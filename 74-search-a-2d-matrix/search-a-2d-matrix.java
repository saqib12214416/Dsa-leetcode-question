class Solution{
    public boolean searchMatrix(int[][] matrix, int target){
        int n=matrix.length;
        int m=matrix[0].length;
        int low=0;
        int high=(n*m)-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int row=mid/m;
            int col=mid%m;
            if(matrix[row][col]==target)return true;
            else if(matrix[row][col]<target)low=mid+1;
            else high=mid-1;
        }
        return false;
    }
}






















// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//         int n=matrix.length;
//         int m=matrix[0].length;
//         for(int i=0;i<n;i++){
//             if(matrix[i][0]<=target&&target<=matrix[i][m-1])
//             return bs(matrix[i],target);
//         }
//         return false;
//     }
//     public boolean bs(int[] matrix,int target){
//         int i=0;
//         int j=matrix.length-1;
//         while(i<=j){
//             int mid=(i+j)/2;
//             if(matrix[mid]==target)return true;
//             if(matrix[mid]<target)i=mid+1;
//             else{
//                 j=mid-1;
//             }
//         }
// return false;
//     }
// }