import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TxtEditor extends JFrame implements ActionListener, CaretListener, DocumentListener {

    private JTextArea txtFile = null;
    private JMenuItem mniNew = null;
    private JMenuItem mniOpen = null;
    private JMenuItem mniSave = null;
    private JMenuItem mniExit = null;
    private JMenuItem mniAbout = null;


    public TxtEditor(){

        setSize(800,600);
        setTitle("Java Text Editor");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        initUi();
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == mniNew){

        }
        if(e.getSource() == mniOpen){

        }

        if(e.getSource() == mniSave){

        }

        if(e.getSource() == mniExit)
            System.exit(0);

        if(e.getSource() == mniAbout)
            JOptionPane.showMessageDialog(this, "Marco Garro, applicazione senza asciugamani","about", JOptionPane.INFORMATION_MESSAGE);

    }

    private void UINorth(){
        JMenuBar mnbNorth = new JMenuBar();

        JMenu mnuFile = new JMenu("File");
        mniNew = new JMenuItem("new");
        mniOpen = new JMenuItem("Open...");
        mniSave = new JMenuItem("Save in file...");
        mniExit = new JMenuItem("Exit");
        mnuFile.add(mniNew);
        mnuFile.add(mniOpen);
        mnuFile.add(mniSave);
        mnuFile.addSeparator();
        mnuFile.add(mniExit);

        JMenu mnuHelp = new JMenu("Help");
        mniAbout = new JMenuItem("about...");
        mnuHelp.add(mniAbout);

        mniNew.addActionListener(this);
        mniOpen.addActionListener(this);
        mniSave.addActionListener(this);
        mniExit.addActionListener(this);
        mniAbout.addActionListener(this);

        mnbNorth.add(mnuFile);
        mnbNorth.add(mnuHelp);

        add(mnbNorth, BorderLayout.NORTH);
    }

    private void UICenter(){

        this.txtFile = new JTextArea();
        JScrollPane pnlCenter = new JScrollPane(this.txtFile);

        this.add(pnlCenter, BorderLayout.CENTER);

        this.txtFile.getDocument().addDocumentListener(this);
        this.txtFile.addCaretListener(this);

    }
    private void initUi() {

        UINorth();
        UICenter();
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

    @Override
    public void caretUpdate(CaretEvent e) {

    }

    @Override
    public void insertUpdate(DocumentEvent e) {

    }

    @Override
    public void removeUpdate(DocumentEvent e) {

    }

    @Override
    public void changedUpdate(DocumentEvent e) {

    }
}
