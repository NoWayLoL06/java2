import javax.swing.JFrame;

public class Swing extends JFrame {
    public Swing() {
        setTitle("300x300 스윙 프레임 만들기");
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        Swing frame = new Swing();
    }
}