import java.util.ArrayList;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JPanel;

public class DrawPanel extends JPanel implements MouseListener, MouseMotionListener {
    private String curTool;
    private ArrayList<line> lines;
    private ArrayList<line> circles;
    private int mpx, mpy, mrx, mry;
    private boolean wasline = false;
    private boolean wassquare = false;
    private boolean wastri = false;
    private boolean wastriequal = false;
    private boolean wasrhombus = false;
    private boolean wasarrow = false;
    private boolean wasstar = false;
    private boolean wascircle = false;
    private int undotool = 0;
    private int undonum = 0;
    public DrawPanel() {
        setBackground(Color.WHITE);
        addMouseListener(this);
        addMouseMotionListener(this);
        lines = new ArrayList<line>();
        circles = new ArrayList<line>();
    }

    public void setcurTool (String s) {
        curTool = s;
    }

    public void setundotool (int tool) {
        undotool = tool;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for (line x: lines) {
            g.drawLine((int)x.geta().getx(),(int)x.geta().gety(),(int)x.getb().getx(),(int)x.getb().gety());

        }
         for (line x: circles) {
            g.drawOval((int)x.geta().getx(), (int)x.geta().gety(), (int) x.geta().getx()-(int)x.getb().getx(), (int) x.geta().gety() - (int)x.getb().gety());
        }
    }

    public void mouseClicked(MouseEvent e) {
    }


    public void mousePressed(MouseEvent e) {
        if (curTool == "Line") {
            mpx = e.getX();
            mpy = e.getY();
        }
        if (curTool == "Undo" ) {
            if  (lines.size() > 0) {
                if (undotool == 1) {

                    lines.remove(lines.size()-1);

                }
                if (undotool == 2) {
                    for (int i = 0; i < undonum; i++ ) {
                        lines.remove(lines.size()-1);
                    }
                }
                if (undotool == 3) {

                    lines.remove(lines.size()-1);
                    lines.remove(lines.size()-1);
                    lines.remove(lines.size()-1);
                    lines.remove(lines.size()-1);

                }
                if (undotool == 4) {
                    lines.remove(lines.size()-1);
                    lines.remove(lines.size()-1);
                    lines.remove(lines.size()-1);

                }
                if (undotool == 5) {
                    for (int i = 0; i < undonum; i++ ) {
                        lines.remove(lines.size()-1);
                    }

                }
                if (undotool == 6) {
                    for (int i = 0; i < undonum; i++ ) {
                        lines.remove(lines.size()-1);
                    }

                }
                if (undotool == 7) {

                    lines.remove(lines.size()-1);
                    lines.remove(lines.size()-1);
                    lines.remove(lines.size()-1);
                    lines.remove(lines.size()-1);
                    lines.remove(lines.size()-1);
                    lines.remove(lines.size()-1);
                    lines.remove(lines.size()-1);

                }
                if (undotool == 8) {

                }
                if (undotool == 9) {
                    lines.remove(lines.size()-1);
                    lines.remove(lines.size()-1);
                    lines.remove(lines.size()-1);
                    lines.remove(lines.size()-1);
                    lines.remove(lines.size()-1);
                    lines.remove(lines.size()-1);
                    lines.remove(lines.size()-1);
                    lines.remove(lines.size()-1);
                    lines.remove(lines.size()-1);
                    lines.remove(lines.size()-1);

                }
                if (undotool == 10) {

                    for (int i = 0; i < undonum; i++ ) {

                        for (int x = 0; x < 13; x++) {
                            lines.remove(lines.size()-1); 
                        }

                    }
                }
            }
            repaint();
            wasline = false;
            wassquare = false;
            wastri = false;
            wastriequal = false;
            wascircle = false;
            wasarrow = false;
            wasstar = false;
        }
        if (curTool == "Delete" ) {
            lines = new ArrayList<line>();
            repaint();
            wasline = false;
            wassquare = false;
            wastri = false;
            wastriequal = false;
        }

    }

    public void mouseReleased(MouseEvent e) {
        if (curTool == "Square" ) {
            wassquare = false;
        }
        if (curTool == "Circle" ) {
            wascircle = false;
        }
        if (curTool == "Arrow" ) {
            wasarrow = false;
        }
        if (curTool == "Star") {
            wasstar = false;
        }
        if (curTool == "Rhombus" ) {
            wasrhombus = false;
        }
        if (curTool == "Line" ) {
            wasline = false;
        }
        if (curTool == "Tri") { 
            wastri = false;
        }
        if (curTool == "Triequal") {
            wastriequal = false;
        }
    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void mouseDragged(MouseEvent e) {
        if (curTool == "Pencil") {
            mrx = e.getX();
            mry = e.getY();
            lines.add(new line(new Point(mpx,mpy), new Point(mrx, mry)));
            repaint();
            undonum++;
            mpx = e.getX();
            mpy = e.getY();
        }
        if (curTool == "Brush") {
            mrx = e.getX();
            mry = e.getY();
            lines.add(new line(new Point(mpx,mpy), new Point(mrx, mry)));
            lines.add(new line(new Point(mpx+1,mpy), new Point(mrx+1, mry)));
            lines.add(new line(new Point(mpx-1,mpy), new Point(mrx-1, mry)));
            lines.add(new line(new Point(mpx,mpy+1), new Point(mrx, mry+1)));
            lines.add(new line(new Point(mpx,mpy-1), new Point(mrx, mry-1)));
            lines.add(new line(new Point(mpx+2,mpy), new Point(mrx+2, mry)));
            lines.add(new line(new Point(mpx-2,mpy), new Point(mrx-2, mry)));
            lines.add(new line(new Point(mpx,mpy+2), new Point(mrx, mry+2)));
            lines.add(new line(new Point(mpx,mpy-2), new Point(mrx, mry-2)));
            lines.add(new line(new Point(mpx+3,mpy), new Point(mrx+3, mry)));
            lines.add(new line(new Point(mpx-3,mpy), new Point(mrx-3, mry)));
            lines.add(new line(new Point(mpx,mpy+3), new Point(mrx, mry+3)));
            lines.add(new line(new Point(mpx,mpy-3), new Point(mrx, mry-3)));

            repaint();
            undonum++;
            mpx = e.getX();
            mpy = e.getY();
        }

        if (curTool == "Line") {
            if (wasline == true) {
                lines.remove(lines.size()-1);

            }
            repaint();
            mrx = e.getX();
            mry = e.getY();
            lines.add(new line(new Point(mpx,mpy), new Point(mrx, mry)));
            repaint();

            wasline = true;
            wassquare = false;
            wastri = false;
            wastriequal = false;
            wasarrow = false;
            wasstar = false;
            wascircle = false;
        }
        if (curTool == "Square") {
            if (wassquare == true) {
                lines.remove(lines.size()-1);
                lines.remove(lines.size()-1);
                lines.remove(lines.size()-1);
                lines.remove(lines.size()-1);

            }
            repaint();
            mrx = e.getX();
            mry = e.getY();
            lines.add(new line(new Point(mpx,mpy), new Point(mrx, mpy)));
            lines.add(new line(new Point(mpx,mpy), new Point(mpx, mry)));
            lines.add(new line(new Point(mrx,mpy), new Point(mrx, mry)));
            lines.add(new line(new Point(mpx,mry), new Point(mrx, mry)));
            repaint();

            wassquare = true;
            wasline = false;
            wastri = false;
            wasstar = false;
            wasarrow = false;
            wasstar = false;
            wascircle = false;
            wastriequal = false;
        }
        if (curTool == "Arrow") {
            if (wasarrow == true) {
                lines.remove(lines.size()-1);
                lines.remove(lines.size()-1);
                lines.remove(lines.size()-1);
                lines.remove(lines.size()-1);
                lines.remove(lines.size()-1);
                lines.remove(lines.size()-1);
                lines.remove(lines.size()-1);

            }
            repaint();
            mrx = e.getX();
            mry = e.getY();
            lines.add(new line(new Point(mpx,mry*2/5),                new Point((mrx+mpx)/2, (mpy+mry)*2/5)));
            lines.add(new line(new Point((mrx+mpx)/2, (mpy+mry)*2/5), new Point((mpx+mrx)/2, mpy)));
            lines.add(new line(new Point((mpx+mrx)/2, mpy),           new Point(mrx, (mry+mpy)/2)));
            lines.add(new line(new Point(mrx, (mry+mpy)/2),           new Point((mrx+mpx)/2, mry)));
            lines.add(new line(new Point((mrx+mpx)/2, mry),           new Point((mrx+mpx)/2, mry*4/5)));
            lines.add(new line(new Point((mrx+mpx)/2, mry*4/5),       new Point(mpx, mry*4/5)));
            lines.add(new line(new Point(mpx, mry*4/5),               new Point(mpx, mry*2/5)));

            repaint();

            wassquare = false;
            wasline = false;
            wastri = false;
            wasstar = false;
            wasarrow = true;
            wascircle = false;
            wastriequal = false;
        }
        if (curTool == "Star") {
            if (wasstar == true) {
                lines.remove(lines.size()-1);
                lines.remove(lines.size()-1);
                lines.remove(lines.size()-1);
                lines.remove(lines.size()-1);
                lines.remove(lines.size()-1);
                lines.remove(lines.size()-1);
                lines.remove(lines.size()-1);
                lines.remove(lines.size()-1);
                lines.remove(lines.size()-1);
                lines.remove(lines.size()-1);

            }
            repaint();
            mrx = e.getX();
            mry = e.getY();
            lines.add(new line(new Point(mpx,(mry-mpy)*2/5), new Point((mpx-mrx)*4/9, mry*2/5)));
            lines.add(new line(new Point((mpx-mrx)*4/9, (mpy-mry)*2/5), new Point(mrx*4/5, mpy)));
            lines.add(new line(new Point((mpx+mrx)/2, mpy), new Point(mrx, (mry+mpy)/2)));
            lines.add(new line(new Point(mrx, (mry+mpy)/2), new Point((mrx+mpx)/2, mry)));
            lines.add(new line(new Point((mrx+mpx)/2, mry), new Point((mrx+mpx)/2, mry*4/5)));
            lines.add(new line(new Point((mrx+mpx)/2, mry*4/5), new Point(mpx, mry*4/5)));
            lines.add(new line(new Point(mpx, mry*4/5), new Point(mpx, mry*2/5)));
            lines.add(new line(new Point(mpx,mry*2/5), new Point((mrx+mpx)/2, (mpy+mry)*2/5)));
            lines.add(new line(new Point((mrx+mpx)/2, (mpy+mry)*2/5), new Point((mpx+mrx)/2, mpy)));
            lines.add(new line(new Point((mpx+mrx)/2, mpy), new Point(mrx, (mry+mpy)/2)));

            repaint();
            wassquare = false;
            wasline = false;
            wastri = false;
            wasarrow = false;
            wasstar = true;
            wascircle = false;
            wastriequal = false;
        }
        if (curTool == "Circle") {
            if (wascircle == true) {
                circles.remove(circles.size()-1);

            }
            repaint();
            mrx = e.getX();
            mry = e.getY();
            circles.add(new line(new Point(mpx,mpy), new Point(mry,mrx)));

            wassquare = false;
            wasarrow = false;
            wasstar = false;
            wasline = false;
            wascircle = true;
            wastri = false;
            wastriequal = false;
        }
        if (curTool == "Rhombus") {
            if (wasrhombus == true) {
                lines.remove(lines.size()-1);
                lines.remove(lines.size()-1);
                lines.remove(lines.size()-1);
                lines.remove(lines.size()-1);

            }
            repaint();
            mrx = e.getX();
            mry = e.getY();
            lines.add(new line(new Point(mpx,(mpy+mry)/2), new Point((mrx+mpx)/2, mpy)));
            lines.add(new line(new Point(mpx,(mpy+mry)/2), new Point((mpx+mrx)/2, mry)));
            lines.add(new line(new Point(mrx,(mpy+mry)/2), new Point((mrx+mpx)/2, mpy))); 
            lines.add(new line(new Point(mrx,(mry+mpy)/2), new Point((mrx+mpx)/2, mry)));
            repaint();

            wassquare = false;
            wasline = false;
            wasarrow = false;
            wasstar = false;
            wascircle = false;
            wastri = false;
            wastriequal = false;
            wasrhombus = true;

        }
        if (curTool == "Tri") {
            if (wastri == true) {
                lines.remove(lines.size()-1);
                lines.remove(lines.size()-1);
                lines.remove(lines.size()-1);

            }
            repaint();
            mrx = e.getX();
            mry = e.getY();
            lines.add(new line(new Point(mpx,mpy), new Point(mrx, mry)));
            lines.add(new line(new Point(mrx,mry), new Point(mpx, mry)));
            lines.add(new line(new Point(mpx, mry) , new Point(mpx, mpy)));

            repaint();
            wastri = true;
            wasline = false;
            wassquare = false;
            wasrhombus = false;
            wasarrow = false;
            wasstar = false;
            wascircle = false;
            wastriequal = false;
        }
        if (curTool == "Triequal") {
            if (wastriequal == true) {
                lines.remove(lines.size()-1);
                lines.remove(lines.size()-1);
                lines.remove(lines.size()-1);

            }
            repaint();
            mrx = e.getX();
            mry = e.getY();

            lines.add(new line(new Point(mpx,mry), new Point(mrx, mry)));
            lines.add(new line(new Point(mpx,mry), new Point((mpx +mrx)/2, mpy)));
            lines.add(new line(new Point(mrx, mry) , new Point((mpx + mrx)/2, mpy)));

            repaint();
            wastri = false;
            wasline = false;
            wasarrow = false;
            wasstar = false;
            wascircle = false;
            wassquare = false;
            wasrhombus = false;
            wastriequal = true;

        }
    }

    public void mouseMoved(MouseEvent e) {
        if (curTool == "Pencil") {
            mpx = e.getX();
            mpy = e.getY();
        }
        if (curTool == "Brush") {
            mpx = e.getX();
            mpy = e.getY();
        }
        if (curTool == "Triequal") {
            mpx = e.getX();
            mpy = e.getY();

            repaint();
        }
        if (curTool == "Square") {
            mpx = e.getX();
            mpy = e.getY();

            repaint();
        }
        if (curTool == "Arrow") {
            mpx = e.getX();
            mpy = e.getY();

            repaint();
        }
        if (curTool == "Star") {
            mpx = e.getX();
            mpy = e.getY();

            repaint();
        }
        if (curTool == "Circle") {
            mpx = e.getX();
            mpy = e.getY();

            repaint();
        }
        if (curTool == "Rhombus") {
            mpx = e.getX();
            mpy = e.getY();

            repaint();
        }
        if (curTool == "Tri") {
            mpx = e.getX();
            mpy = e.getY();

            repaint();
        }
    }

}