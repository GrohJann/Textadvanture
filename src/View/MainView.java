package View;

import Controller.MainController;

import javax.swing.*;

public class MainView extends JFrame{
    
    // Attribute
    
    // Referenzen
    private MainController mainController;
    private JPanel startPanel;
    private JPanel gamePanel;
    
    /**
     * Konstruktor
     * @param mainController Ein Referenz auf ein Controller-Objekt.
     */
    public MainView(MainController mainController) {
        
        this.mainController = mainController;
        this.startPanel = new StartPanelHandler(this).getPanel();
        
        this.setResizable(false);
        this.setTitle("Textadventure");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
    }
}