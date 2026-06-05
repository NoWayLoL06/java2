import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JComponentEx extends JFrame {

    public JComponentEx() {
        super("JComponent의 공통 메소드 예제");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        // ✅ 버튼 3개 생성
        JButton b1 = new JButton("Magenta/Yellow Button");  // 일반 버튼
        JButton b2 = new JButton("Disabled Button");        // 비활성화 버튼
        JButton b3 = new JButton("getX(), getY()");         // 위치 출력 버튼

        // ✅ b1 버튼 스타일 설정
        b1.setBackground(Color.MAGENTA);                            // 배경색 마젠타
        b1.setForeground(Color.YELLOW);                             // 글자색 노란색
        b1.setFont(new Font("Arial", Font.ITALIC, 20));             // 이탤릭체, 크기 20

        // ✅ b2 버튼 비활성화
        b2.setEnabled(false);

        // ✅ b3 버튼 클릭 시 현재 위치 출력
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JButton b = (JButton) e.getSource();         // 이벤트 발생 버튼 가져오기
                setTitle(b.getX() + ", " + b.getY());        // 창 제목에 좌표 표시
            }
        });

        c.add(b1);
        c.add(b2);
        c.add(b3);

        setSize(260, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JComponentEx();
    }
}