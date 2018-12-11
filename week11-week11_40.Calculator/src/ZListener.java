
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;




public class ZListener implements ActionListener{
    
    private JTextField input;
    private JTextField output;
    private JButton z;
    
    public ZListener(JTextField i, JTextField o, JButton z){
        this.input=i;
        this.output=o;
        this.z=z;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        input.setText("");
        output.setText("0");
        z.setEnabled(false);
        
    }

}
