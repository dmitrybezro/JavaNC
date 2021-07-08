import org.junit.Test;
import org.junit.Assert;

public class TriangleTest {
    @Test
    public void CorrectArea(){
        Triangle triangle = new Triangle(3);
        Assert.assertEquals(3.897, triangle.getArea(), 0.001);
    }

    @Test
    public void NullSize(){
        Triangle triangle = new Triangle(0);
        Assert.assertEquals(0, triangle.getArea(), 0.1);
    }

    @Test
    public void NegativeSize(){
        Triangle triangle = new Triangle(-10);
        Assert.assertEquals(0,triangle.getArea(), 0.1);
    }

    @Test
    public void TestType(){
        Triangle triangle = new Triangle(12345);
        Assert.assertEquals("My name is Triangle",triangle.toString());
    }
}
