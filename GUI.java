import javax.swing.JFrame;
import java.awt.BorderLayout;

public class GUI {
    private static MenuPanel menuPanel;
    private static DrawPanel drawPanel;

    public static void main() {
        new GUI(); 
    }

    public GUI() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        menuPanel = new MenuPanel();
        drawPanel = new DrawPanel();
        frame.add(menuPanel, BorderLayout.NORTH);
        frame.add(drawPanel, BorderLayout.CENTER);

        frame.setSize(800,800);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public static MenuPanel getMenuPanel() {
        return menuPanel;
    }

    public static DrawPanel getDrawPanel() {
        return drawPanel;
    }

}