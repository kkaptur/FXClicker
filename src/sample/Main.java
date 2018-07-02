package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;


public class Main extends Application {
    static int score=100;


    Parent root;
    @Override
    public void start(Stage primaryStage) throws Exception{
        root = FXMLLoader.load(getClass().getResource("menuFXML.fxml"));
        primaryStage.setTitle("Builder");
        Scene firstScene = new Scene(root,600,400);

        firstScene.getStylesheets().add
                (Main.class.getResource("style.css").toExternalForm());
        primaryStage.setScene(firstScene);
        primaryStage.show();

        //closing threads (timer also)
        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent e) {
                Platform.exit();
                System.exit(0);
            }
        });
    }




    public static int getScore(){
        return score;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
