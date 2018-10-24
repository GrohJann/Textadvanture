package View;

import View.FXMLFiles.StartSceneController;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.io.IOException;

public class FXMLHelper {
    public FXMLHelper(){

    }

    public static void loadFXML(String FXMLFile, Stage primaryStage, AnchorPane mainLayout) throws IOException {
        javafx.fxml.FXMLLoader loader = new javafx.fxml.FXMLLoader();
        loader.setLocation(GameView.class.getResource(FXMLFile));
        mainLayout = loader.load();
        Scene scene = new Scene(mainLayout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
