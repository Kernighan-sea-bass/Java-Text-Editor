import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TxtEditor extends JFrame implements ActionListener {



    public TxtEditor(){

        setSize(800,600);
        setTitle("Java Text Editor");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        initUi();
        setVisible(true);
    }

    private void initUi() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                new TxtEditor();
            }
        };
        SwingUtilities.invokeLater(r);
    }
}
