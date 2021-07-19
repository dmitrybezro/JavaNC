public class Main {
    public static void main(String[] args) {
        int[][] arr1 = {{1,2},{3,4}};

        MatrixImpl matrixImpl = new MatrixImpl(arr1);
        MatrixAddition matrixAddition = new MatrixAddition(arr1);
        MatrixTranspose matrixTranspose = new MatrixTranspose(arr1);



        MatrixTranspose mtr2 = matrixTranspose.transposeMatrix(matrixTranspose);
        matrixAddition = matrixAddition.addMatrix(mtr2);


/*        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                System.out.print(matrixAddition.getElement(i, j) + "  ");
            }
            System.out.println();
        }
        2 5
        5 8   */

    }
}
