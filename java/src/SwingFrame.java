import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;


public class SwingFrame extends JFrame{
    public SwingFrame() {
        setTitle("ConteantPane과 JFrame 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        getContentPane().setBackground(Color.ORANGE);
        getContentPane().setLayout(new FlowLayout());

        add(new JButton("OK"));
        add(new JButton("Cancel"));
        add(new JButton("Ignore"));

        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SwingFrame();
    }
}
