import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JPanel;	
import javax.swing.JButton;	
import javax.swing.ImageIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import java.awt.*;
import java.awt.GridLayout;

public class MenuPanel extends JPanel implements ActionListener {
    private JButton savebtn = new JButton (new ImageIcon("ICONS/1_Icon_Save.png"));
    private JButton loadbtn = new JButton(new ImageIcon("ICONS/2_Icon_Load.png"));
    private JButton pencilbtn = new JButton(new ImageIcon("ICONS/3_Icon_Pencil.png"));
    private JButton brushbtn = new JButton(new ImageIcon("ICONS/4_Icon_Brush.png"));
    private JButton eraserbtn = new JButton (new ImageIcon("ICONS/5_Icon_Eraser.png"));
    private JButton bucketbtn = new JButton(new ImageIcon("ICONS/6_Icon_Bucket.png"));
    private JButton linebtn = new JButton (new ImageIcon("ICONS/7_Icon_Line.png"));
    private JButton undobtn = new JButton(new ImageIcon("ICONS/8_Icon_Undo.png"));
    private JButton deletebtn = new JButton(new ImageIcon("ICONS/9_Icon_Trash.png"));
    private JButton squarebtn = new JButton(new ImageIcon("ICONS/10_Icon_Rectangle.png"));
    private JButton rhombusbtn = new JButton(new ImageIcon("ICONS/11_Icon_Rhombus.png"));
    private JButton triequalbtn = new JButton (new ImageIcon("ICONS/12_Icon_TriangleEqual.png"));
    private JButton tribtn = new JButton(new ImageIcon("ICONS/13_Icon_TriangleRight.png"));
    private JButton circlebtn = new JButton(new ImageIcon("ICONS/14_Icon_Circle.png"));
    private JButton arrowbtn = new JButton(new ImageIcon("ICONS/15_Icon_Arrow.png"));
    private JButton starbtn = new JButton(new ImageIcon("ICONS/16_Icon_Star.png"));
    private JButton pickerbtn = new JButton(new ImageIcon("ICONS/17_Icon_Picker.png"));
    private JButton colorbtn = new JButton(new ImageIcon("ICONS/18_Icon_Color.png"));
    
    //1,2,4,5,6,11,13,14,15,16,17,18

    public MenuPanel() {
        setBackground(Color.WHITE);
        savebtn.setPreferredSize(new Dimension(50,65));
        loadbtn.setPreferredSize(new Dimension(65,65));
        pencilbtn.setPreferredSize(new Dimension(65,65));
        brushbtn.setPreferredSize(new Dimension(65,65));
        eraserbtn.setPreferredSize(new Dimension(65,65));
        bucketbtn.setPreferredSize(new Dimension(65,65));
        linebtn.setPreferredSize(new Dimension(65,65));
        undobtn.setPreferredSize(new Dimension(65,65));
        deletebtn.setPreferredSize(new Dimension(65,65));
        squarebtn.setPreferredSize(new Dimension(65,65));
        rhombusbtn.setPreferredSize(new Dimension(65,65));
        triequalbtn.setPreferredSize(new Dimension(65,65));
        tribtn.setPreferredSize(new Dimension(65,65));
        circlebtn.setPreferredSize(new Dimension(65,65));
        arrowbtn.setPreferredSize(new Dimension(65,65));
        starbtn.setPreferredSize(new Dimension(65,65));
        pickerbtn.setPreferredSize(new Dimension(65,65));
        colorbtn.setPreferredSize(new Dimension(65,65));

        this.add(savebtn);
        this.add(loadbtn);
        this.add(pencilbtn);
        this.add(brushbtn);
        this.add(eraserbtn);
        this.add(bucketbtn);
        this.add(linebtn);
        this.add(undobtn);
        this.add(deletebtn);
        this.add(squarebtn);
        this.add(rhombusbtn);
        this.add(triequalbtn);
        this.add(tribtn);
        this.add(circlebtn);
        this.add(arrowbtn);
        this.add(starbtn);
        this.add(pickerbtn);
        this.add(colorbtn);

        pencilbtn.addActionListener(this);
        linebtn.addActionListener(this);
        squarebtn.addActionListener(this);
        tribtn.addActionListener(this);
        savebtn.addActionListener(this);
        loadbtn.addActionListener(this);
        brushbtn.addActionListener(this);
        eraserbtn.addActionListener(this);
        bucketbtn.addActionListener(this);
        undobtn.addActionListener(this);
        deletebtn.addActionListener(this);
        rhombusbtn.addActionListener(this);
        triequalbtn.addActionListener(this);
        circlebtn.addActionListener(this);
        arrowbtn.addActionListener(this);
        starbtn.addActionListener(this);
        pickerbtn.addActionListener(this);
        colorbtn.addActionListener(this);
        
        setLayout(new GridLayout(3, 5));
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == linebtn) {
            GUI.getDrawPanel().setcurTool("Line");
            GUI.getDrawPanel().setundotool(1);
        }
        if(e.getSource() == pencilbtn) {
            GUI.getDrawPanel().setcurTool("Pencil");
            GUI.getDrawPanel().setundotool(2);
        }
        if(e.getSource() == squarebtn) {
            GUI.getDrawPanel().setcurTool("Square");
            GUI.getDrawPanel().setundotool(3);
        }
        if(e.getSource() == tribtn) {
            GUI.getDrawPanel().setcurTool("Tri");
            GUI.getDrawPanel().setundotool(4);
        }
        if(e.getSource() == savebtn) {
            GUI.getDrawPanel().setcurTool("Save");
            
        }
        if(e.getSource() == loadbtn) {
            GUI.getDrawPanel().setcurTool("Load");
            
        }
        if(e.getSource() == brushbtn) {
            GUI.getDrawPanel().setcurTool("Brush");
            GUI.getDrawPanel().setundotool(5);
        }
        if(e.getSource() == eraserbtn) {
            GUI.getDrawPanel().setcurTool("Eraser");
            GUI.getDrawPanel().setundotool(6);
        }
        if(e.getSource() == bucketbtn) {
            GUI.getDrawPanel().setcurTool("Bucket");
        }
        if(e.getSource() == undobtn) {
            GUI.getDrawPanel().setcurTool("Undo");
       
        }
        if(e.getSource() == deletebtn) {
            GUI.getDrawPanel().setcurTool("Delete");
         
        }
        if(e.getSource() == rhombusbtn) {
            GUI.getDrawPanel().setcurTool("Rhombus");
            GUI.getDrawPanel().setundotool(3);
        }
        if(e.getSource() == triequalbtn) {
            GUI.getDrawPanel().setcurTool("Triequal");
            GUI.getDrawPanel().setundotool(4);
        }
        if(e.getSource() == circlebtn) {
            GUI.getDrawPanel().setcurTool("Circle");
            GUI.getDrawPanel().setundotool(8);
        }
        if(e.getSource() == arrowbtn) {
            GUI.getDrawPanel().setcurTool("Arrow");
            GUI.getDrawPanel().setundotool(7);
        }
        if(e.getSource() == starbtn) {
            GUI.getDrawPanel().setcurTool("Star");
            GUI.getDrawPanel().setundotool(9);
        }
        if(e.getSource() == pickerbtn) {
            GUI.getDrawPanel().setcurTool("Picker");
        }
        if(e.getSource() == colorbtn) {
            GUI.getDrawPanel().setcurTool("Color");
        }
        
    }
}