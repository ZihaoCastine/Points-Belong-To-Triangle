package pointandtriangle;

/**
 * Created by zihaocastine on 6/12/16.
 */
public class PointsBelongToTriangle {
    private Point A, B, C, P, Q;
    private Triangle triangleABC;
    PointsBelongToTriangle(int x1, int y1, int x2, int y2, int x3, int y3, int p1, int q1,
                           int p2, int q2){
        A=new Point(x1,y1);
        B=new Point(x2,y2);
        C=new Point(x3,y3);
        P=new Point(p1,q1);
        Q=new Point(p2,q2);
        triangleABC=new Triangle(A,B,C);
    }

    /*
    The return value is:
    0: If points A, B and C don't form a triangle.
    1: If point P "belongs to the triangle" ABC but point Q doesn't.
    2: If point Q belongs to the triangle ABC but point
    P doesn't.
    3: If both points P and Q belong to the triangle ABC. 4 : If neither point P nor point Q belong to the triangle.
     */
    public int result(){

        if(triangleABC.isTriangle()){
            boolean isPBelongToTriangle=isPointBelongToTriangle(P);
            boolean isQBelongToTriangle=isPointBelongToTriangle(Q);

            if(isPBelongToTriangle&&isQBelongToTriangle){
                return 3;
            }else if(isPBelongToTriangle){
                return 1;
            }else if(isQBelongToTriangle){
                return 2;
            }else {
                return 4;
            }
        }else {
            return 0;
        }
    }

    private boolean isPointBelongToTriangle(Point p){
        Triangle triangleABP=new Triangle(A,B,p);
        Triangle triangleACP=new Triangle(A,C,p);
        Triangle triangleBCP=new Triangle(B,C,p);

        double total=triangleABP.getArea()+triangleACP.getArea()+triangleBCP.getArea();

        if(total==triangleABC.getArea()){
            return true;
        }else {
            return false;
        }
    }

}
