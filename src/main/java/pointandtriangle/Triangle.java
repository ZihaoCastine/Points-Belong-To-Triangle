package pointandtriangle;

/**
 * Created by zihaocastine on 6/12/16.
 */
public class Triangle {
    private Point p1,p2,p3;
    Triangle(Point p1, Point p2, Point p3){
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
    }

    public boolean isTriangle(){
        if(p1.x==0||p2.x==0||p3.x==0){
            return isTriangleWhenXIsZero();
        }else {
            if (slope(p1, p2) == slope(p2, p3))
                return false;
            else {
                return true;
            }
        }
    }

    private boolean isTriangleWhenXIsZero(){
        if(p1.x==0&&p2.x==0&&p3.x==0){
            return false;
        }else if(p1.y==0&&p2.y==0&&p3.y==0){
            return false;
        }else {
            return true;
        }

    }

    private double slope(Point p1,Point p2){
        return Math.abs((p2.y-p1.y)/(p2.x-p1.x));
    }

    public double getArea(){
        double result=(p1.x*(p2.y-p3.y)+p2.x*(p3.y-p1.y)+p3.x*(p1.y-p2.y))/2.0;
        result=Math.abs(result);
        return result;
    }
}
