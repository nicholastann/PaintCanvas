import java.util.*;
public class line {
    private Point a;
    private Point b;

    public line (Point a, Point b) {
        this.a = a;
        this.b = b;
    }

    public Point geta() {
        return a;
    }

    public Point getb() {
        return b;
    }

    public String tostring() {
        return "("+a+","+b+")";
    }

    public double length() {
        double x = (b.getx()-a.getx()) * (b.getx()-a.getx());
        double y = (b.gety()-a.gety()) * (b.gety()-a.gety());

        return Math.sqrt((x+y));
    }

    public double slope() {
        return ((a.gety() - b.gety()) / (a.getx() - b.getx())); 
    }

    public Point midpoint() {
        return new Point((a.getx()+b.getx())/2, (a.gety()+b.gety())/2); 
    }

}

