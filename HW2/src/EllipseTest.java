import org.junit.Assert;
import org.junit.Test;

public class EllipseTest {
    @Test
    public void CorrectArea(){
        Ellipse ellipse = new Ellipse(2, 4);
        Assert.assertEquals(25.13, ellipse.getArea(), 0.01);
    }

    @Test
    public void NullSizeSmallRadius(){
        Ellipse ellipse = new Ellipse(0, 4);
        Assert.assertEquals(0, ellipse.getArea(), 0.1);
    }

    @Test
    public void NullSizeBigRadius(){
        Ellipse ellipse = new Ellipse(2, 0);
        Assert.assertEquals(0, ellipse.getArea(), 0.1);
    }

    @Test
    public void NegativeSmallRadius(){
        Ellipse ellipse = new Ellipse(-2, 12);
        Assert.assertEquals(0, ellipse.getArea(), 0.1);
    }

    @Test
    public void NegativeBigRadius(){
        Ellipse ellipse = new Ellipse(2, -12);
        Assert.assertEquals(0, ellipse.getArea(), 0.1);
    }

    @Test
    public void TestType(){
        Ellipse ellipse = new Ellipse(2, -12);
        Assert.assertEquals("My name is Ellipse",ellipse.toString());
    }
}
