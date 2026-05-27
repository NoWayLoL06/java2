import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// ✅ 오류 1 수정: 클래스명을 MouseAdapter → MouseAdapterExample으로 변경
// ✅ 오류 2 수정: JFrame 상속 추가
public class MouseAdapterExample extends JFrame {
    private JLabel la = new JLabel("Hello");

    public MouseAdapterExample() {
        setTitle("Mouse Adapter 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.addMouseListener(new InnerMouseAdapter());

        c.setLayout(null);
        la.setSize(50, 20);
        la.setLocation(30, 30);
        c.add(la);

        setSize(200, 200);
        setVisible(true);
    }

    // ✅ 이제 java.awt.event.MouseAdapter를 올바르게 상속
    public class InnerMouseAdapter extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            int x = e.getX();
            int y = e.getY();
            la.setLocation(x, y);
        }
    }

    public static void main(String[] args) {
        new MouseAdapterExample();
    }
}