package pointandtriangle;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zihaocastine on 6/12/16.
 */
public class TriangleTest {

    @Test
    public void testIsTriangleWithZeroInX(){
        Point p1=new Point(0,1);
        Point p2=new Point(0,5);
        Point p3=new Point(0,3);
        Triangle triangle=new Triangle(p1,p2,p3);
        Assert.assertFalse(triangle.isTriangle());
    }

    @Test
    public void testIsTriangleWithZeroInY(){
        Point p1=new Point(5,0);
        Point p2=new Point(3,0);
        Point p3=new Point(8,0);
        Triangle triangle=new Triangle(p1,p2,p3);
        Assert.assertFalse(triangle.isTriangle());
    }

    @Test
    public void testIsTriangle(){
        Point p1=new Point(0,0);
        Point p2=new Point(2,0);
        Point p3=new Point(4,0);
        Triangle triangle=new Triangle(p1,p2,p3);
        Assert.assertFalse(triangle.isTriangle());
    }

    @Test
    public void testGetArea(){
        Point p1=new Point(0,0);
        Point p2=new Point(0,1);
        Point p3=new Point(1,1);
        Triangle triangle=new Triangle(p1,p2,p3);
        double expected=0.5;
        Assert.assertEquals(expected,triangle.getArea(),0);
    }

    @Test
    public void testGetArea2(){
        Point p1=new Point(0,0);
        Point p2=new Point(0,10);
        Point p3=new Point(10,10);
        Triangle triangle=new Triangle(p1,p2,p3);
        double expected=50;
        Assert.assertEquals(expected,triangle.getArea(),0);
    }

}
