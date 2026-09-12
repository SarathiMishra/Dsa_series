class Solution {
    public int[] findPeakGrid(int[][] mat) {
       int m = mat.length;
       int n = mat[0].length;

       int low = 0;
       int high = n-1;

       while(low <= high){
         int mid = low+(high - low)/2;

         //Find maximum element in coloumn mid
         int maxRow = 0;

         //Find maximum element in that coloumn
         for(int i=1; i<m; i++){
            if(mat[i][mid] > mat[maxRow][mid]){
                maxRow = i;
            }
         }
          // Current maximum element
          //(condition) ? valueIfTrue : valueIfFalse; (Ternary operater)
          int left = (mid > 0) ? mat[maxRow][mid - 1] : -1;
          int right = (mid < n-1) ? mat[maxRow][mid+1] : 1;

         // Check if current element is a peak
         if(mat[maxRow][mid] > left && mat[maxRow][mid] > right){
            return new int[]{maxRow, mid};
         }
         // Move toward the larger neighbor
         if(left > mat[maxRow][mid]){
            high = mid-1;
         }else{
            low = mid+1;
         }
        }
        return new int[]{-1, -1};
    }
}