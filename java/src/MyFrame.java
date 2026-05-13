import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
    public MyFrame() {
        setTitle("FlowLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        getContentPane().setLayout(new FlowLayout(FlowLayout.LEFT,30, 40));

        add(new JButton("add"));
        add(new JButton("sub"));
        add(new JButton("mul"));
        add(new JButton("div"));
        add(new JButton("calculate"));

        setSize(300,300);
        setVisible(true);

    }
    public static void main(String[] args) {
        new MyFrame();
    }
}
