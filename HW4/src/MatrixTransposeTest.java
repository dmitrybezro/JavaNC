import org.junit.Assert;
import org.junit.Test;

public class MatrixTransposeTest {
    @Test
    public void CorrectTest(){
        int[][] arr4 = {{1,2},{3,4}};

        MatrixTranspose mtr1 = new MatrixTranspose(arr4);
        MatrixTranspose mtr2 = mtr1.transposeMatrix(mtr1);

        Assert.assertEquals(mtr2.getElement(0,0), 1);
        Assert.assertEquals(mtr2.getElement(0,1), 3);
        Assert.assertEquals(mtr2.getElement(1,0), 2);
        Assert.assertEquals(mtr2.getElement(1,1), 4);
    }
}
