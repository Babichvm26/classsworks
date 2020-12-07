package lesson46;

public class Controller {
        //    public double x1,x2,y1,y2,xV,yV,xM,yM,vL;
        public int x1,x2,y1,y2,xV,yV,xM,yM,vL;
        //    public void setVector(double a1,double b1, double a2, double b2)
        public void setVector(int a1,int b1, int a2, int b2)
        {
            x1 = a1;
            x2 = a2;
            y1 = b1;
            y2 = b2;
        }
        public void getVectorCoords()
        {
            xV = x2 - x1;
            yV = y2 - y1;
        }
        public double scalMult(Controller a,Controller b)
        {
            return (a.xV*b.xV+a.yV*b.yV);
        }
        public double vectMult(Controller a,Controller b)
        {
            return (a.xV*b.yV-a.yV*b.xV);
        }
    }
