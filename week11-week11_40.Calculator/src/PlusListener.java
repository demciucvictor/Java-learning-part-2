
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;




public class PlusListener implements ActionListener{
    
    private JTextField input;
    private JTextField output;
    private JButton z;
    
    public PlusListener(JTextField i , JTextField o, JButton z){   
        this.input=i;
        this.output=o;
        this.z=z;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            int test=Integer.parseInt(input.getText());
        }catch(Exception ex){
            input.setText("");
            return;
        }
        
        
        int n;
        int initial;
        int fin;
        n=Integer.parseInt(input.getText());
        initial=Integer.parseInt(output.getText());
        fin=initial+n;
        output.setText(String.valueOf(fin));
        input.setText("");
        if(output.getText().equals("0")){
            z.setEnabled(false);
        }else{
            z.setEnabled(true);
        }
    }

}
