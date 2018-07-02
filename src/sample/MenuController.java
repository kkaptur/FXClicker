package sample;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;

public class MenuController {

    @FXML
    private AnchorPane rootPane;

    @FXML
    public void startGame() throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("gameFXML.fxml"));
        rootPane.getChildren().setAll(pane);
    }

    public void dispose(ActionEvent actionEvent) {
        Platform.exit();
    }

}



