public class MatrixTranspose implements Matrix{
    private final int[][] matrixTrans;
    public MatrixTranspose(int[][] matrix) {
        matrixTrans = matrix;
    }

    public MatrixTranspose(int m, int n) {
        this.matrixTrans = new int[m][n];
    }

    public MatrixTranspose transposeMatrix(Matrix TwoMatrix) {
        MatrixTranspose ResultMatrix = new MatrixTranspose(matrixTrans.length, matrixTrans[0].length);

        for(int i = 0; i < matrixTrans.length; i++){
            for(int j = i; j < matrixTrans[0].length; j++){
                int tmp = matrixTrans[i][j];
                ResultMatrix.setElement(TwoMatrix.getElement(j,i), i, j);
                ResultMatrix.setElement(tmp, j, i);
            }
        }

        return ResultMatrix;
    }

    protected void setElement(int element, int i, int j) {
        this.matrixTrans[i][j] = element;
    }

    @Override
    public int getElement(int i, int j) throws ArrayIndexOutOfBoundsException {
        return matrixTrans[i][j];
    }
}
