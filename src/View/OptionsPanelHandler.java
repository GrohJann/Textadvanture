package View;

import javax.swing.*;

public class OptionsPanelHandler {
    private MainView mainView;
    private JPanel panel;
    
    public OptionsPanelHandler(MainView mainView) {
        this.mainView = mainView;
    }
    
    public JPanel getPanel(){
        return panel;
    }
}
