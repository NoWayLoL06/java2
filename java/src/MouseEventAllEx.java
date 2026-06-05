import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MouseEventAllEx extends JFrame {
    private JLabel la = new JLabel("Move Me");

    public MouseEventAllEx() {
        setTitle("MouseListener와 MouseMotionListener 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();

        // ✅ 하나의 리스너 객체가 MouseListener + MouseMotionListener 모두 구현
        MyMouseListener listener = new MyMouseListener();
        c.addMouseListener(listener);           // 클릭/진입/이탈 이벤트
        c.addMouseMotionListener(listener);     // 드래그/이동 이벤트

        c.setLayout(null); // 절대 좌표 배치

        la.setSize(80, 20);
        la.setLocation(100, 80);
        c.add(la); // 레이블 컴포넌트 삽입

        setSize(300, 200);
        setVisible(true);
    }

    class MyMouseListener implements MouseListener, MouseMotionListener {

        // ✅ 마우스 버튼을 누른 순간
        public void mousePressed(MouseEvent e) {
            la.setLocation(e.getX(), e.getY());
            setTitle("mousePressed(" + e.getX() + "," + e.getY() + ")");
        }

        // ✅ 마우스 버튼을 뗀 순간
        public void mouseReleased(MouseEvent e) {
            la.setLocation(e.getX(), e.getY());
            setTitle("mouseReleased(" + e.getX() + "," + e.getY() + ")");
        }

        // ✅ 마우스 버튼을 눌렀다가 뗀 순간 (pressed + released)
        public void mouseClicked(MouseEvent e) {}

        // ✅ 마우스 커서가 컴포넌트 영역 안으로 들어온 순간
        public void mouseEntered(MouseEvent e) {
            Component comp = ((Component) e.getSource()); // 이벤트 발생 컴포넌트
            comp.setBackground(Color.CYAN);               // 배경색 → 청록색
            setTitle("mouseEntered(" + e.getX() + "," + e.getY() + ")");
        }

        // ✅ 마우스 커서가 컴포넌트 영역 밖으로 나간 순간
        public void mouseExited(MouseEvent e) {
            Component comp = ((Component) e.getSource()); // 이벤트 발생 컴포넌트
            comp.setBackground(Color.YELLOW);             // 배경색 → 노란색
            setTitle("mouseExited(" + e.getX() + "," + e.getY() + ")");
        }

        // ✅ 마우스 버튼을 누른 채로 이동 (드래그)
        public void mouseDragged(MouseEvent e) {
            setTitle("mouseDragged(" + e.getX() + "," + e.getY() + ")");
        }

        // ✅ 마우스 버튼 없이 이동
        public void mouseMoved(MouseEvent e) {
            setTitle("mouseMoved(" + e.getX() + "," + e.getY() + ")");
        }
    }

    public static void main(String[] args) {
        new MouseEventAllEx();
    }
}