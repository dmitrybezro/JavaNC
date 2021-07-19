public class MatrixAddition implements Matrix{
    private final int[][] matrixAdd;

    public MatrixAddition(int[][] matrix) {
        this.matrixAdd = matrix;
    }

    public MatrixAddition(int m, int n) {
        this.matrixAdd = new int[m][n];
    }

    public MatrixAddition addMatrix(Matrix TwoMatrix) {
        MatrixAddition ResultMatrix = new MatrixAddition(matrixAdd.length, matrixAdd[0].length);

        for(int i = 0; i < matrixAdd.length; i++){
            for(int j = 0; j < matrixAdd[0].length; j++){
                ResultMatrix.setElement(TwoMatrix.getElement(i,j) + this.matrixAdd[i][j],i,j);
            }
        }

        return ResultMatrix;
    }

    @Override
    public int getElement(int i, int j) throws ArrayIndexOutOfBoundsException {
        return matrixAdd[i][j];
    }

    protected void setElement(int element, int i, int j) {
        this.matrixAdd[i][j] = element;
    }
}
