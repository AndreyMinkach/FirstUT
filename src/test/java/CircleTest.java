import org.testng.Assert;
import org.testng.annotations.Test;

public class CircleTest {

    private Circle myCircle = new Circle(10);

    @Test
    public void testGetRadius(){
        Assert.assertEquals(myCircle.getRadius(),10);
    }

    @Test
    public void testGetCircleArea() {
        Assert.assertEquals(myCircle.getCircleArea(), 314.1592653589793);
    }

    @Test
    public void testGetCirclePerimeter() {
        Assert.assertEquals(myCircle.getCirclePerimeter(),62.83185307179586);
    }
}