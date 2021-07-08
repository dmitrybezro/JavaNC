import org.junit.Test;
import org.junit.Assert;

public class BoxTest {
    @Test
    public void CorrectArea(){
        Box box = new Box(3);
        Assert.assertEquals(9, box.getArea(), 0.1);
    }

    @Test
    public void NullSize(){
        Box box = new Box(0);
        Assert.assertEquals(0, box.getArea(), 0.1);
    }

    @Test
    public void NegativeSize(){
        Box box = new Box(-3);
        Assert.assertEquals(0,box.getArea(), 0.1);
    }

    @Test
    public void TestType(){
        Box box = new Box(1000.10001);
        Assert.assertEquals("My name is Box", box.toString());
    }

}
