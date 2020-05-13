
import java.util.*;
public class triangle implements shape {
    private line l1;
    private line l2;
    private line l3;

    public triangle (line l1, line l2, line l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public line getl1() {
        return l1;
    }

    public line getl2() {
        return l2;
    }

    public line getl3() {
        return l3;
    }

    public String tostring() {
        return l1+" "+l2+" "+l3;
    }

    public double perimeter() {
        return l1.length()+l2.length()+ l3.length(); 
    }

    public double area() {
        double s = perimeter()/2;
        return Math.sqrt(s*(s-l1.length())*(s-l2.length())*(s-l3.length()));
    }
    
}