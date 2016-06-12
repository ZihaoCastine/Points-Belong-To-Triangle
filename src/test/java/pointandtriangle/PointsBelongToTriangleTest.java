package pointandtriangle;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zihaocastine on 6/12/16.
 */
public class PointsBelongToTriangleTest {

   @Test
    public void resultTest0(){
       PointsBelongToTriangle test1=new PointsBelongToTriangle(0,0,2,0,4,0,2,0,4,0);
       int expected=0;
       Assert.assertEquals(expected,test1.result());
   }

    @Test
    public void resultTest1(){
        PointsBelongToTriangle test1=new PointsBelongToTriangle(3,1,7,1,5,5,3,1,0,0);
        int expected=1;
        Assert.assertEquals(expected,test1.result());
    }

    @Test
    public void resultTest2(){
        PointsBelongToTriangle test1=new PointsBelongToTriangle(3,1,7,1,5,5,1,1,4,3);
        int expected=2;
        Assert.assertEquals(expected,test1.result());
    }

    @Test
    public void resultTest3(){
        PointsBelongToTriangle test1=new PointsBelongToTriangle(3,1,7,1,5,5,5,2,6,3);
        int expected=3;
        Assert.assertEquals(expected,test1.result());
    }

    @Test
    public void resultTest4(){
        PointsBelongToTriangle test1=new PointsBelongToTriangle(3,1,7,1,5,5,1,1,2,2);
        int expected=4;
        Assert.assertEquals(expected,test1.result());
    }




}
