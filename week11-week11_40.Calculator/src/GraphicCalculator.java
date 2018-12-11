
import java.awt.Container;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.JPanel;

public class GraphicCalculator implements Runnable {
    private JFrame frame;

    @Override
    public void run() {
        frame=new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(400, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
        
    }

    private void createComponents(Container container) {
        container.setLayout(new GridLayout(3, 1));
        JTextField output= new JTextField("0");
        output.setEnabled(false);
        JTextField input=new JTextField("");
        JPanel panel = new JPanel(new GridLayout(1, 3));
        JButton plus = new JButton("+");
        JButton z=new JButton("Z");
        z.setEnabled(false);
        plus.addActionListener(new PlusListener(input, output, z));
        panel.add(plus);
        JButton minus=new JButton("-");
        minus.addActionListener(new MinusListener(input, output, z));
        panel.add(minus);
        z.addActionListener(new ZListener(input, output, z));
        
        panel.add(z);
        
        container.add(output);
        container.add(input);
        container.add(panel, BorderLayout.SOUTH);
        
        
    }

    public JFrame getFrame() {
        return frame;
    }
}
