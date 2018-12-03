package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class RssInput extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("RssScr.fxml"));
        primaryStage.setTitle("Rss 추가");
        primaryStage.setScene(new Scene(root, 805, 495));
        primaryStage.show();
    }


    public static void inputStart() {

        launch();
    }
}
