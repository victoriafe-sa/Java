import javax.swing.JFrame;

public class Screen extends JFrame {
    public static void main(String[] args) {
        new Screen();
    }
    public Screen() {
        setTitle("Aula 1");
        setVisible(true);
        setSize(500, 500);
        setTitle("Swing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
    }

} 
