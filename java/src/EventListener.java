import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EventListener extends JFrame {
    public EventListener() {
        setTitle("Action 이벤트 리스너 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton button = new JButton("Action");
        button.addActionListener(new MyActionListener());
        c.add(button);
        setSize(250, 120);
        setVisible(true);
    }
    public static void main(String[] args) {
        new EventListener();
    }
    // 독립된 클래스로 이벤트 리스너 작성
    class MyActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton)e.getSource();
            if (b.getText().equals("Action")) {
                b.setText("액션");
            }
            else {
                b.setText("Action");
            }
        }
    }
}
