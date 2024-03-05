class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int rows = matrix.length;
        int columns = matrix[0].length;
        int search_row = 0;
        for(int i = 0; i < rows; i++) {
            if(matrix[i][columns - 1] >= target) {
                search_row = i;
                break;
            }
        }
        for(int i=0;i<columns;i++){
            if(target == matrix[search_row][i])
                return true;
        }
        return false;
    }



}