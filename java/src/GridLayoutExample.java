import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutExample extends JFrame {
    public GridLayoutExample() {
        super("GridLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        contentPane.setLayout(new GridLayout(2,5));

        for (int i = 0; i < 10; i++) {
            String text = Integer.toString(i);
            JButton button = new JButton(text);
            add(button);
        }
        setSize(500,200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new GridLayoutExample();
    }
}
