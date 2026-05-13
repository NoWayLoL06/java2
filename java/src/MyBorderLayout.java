import java.awt.Container;

import javax.swing.JFrame;

public class MyBorderLayout extends JFrame{
    public MyBorderLayout(){
        setTitle("BorderLayout 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane();

        contentPane.setLayout(getLayout());
    }
}
