import org.junit.Assert;
import org.junit.Test;

public class CircleTest {
    @Test
    public void CorrectArea(){
        Circle circle = new Circle(2);
        Assert.assertEquals(6.28, circle.getArea(), 0.01);
    }

    @Test
    public void NullSize(){
        Circle circle = new Circle(0);
        Assert.assertEquals(0, circle.getArea(), 0.1);
    }

    @Test
    public void NegativeSize(){
        Circle circle = new Circle(-9);
        Assert.assertEquals(0,circle.getArea(), 0.1);
    }

    @Test
    public void TestType(){
        Circle circle = new Circle(2);
        Assert.assertEquals("My name is Circle",circle.toString());
    }
}
