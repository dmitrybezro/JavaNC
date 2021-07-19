import org.junit.Test;
import org.junit.Assert;
public class MatrixAdditionTest {
    @Test
    public void CorrectTest(){
        int[][] arr1 = {{1,1},{1,1}};
        int[][] arr2 = {{2,2},{2,2}};

        MatrixAddition matrixAddition = new MatrixAddition(arr1);
        MatrixImpl matrixImpl = new MatrixImpl(arr2);
        matrixAddition = matrixAddition.addMatrix(matrixImpl);

        for(int i = 0; i < 2; i++){
            for(int j = 0; j < 2; j++){
                Assert.assertEquals(matrixAddition.getElement(i,j),3 );
            }
        }
    }
}
