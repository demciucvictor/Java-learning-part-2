import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MenuPanel extends JPanel {
    
    

    public MenuPanel() {
        super(new GridLayout(1, 3));
        createComponents();
    }

    private void createComponents() {
        add(new JButton("+"));
        add(new JButton("-"));
        add(new JButton("Z"));
    }
}