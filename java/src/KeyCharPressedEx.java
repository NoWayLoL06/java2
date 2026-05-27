import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class KeyCharPressedEx extends JFrame {
    private JLabel la = new JLabel("text:<Enter>키로 배경색이 바뀝니다");

    public KeyCharPressedEx() {
        super("KeyListener에 문자 키 입력 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null); // ✅ 방향키 이동을 위해 null 레이아웃으로 변경

        // ✅ 레이블 초기 위치 및 크기 설정
        la.setSize(250, 30);
        la.setLocation(80, 60);
        c.add(la);

        c.addKeyListener(new MyKeyListener());
        setSize(400, 300);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    }

    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int r = (int) (Math.random() * 256);
            int g = (int) (Math.random() * 256);
            int b = (int) (Math.random() * 256);

            switch (e.getKeyChar()) {
                case '\n':
                    la.setText("r=" + r + ", g=" + g + ", b=" + b);
                    getContentPane().setBackground(new Color(r, g, b));
                    break;
                case 'q':
                    System.exit(0);
            }

            // ✅ 방향키 처리 (getKeyCode 사용)
            switch (e.getKeyCode()) {
                case KeyEvent.VK_UP:
                    la.setLocation(la.getX(), la.getY() - 10); break;
                case KeyEvent.VK_DOWN:
                    la.setLocation(la.getX(), la.getY() + 10); break;
                case KeyEvent.VK_LEFT:
                    la.setLocation(la.getX() - 10, la.getY()); break;
                case KeyEvent.VK_RIGHT:
                    la.setLocation(la.getX() + 10, la.getY()); break;
            }
        }
    }

    public static void main(String[] args) {
        new KeyCharPressedEx();
    }
}