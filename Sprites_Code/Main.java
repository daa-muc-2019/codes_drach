import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    public Main(){
        add(new Board());
        setResizable(false);
        pack();
        setTitle("Weltraumspiel");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args){
        EventQueue.invokeLater(()-> {
            Main main = new Main();
            main.setVisible(true);
        });
    }
}
