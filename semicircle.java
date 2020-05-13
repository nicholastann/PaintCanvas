import java.util.*;
public class semicircle implements shape {
    private Point p;
    private double r;

    public semicircle (double r, Point p) {
        this.r = r;
        this.p = p;
    }

    public double getr() {
        return r;
    }

    public Point getp() {
        return p;
    }

    public String tostring() {
        return p+" "+r;
    }

    public double perimeter() {
        return 2* Math.PI * r/2; 

    }

    public double area() {
        return Math.PI * r * r/2;

    }

}
