package sample;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import java.util.Timer;
import java.util.TimerTask;
import java.io.IOException;
import static sample.Score.getScore;
import static sample.Score.income;
import static sample.Score.score;


public class GameController {

    Score gameScore = new Score();
    Timer gameTimer;

    @FXML
    private AnchorPane gamePane;


    @FXML
    public void getBack() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("menuFXML.fxml"));
        gamePane.getChildren().setAll(pane);
        gameTimer.cancel();
    }

    @FXML
    public Label scoreLabel;

    public GameController() {
        gameTimer = new Timer();
        gameTimer.schedule(
                new TimerTask() {
                    @Override
                    public void run() {
                        javafx.application.Platform.runLater(new Runnable() {
                            @Override
                            public void run() {
                                scoreLabel.setText(getScore());
                                score += income;
                                System.out.println(score);
                                System.out.println(income);
                            }
                        });
                    }
                }, 0, 1000);
    }

}