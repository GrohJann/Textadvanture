package View;

import javax.swing.*;

public class StartPanelHandler {
    private MainView mainView;
    private JPanel panel;
    
    public StartPanelHandler(MainView mainView) {
        this.mainView = mainView;
    }
    
    public JPanel getPanel(){
        return panel;
    }
}
