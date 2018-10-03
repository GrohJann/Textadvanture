package View;

import javax.swing.*;

public class GamePanelHandler {
    private MainView mainView;
    private JPanel panel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    
    public GamePanelHandler(MainView mainView) {
        this.mainView = mainView;
    }
    
    public JPanel getPanel(){
        return panel;
    }
}
