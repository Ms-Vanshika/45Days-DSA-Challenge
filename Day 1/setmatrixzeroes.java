class setmatrixzeroes {
    public void setZeroes(int[][] matrix) {
        boolean[] rows = new boolean[matrix.length];
        boolean[] cols = new boolean[matrix[0].length];
        for(int i = 0; i < matrix.length ; i++){
            for(int j = 0; j < matrix[0].length ;j++){
                if(matrix[i][j] == 0){
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        for(int i = 0;i<matrix.length; i++){
            if(rows[i]){
                setrow(i,matrix);
            }
        }
        for(int j = 0;j<matrix[0].length; j++){
            if(cols[j]){
                setcol(j,matrix);
            }
        }
    }

    public void setrow(int row,int[][] matrix){
        for(int j = 0;j < matrix[0].length ; j++){
            matrix[row][j] = 0;
        }
    }
    public void setcol(int col,int[][] matrix){
        for(int i = 0;i < matrix.length ; i++){
            matrix[i][col] = 0;
        }
    }
}
