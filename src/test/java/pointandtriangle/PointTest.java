package pointandtriangle;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zihaocastine on 6/12/16.
 */
public class PointTest {

    @Test
    public void testPoints(){
        Point p1=new Point(0,5);
        int expectedX =0;
        int expectedY=5;
        Assert.assertEquals(expectedX,p1.x);
        Assert.assertEquals(expectedY,p1.y);
    }
}
