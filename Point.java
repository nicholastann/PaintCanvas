public class Point {
    private double x;
    private double y;

    public Point (double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    public double getx() {
        return x;
    }
    
    public double gety() {
        return y;
    }
    
    public String tostring() {
        return "("+x+","+y+")";
        
    }
}
